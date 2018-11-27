package com.ysd.ooo.dao;

import org.apache.ibatis.annotations.Param;

import com.ysd.ooo.entity.User;

/**
 * 用户dao层
 * 
 * @author 爱新觉罗
 *
 */
public interface UserDao {

	/**
	 * 登陆
	 */
	public User selectuser(@Param("username")String username) ;

}
