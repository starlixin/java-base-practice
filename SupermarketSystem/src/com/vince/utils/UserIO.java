package com.vince.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.vince.bean.User;

public class UserIO {

	private static List<User> users= new ArrayList<User>();
	private static final String USER_FILE="user.obj";
	
	//写入用户列表
	public boolean writeUsers(){
		try {
			ObjectOutputStream out =new ObjectOutputStream(
					new FileOutputStream(USER_FILE));
			out.writeObject(users);
			out.close();
			return true;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//读取用户列表
	public boolean readUsers(){
		try {
			ObjectInputStream in =new ObjectInputStream(
					new FileInputStream(USER_FILE));
			users = (List<User>) in.readObject();
			in.close();
			return true;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	//添加用户
	public void add(User user){
		user.setId (users.size()+1);
		users.add(user);
	}
	
}
