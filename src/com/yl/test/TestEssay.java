package com.yl.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yl.dao.CommentMapper;
import com.yl.dao.EssayMapper;
import com.yl.pojo.Comment;
import com.yl.pojo.Essay;
import com.yl.service.EssayServiceImpl;


public class TestEssay {
	
	@Autowired
	private EssayServiceImpl essayServiceImpl;
	
  
	@Test
	public void essayList(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		CommentMapper commentMapper = ac.getBean(CommentMapper.class);
		List<Comment> commentList = new ArrayList<Comment>();
		commentList = commentMapper.queryByUserid(1);
		System.out.println(commentList);
	}

}
