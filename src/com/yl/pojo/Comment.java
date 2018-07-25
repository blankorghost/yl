package com.yl.pojo;

import java.sql.Timestamp;

public class Comment {

	private Integer cid;
	private Timestamp cdata;
	private String ccontent;
	private Integer essayid;
	private Integer userid;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Timestamp getTime() {
		return cdata;
	}
	public void setTime(Timestamp cdata) {
		this.cdata = cdata;
	}
	public String getCcontent() {
		return ccontent;
	}
	public void setCcontent(String ccontent) {
		this.ccontent = ccontent;
	}
	public Integer getEssayid() {
		return essayid;
	}
	public void setEssayid(Integer essayid) {
		this.essayid = essayid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Comment [cid=" + cid + ", cdata=" + cdata + ", ccontent=" + ccontent + ", essayid=" + essayid
				+ ", userid=" + userid + "]";
	}
	
}
