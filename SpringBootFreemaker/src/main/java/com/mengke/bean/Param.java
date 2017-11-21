package com.mengke.bean;

/**
 * 
 * 参数类 Param<br/>
 * 创建人:xiaojian<br/>
 * 时间：2017年11月4日-下午4:44:00 <br/>
 * 
 * @version 1.0.0<br/>
 *
 */
public class Param {
	private Integer pageNo = 0;
	private Integer pageSize = 5;

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
