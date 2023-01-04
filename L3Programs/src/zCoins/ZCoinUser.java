package zCoins;

import java.util.*;
class ZCoinUser{
	String name,email,mobileNo,H_Id,passWord,ZId;
	int RC,Zcoin;
	ArrayList<String>transaction;
	ZCoinUser(String in,String iemail,String imobile,String id,String pw,int dep){
		name=in;
		email=iemail;
		mobileNo=imobile;
		H_Id=id;
		passWord=pw;
		RC=dep;
		Zcoin=0;
		ZId=null;
		transaction=new ArrayList<String>();
	}
	void accountDetails(){
		System.out.println("Name : "+name+"\nemail : "+email+"\nMobile Number : "+mobileNo+"\nPassword : "+passWord+
				"\nZID : "+ZId);
		System.out.println("RC and ZCoin Wallet ");
		System.out.println("RC Is Rs. "+RC);
		System.out.println("ZCoin : "+Zcoin);
	}
	void seeTransaction(){
		for(int i=0;i<transaction.size();i++){
			System.out.println(transaction.get(i));
		}
	}
}

