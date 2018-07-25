package com.yl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yl.dao.EssayMapper;
import com.yl.pojo.Essay;

/**
 * 文章信息
 * @author ghost
 *
 */
@Service
public class EssayServiceImpl implements EssayService{

	@Autowired
	private EssayMapper essayMapper;
	
	//得到所有文章
	public List<Essay> selectEssaysList(){
		return essayMapper.selectEssay();
	}
	
	//通过userid查询文章
	public List<Essay> queryEssayByuserid(Integer userid){
		return essayMapper.queryEssayByUserid(userid);
	}
	
	//通过essayid查询文章
	public Essay queryEssayByessayid(Integer essayid){
		return essayMapper.queryEssayByEssayid(essayid);
	}
	
	//写文章
	public void writeEssay(Essay essay){
		essayMapper.writeEssay(essay);
	}
	//模糊查询文章
	public List<Essay> queryEssayByString(String str){
		return essayMapper.queryEssayByString(str);
	}
}
