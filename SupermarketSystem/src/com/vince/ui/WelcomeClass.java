package com.vince.ui;

public class WelcomeClass extends BaseClass{

	public void start(){
		println(getString("info.welcome"));
		boolean flag=true;
		while(flag){
			println(getString("info.login.reg"));
			println(getString("info.select"));
			String select =input.nextLine();
//			if("1"==select){
//				flag =false;
//				println("��¼");
//			}else if(select.equals("2")){
//				flag = false;
//				println("ע��");
//				new RegisterClass().register();
//			}else{
//				println(getString("input.error"));
//			}
			switch (select){
			case "1":
				flag =false;
				println("��¼");
				break;
			case "2":
				flag = false;
				println("ע��");
				new RegisterClass().register();
				break;
			default:
				println(getString("input.error"));
				break;
			}
		}
		
		
	}
}
