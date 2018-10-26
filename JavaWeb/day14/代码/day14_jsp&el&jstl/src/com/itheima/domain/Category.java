package com.itheima.domain;

public class Category {
	private String cid; // 类别编号
	private String cname;// 类别名称

	public Category() {
		super();
	}
	
	public Category(String cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}



	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Category [cid=" + cid + ", cname=" + cname + "]";
	}

}
