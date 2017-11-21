package com.mengke.bean;
/**
 * 
 * 参数类
 * Params<br/>
 * 创建人:WXQ<br/>
 * 时间：2017年11月6日-上午8:35:37 <br/>
 * @version 1.0.0<br/>
 *
 */
public class Params {
	private Integer pageNo=0;
	private Integer pageSize=5;
	private Integer status; // 状态
	private Integer categoryId; // 分类id
	private Integer userId;// 用户id
	public Params() {
		super();
	}
	public Params(Integer pageNo, Integer pageSize, Integer status, Integer categoryId, Integer userId) {
		super();
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.status = status;
		this.categoryId = categoryId;
		this.userId = userId;
	}
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
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}
