package com.yl.controller;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yl.pojo.Comment;
import com.yl.service.CommentServiceImpl;

/**
 * 评论管理
 * @author ghost
 *
 */
@Controller
public class CommentController {

	@Autowired
	private CommentServiceImpl commentServiceImpl;
	
	//写评论
	@RequestMapping(value = "/writeComment.action")
	public @ResponseBody Comment writeComment(Comment comment){
		comment.setTime(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		commentServiceImpl.writeComment(comment);
		return comment;
	}
	
	//通过userid查询评论
	
	@ResponseBody
	@RequestMapping(value = "/queryByUserid.acion")
	public List<Comment> queryByUserid(Integer userid){
		List<Comment> commentList = commentServiceImpl.queryByUserid(userid);
		return commentList;
	}
	
	//通过essayid查询评论
	@ResponseBody
	@RequestMapping(value = "/queryCommentByEssayid.action")
	public List<Comment> queryByEssayid(Integer essayid){
		List<Comment> commentList = commentServiceImpl.queryByEssayid(essayid);
		return commentList;
	}
}
