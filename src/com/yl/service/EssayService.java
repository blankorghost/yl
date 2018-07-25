package com.yl.service;

import java.util.List;

import com.yl.pojo.Essay;

public interface EssayService {

	//得到所有文章
	public List<Essay> selectEssaysList();
	
	//通过userid查询文章
	public List<Essay> queryEssayByuserid(Integer userid);
	
	
	//通过essayid查询文章
	public Essay queryEssayByessayid(Integer essayid);
	
	//写文章
	public void writeEssay(Essay essay);
	//模糊查询文章
	public List<Essay> queryEssayByString(String str);
}
