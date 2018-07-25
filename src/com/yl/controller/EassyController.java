package com.yl.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yl.pojo.Essay;
import com.yl.service.EssayServiceImpl;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 文章管理
 * @author ghost
 *
 */
@Controller
public class EassyController {
	
	
	@Autowired
	private EssayServiceImpl essayServiceImpl;
	
	//json数据交互 显示文章列表
	@ResponseBody
	@RequestMapping(value = "/EssayList.action")
	public List<Essay> queryEssay() throws IOException{
		List<Essay> essayList = new ArrayList<Essay>();
		essayList = essayServiceImpl.selectEssaysList();
		return essayList;
	}
		
	//通过文章id查询文章进入文章详情页
	@RequestMapping(value = "/essay.action") 
	@ResponseBody
	public Essay queryEssayByessayid(Integer essayid){
		Essay essay = essayServiceImpl.queryEssayByessayid(essayid);
		return essay;
	}
	
	//写文章
	@RequestMapping(value = "/writeEssay.action")
	public String writeEssay(Essay essay){
		essayServiceImpl.writeEssay(essay);
		return "/yl/essay.html?essayid="+essay.getEssayid();
	}

	//模糊查询文章
	@RequestMapping(value = "/essaylike.action") 
	@ResponseBody
	public List<Essay> queryEssayByString(String key){
		List<Essay> essayList = new ArrayList<Essay>();
		essayList = essayServiceImpl.queryEssayByString(key);
		return essayList;	
	}	
	//获得我的文章
	@ResponseBody
	@RequestMapping(value = "/myEssay.action")
	public List<Essay> getEssay(Integer userid){
		List<Essay> essayList = new ArrayList<Essay>();
		essayList = essayServiceImpl.queryEssayByuserid(userid);
		return essayList;
	}	

}
