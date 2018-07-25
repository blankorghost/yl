package com.yl.dao;

import java.util.List;

import com.yl.pojo.Essay;

public interface EssayMapper {

	//文章列表
	List<Essay> selectEssay();
	
	//通过userid查询文章
	List<Essay> queryEssayByUserid(Integer userid);
	
	//通过essayid查询文章
	Essay queryEssayByEssayid(Integer essayid);
	
	//写文章
	public void writeEssay(Essay essay);
	
	//模糊查询文章
	List<Essay> queryEssayByString(String str);

}
