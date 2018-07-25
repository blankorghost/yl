package com.yl.pojo;

import java.sql.Timestamp;

public class Essay {

	private Integer userid;
	private Integer essayid;
	private String essayname;
	private String text;
	private Timestamp time;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getEssayid() {
		return essayid;
	}
	public void setEssayid(Integer essayid) {
		this.essayid = essayid;
	}
	public String getEssayname() {
		return essayname;
	}
	public void setEssayname(String essayname) {
		this.essayname = essayname;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Essay [userid=" + userid + ", essayid=" + essayid + ", essayname=" + essayname + ", text=" + text
				+ ", time=" + time + "]";
	}
	
	
}
