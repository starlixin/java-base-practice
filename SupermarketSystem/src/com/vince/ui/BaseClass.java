package com.vince.ui;

import java.util.ResourceBundle;
import java.util.Scanner;

import com.vince.bean.User;

public class BaseClass {

	protected static Scanner input =new Scanner(System.in); 

	protected static User currUser;//��ǰ�û�����
	
	private static ResourceBundle r=     //���ļ�
			ResourceBundle.getBundle("com.vince.res.r_temp");
	public static String getString(String key){
		return r.getString(key);
	}
	public static void println(String s){
		System.out.println(s);
	}
}
