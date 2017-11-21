package com.mengke.bean;

import java.util.Date;

/**
 * 分类 Category<br/>
 * 创建人:wangziao<br/>
 * 时间：2017年11月3日-上午9:21:16 <br/>
 * 
 * @version 1.0.0<br/>
 *
 */
public class Category {
	private Integer id;
	private String name; // 名字
	private Date createTime; // 创建时间
	private Integer status; // 状态

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
