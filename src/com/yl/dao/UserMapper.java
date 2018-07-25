package com.yl.dao;

import com.yl.pojo.User;

public interface UserMapper {
	
	
	//用户注册
	public void registUser(User user);
	
	//用户登录
	public User loginUser(String email);
	
	//用户修改信息
	public void updataUserById(User user);

}
