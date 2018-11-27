package com.ysd.ooo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysd.ooo.dao.UserDao;
import com.ysd.ooo.entity.User;
import com.ysd.ooo.service.UserService;

@Service
public class UserServiceimpl implements UserService {

	@Autowired
	UserDao userdao;

	@Override
	public User selectuser(String username) {
		// TODO Auto-generated method stub
		return userdao.selectuser(username);
	}

}
