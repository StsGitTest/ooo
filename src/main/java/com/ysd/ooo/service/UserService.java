package com.ysd.ooo.service;

import com.ysd.ooo.entity.User;

public interface UserService {
	
	/**
	 * 登陆
	 */
	public User selectuser(String username);
}
