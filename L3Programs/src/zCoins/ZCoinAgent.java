package zCoins;

import java.io.*;
import java.util.*;
class ZCoinAgent{
	BufferedReader br;
	Scanner s;
	ArrayList<ZCoinUser> userRequest;
	ArrayList<String> zid;
	String name,email,passWord;
	int ratio;
	ZCoinAgent(String iname,String iemail,String pw){
		userRequest=new ArrayList<ZCoinUser>();
		zid=new ArrayList<String>();
		name=iname;
		email=iemail;
		passWord=pw;
		br=new BufferedReader(new InputStreamReader(System.in));
		s=new Scanner(System.in);
		ratio=0;
	}
	void requset(ZCoinUser u){
		for(int i=0;i<userRequest.size();i++){
			ZCoinUser z=userRequest.get(i);
			if(z==u){
				break;
			}
			if(i==userRequest.size()-1)userRequest.add(u);
		}
	}
	void showRequest(){
		try{
			System.out.println("---Here Is The Requseter's List---");
			for(int i=0;i<userRequest.size();i++){
				ZCoinUser z=userRequest.get(i);
				System.out.println("User Name : "+z.name+"\nE mail : "+z.email+"\nMobile Number : "+z.mobileNo);
				System.out.println("Type As \"APPROVE\" To Approve His Requset...\nType As \"REJECT\" To Reject His Request");
				String s1=br.readLine();
				if(s1.equals("APPROVE")){
					Random r=new Random();
					int x=r.nextInt(10000);
					x=x>0?x:-x;
					String s2="ZID"+x;
					z.ZId=s2;
					userRequest.remove(i);
				}
				else if(s1.equals("REJECT")){
					userRequest.remove(i);
				}
			}
			System.out.println("===============================");
		}
		catch(Exception e){}
	}
	void showTransactions(ZCoin zco){
		for(int i=0;i<zid.size();i++){
			String s1=zid.get(i);
			for(int j=0;j<zco.zcoinUser.size();j++){
				ZCoinUser zc=zco.zcoinUser.get(j);
				if(s1.equals(zc.ZId)){
					System.out.println("----Transaction Details Of "+s1+" Is ----");
					for(int k=0;k<zc.transaction.size();k++){
						System.out.println(zc.transaction.get(k));
					}
					System.out.println("----End Of The Transaction----");
					System.out.println();
					break;
				}
			}			
		}
	}
	void setRcToZcoin(){
		System.out.println("Enter RC ");
		int k1=s.nextInt();
		System.out.println("Enter Equivalent ZCoin ");
		int k2=s.nextInt();
		int k=k2/k1;
		ratio=k;
	}
}

