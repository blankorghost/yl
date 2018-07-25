package com.yl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yl.dao.CommentMapper;
import com.yl.pojo.Comment;

/**
 * 评论管理
 * @author ghost
 *
 */
@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	CommentMapper commentMapper;
	
	//写评论
	public void writeComment(Comment comment){
		commentMapper.writeComment(comment);
	}
	
	//通过userid查询评论
	public List<Comment> queryByUserid(Integer userid){
		return commentMapper.queryByUserid(userid);
	}
		
	//通过essayid查询评论
	public List<Comment> queryByEssayid(Integer essayid){
		return commentMapper.queryByEssayid(essayid);
	}
}
