package com.yl.controller;

import static com.views.util.viewsUtils.messd;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yl.pojo.Comment;
import com.yl.pojo.Essay;
import com.yl.pojo.User;
import com.yl.service.EssayServiceImpl;
import com.yl.service.UserServiceImpl;

/**
 * 用户管理
 * @author ghost
 *
 */
@Controller
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;
	
	
	//注册用户
	@RequestMapping("/regist.action")
	public String registUser(User user){
		
		try{
			String encodeStr = messd(user.getPassword());   //密码加密
	        user.setPassword(encodeStr);
	        user.setUserphoto("user_photo.jpg");
	        user.setRegistTime(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		}catch (Exception e) {
            throw new RuntimeException(e);
		}
		userServiceImpl.registUser(user);
		return "/yl/login.html";
	}
	
	//用户登录
	@RequestMapping("/login.action")
	public String userLogin(String email,String password,ModelMap map){
		User usercheck = new User();
		usercheck = userServiceImpl.loginUser(email);
        try {
            String encodeStr = messd(password);
           
            if (usercheck.getPassword().equals(encodeStr)) {
            	map.addAttribute("user", usercheck);
                return "index.html?user="+usercheck;
            } else {
                return "/yl/error.html";
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
	}
	
	//修改用户信息
	@RequestMapping("/updata.action")
	public void updataUser(User user){
		userServiceImpl.updataUserById(user);
	}
}
