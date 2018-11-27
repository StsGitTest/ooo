package com.ysd.ooo.entity;
/**
 * 用户实体类
 * @author 爱新觉罗
 *
 */
public class User {

	private int id;
	private String username;
	private String userpassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", userpassword=" + userpassword + "]";
	}
	public User(int id, String username, String userpassword) {
		super();
		this.id = id;
		this.username = username;
		this.userpassword = userpassword;
	}
	public User() {
		super();
	}
	
	
}
