package zCoins;

import java.io.*;
import java.util.*;
class ZCoin{
	ZCoinAgent agent;
	ArrayList<ZCoinUser> zcoinUser;
	BufferedReader br;
	Scanner s;
	ZCoin(){
		br=new BufferedReader(new InputStreamReader(System.in));
		s=new Scanner(System.in);
		agent=null;
		zcoinUser=new ArrayList<ZCoinUser> ();
	}
	void userAccountCreate(){
		try{
			System.out.println("Enter Your Name ");
			String s1=br.readLine();
			System.out.println("Enter Your email ");
			String s2=br.readLine();
			boolean b=true;
			System.out.println("Enter Your Mobile Number ");
			String s3=br.readLine();
			System.out.println("Enter Your Password");
			System.out.println("Your password Must Contain Alphanumeric Chacracters \nand Speial Chacarcters like !#%><?&*");
			System.out.println("Password Must Not Be Less Than 8 Characters");
			String s4=null;
			//while(b){
			s4=br.readLine();
			/*if(Pattern.matches("[a-zA-Z0-9]{5,}[!#%><?&*]{3}",s4)){
				System.out.println("Password Created Successfully");b=false;
			}
			else {System.out.println("Enter Your Password");}
			}*/
			Random r=new Random();
			int j=r.nextInt(10000);
			j=j>0?j:-j;
			String s5="H_ID"+j;
			System.out.println("Your H_ID is "+s5);
			System.out.println("Enter Your Initial Deposit");
			int k=s.nextInt();
			ZCoinUser user=new ZCoinUser(s1,s2,s3,s5,s4,k);
			zcoinUser.add(user);
		}
		catch(Exception e){}
	}
	void userLogIn(){
		try{
			boolean b=true;
			System.out.println("Enter Your email Id ");
			String s1=br.readLine();
			System.out.println("Enter Your Password");
			String s2=br.readLine();
			for(int i=0;i<zcoinUser.size();i++){
				ZCoinUser us=zcoinUser.get(i);
				if(us.email.equals(s1)&&us.passWord.equals(s2)){
					System.out.println("Your Requset Has Been Sent To ZE");
					agent.userRequest.add(us);b=false;
					break;
				}
			}
			if(b)System.out.println("Your Account Cannot Be Found .... So You Cannot Make A Requset To ZE");
		}
		catch(Exception e){}
	}
	void acceptOrReject(){
		try{
			System.out.println("Enter Your email Id ");
			String s1=br.readLine();
			System.out.println("Enter Your Password");
			String s2=br.readLine();boolean b=true;
			for(int i=0;i<zcoinUser.size();i++){
				ZCoinUser us=zcoinUser.get(i);
				if(us.email.equals(s1)&&us.passWord.equals(s2)){
					if(us.ZId!=null){
						System.out.println("Your Account Has Been Approved By ZE");
						System.out.println("Your ZID is "+us.ZId);
					}
					else System.out.println("Sorry....Your Request Has Been Rejected By ZE");
					b=false;
					break;
				}
			}
			if(b)System.out.println("Your Account Cannot Be Found ");
		}
		catch(Exception e){}
	}
	void togetRcToZcoin(){
		System.out.println("RC To ZCoin Ratio Is "+agent.ratio);
		System.out.println("100 RC Is Equals To "+(100*agent.ratio)+" ZCoin");
	}
	void toBuyZcoin(){
		try{
			System.out.println("Enter Your ZID ");
			String s1=br.readLine();boolean b=true;
			for(int i=0;i<zcoinUser.size();i++){
				ZCoinUser us=zcoinUser.get(i);
				if(us.ZId.equals(s1)){
					System.out.println("Your RC Balance is "+us.RC);
					System.out.println("Enter The Amount Of RC You Wish To Convert To ZCoin ");
					int k=s.nextInt();
					us.RC=us.RC-k;
					us.Zcoin=us.Zcoin+(k*agent.ratio);
					System.out.println("RC To ZCoin Converted Successfully");b=false;break;
				}
			}
			if(b)System.out.println("Sorry....Your Account Cannot Be Found");
		}
		catch(Exception e){}
	}
	void getAccount(){
		try{
			System.out.println("Enter Your ZID ");
			String s1=br.readLine();boolean b=true;
			for(int i=0;i<zcoinUser.size();i++){
				ZCoinUser us=zcoinUser.get(i);
				if(us.ZId.equals(s1)){
					us.accountDetails();
					b=false;break;
				}
			}
			if(b)System.out.println("Sorry....Your Account Cannot Be Found");
		}
		catch(Exception e){}
	}
	void getTransaction(){
		try{
			System.out.println("Enter Your ZID ");
			String s1=br.readLine();boolean b=true;
			for(int i=0;i<zcoinUser.size();i++){
				ZCoinUser us=zcoinUser.get(i);
				if(us.ZId.equals(s1)){
					us.seeTransaction();
					b=false;break;
				}
			}
			if(b)System.out.println("Sorry....Your Account Cannot Be Found");
		}
		catch(Exception e){}
	}
	void transaction(){
		try{
			System.out.println("Enter Your ZID ");
			String ss=br.readLine();
			ZCoinUser sender=null;boolean flag=false;
			for(int i=0;i<zcoinUser.size();i++){
				sender=zcoinUser.get(i);
				if(sender.ZId.equals(ss)){
					flag=true;
					break;
				}
			}
			if(!flag)System.out.println("Sorry....Your Account Cannot Be Found");
			if(flag){
				System.out.println("Enter ZID to Which You Want To Transfer RC or ZCoin");
				String s1=br.readLine();boolean b=true;
				System.out.println("Enter 1 to Transfer RC ");
				System.out.println("Enter 2 to Transfer ZCoin");
				int i=s.nextInt();
				switch(i){
				case 1:
					System.out.println("Enter The Amount Of RC You Are Going To Transfer ");
					int k=s.nextInt();
					sender.RC=sender.RC-k;
					for(int ii=0;i<zcoinUser.size();ii++){
						ZCoinUser us=zcoinUser.get(ii);
						if(us.ZId.equals(s1)){
							us.RC=us.RC+k;
							String res="To "+s1+"  "+"RC TRansferred Is "+k;
							sender.transaction.add(res);
							agent.zid.add(ss);
							b=false;break;
						}
					}
					if(b)System.out.println("Sorry....ZID  Cannot Be Found");
					break;
				case 2:
					System.out.println("Enter The Amount Of ZCoin You Are Going To Transfer ");
					int k1=s.nextInt();
					sender.Zcoin=sender.Zcoin-k1;
					for(int i1=0;i1<zcoinUser.size();i1++){
						ZCoinUser us=zcoinUser.get(i);
						if(us.ZId.equals(s1)){
							us.Zcoin=us.Zcoin+k1;
							String res1="ZID : "+s1+"  "+"ZCoin TRansferred Is "+k1;
							sender.transaction.add(res1);
							b=false;break;
						}
					}
					if(b)System.out.println("Sorry....ZID  Cannot Be Found");
					break;
				}
			}
		}
		catch(Exception e){}
	}	
	void agentLogIn(){
		try{
			System.out.println("Enter Your email Id And Password");
			String s1=br.readLine();
			String s2=br.readLine();boolean b=true;
			ZCoinAgent a=new ZCoinAgent("Siva Shankar","sivashankar1819@gmail.com","3004");
			if(s1.equals(a.email)&&s2.equals(a.passWord)){
				System.out.println("Log In Successfully");
				b=false;agent=a;
			}
			if(b)System.out.println("Your Account Not Found..");
		}
		catch(Exception e){}
	}
	void depositRc(){
		try{
			System.out.println("Enter Your ZID ");
			String s1=br.readLine();boolean b=true;
			for(int i=0;i<zcoinUser.size();i++){
				ZCoinUser us=zcoinUser.get(i);
				if(us.ZId.equals(s1)){
					System.out.println("Enter The Amount Of RC ");
					int c=s.nextInt();
					us.RC=us.RC+c;
					b=false;break;
				}
			}
			if(b)System.out.println("Sorry....Your Account Cannot Be Found");
		}
		catch(Exception e){}
	}
	void withDraw(){
		try{
			System.out.println("Enter Your ZID ");
			String s1=br.readLine();boolean b=true;
			for(int i=0;i<zcoinUser.size();i++){
				ZCoinUser us=zcoinUser.get(i);
				if(us.ZId.equals(s1)){
					System.out.println("Enter The Amount Of ZCoin You Want");
					int c=s.nextInt();
					us.Zcoin=us.Zcoin-c;
					int k=c/agent.ratio;
					int comission=(int)0.15*k/100;
					k-=comission;
					System.out.println("You Have Successfully WithDrawn "+k);
					b=false;break;
				}
			}
			if(b)System.out.println("Sorry....Your Account Cannot Be Found");
		}
		catch(Exception e){}
	}

	public static void main(String args[]){
		int i=0;
		ZCoin z=new ZCoin();
		Scanner scn=new Scanner(System.in);
		do{
			System.out.println("Enter 1 If You Are An Agent(ZE)");
			System.out.println("Enter 2 If You Are A User");
			i=scn.nextInt();
			switch(i){
			case 1:
				System.out.println("Enter 1 To LogIn ");
				System.out.println("Enter 2 To See Request Of Users");
				System.out.println("Enter 3 To See Transactions Of Users");
				System.out.println("Enter 4 To Set ZCoin Value");
				int y=scn.nextInt();
				switch(y){
				case 1:
					z.agentLogIn();
					break;
				case 2:
					z.agent.showRequest();
					break;
				case 3:
					z.agent.showTransactions(z);
					break;
				case 4:
					z.agent.setRcToZcoin();
					break;
				}
				break;
			case 2:
				System.out.println("Enter 1 To Create Account");
				System.out.println("Enter 2 To LogIn To Your Account");
				System.out.println("Enter 3 To Transaction");
				System.out.println("Enter 4 To Buy ZCoin");
				System.out.println("Enter 5 To Get RC To ZCoin Ratio");
				System.out.println("Enter 6 To See Account Approval");
				System.out.println("Enter 7 To Get Account Details");
				System.out.println("Enter 8 To Get Transaction Details"); 
				System.out.println("Enter 9 To Deposit RC ");
				System.out.println("Enter 10 To WithDraw ZCoin To RC");
				System.out.println("Enter 0 To EXIT");
				int x=scn.nextInt();
				switch(x){
				case 1:
					z.userAccountCreate();
					break;
				case 2:
					z.userLogIn();
					break;
				case 3:
					z.transaction();
					break;
				case 4:
					z.toBuyZcoin();
					break;
				case 5:
					z.togetRcToZcoin();
					break;
				case 6:
					z.acceptOrReject();
					break;
				case 7:
					z.getAccount();
					break;
				case 8:
					z.getTransaction();
					break;
				case 9:
					z.depositRc();
					break;
				case 10:
					z.withDraw();
					break;
				case 0:
					i=0;
					break;
				}
				break;
			}
		}while(i!=0);
		System.out.println("---**** THANK YOU ****----");
	}
}
