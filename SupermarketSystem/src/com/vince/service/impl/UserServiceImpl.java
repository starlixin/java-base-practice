package com.vince.service.impl;

import com.vince.bean.User;
import com.vince.service.UserService;
import com.vince.utils.BusinessException;
import com.vince.utils.UserIO;

public class UserServiceImpl implements UserService {

	@Override
	public User register(User user) throws BusinessException {
		// TODO Auto-generated method stub
		UserIO userIO =new UserIO();
		userIO.add(user);
		userIO.writeUsers();
		return user;
		
	}

}
