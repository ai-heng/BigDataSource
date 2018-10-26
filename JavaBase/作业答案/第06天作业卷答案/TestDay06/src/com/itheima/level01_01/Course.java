package com.itheima.level01_01;
/*
 *  * Course(课程类)
 * 		课程编号	名称		创建时间		课程描述
 * 		id		name	createtime	desc
 * 		提供构造方法与get、set方法
 * 
		s001	Java	2007-02-08	Java学科，包含JavaSE和JavaEE
		s002	IOS		2007-02-09	IOS系统开发
 */
public class Course {
	private String id;
	private String name;
	private String createtime;
	private String desc;
	//提供构造方法与get、set方法
	public Course() {
		super();
	}
	public Course(String id, String name, String createtime, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.createtime = createtime;
		this.desc = desc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
