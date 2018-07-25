package com.yl.dao;

import java.util.List;

import com.yl.pojo.Comment;

public interface CommentMapper {

	//写评论
	public void writeComment(Comment comment);
	
	//通过userid查询评论
	public List<Comment> queryByUserid(Integer userid);
	
	//通过essayid查询评论
	public List<Comment> queryByEssayid(Integer essayid);
}
