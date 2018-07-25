package com.yl.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yl.dao.UserMapper;
import com.yl.pojo.User;
/**
 * 用户操作
 * @author ghost
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;
	
	//用户注册
	public void registUser(User user) {
		userMapper.registUser(user);
	}
	
	//用户登录
	public User loginUser(String email) {
		return userMapper.loginUser(email);
    }
	
	//用户修改信息
	public void updataUserById(User user){
		userMapper.updataUserById(user);
	}

}
