package com.mengke.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import com.mengke.bean.User;
/**
 * 用户ID全局化
 * BaseController<br/>
 * 创建人:曾翔<br/>
 * 时间：2017年11月7日-下午6:28:17 <br/>
 * @version 1.0.0<br/>
 *
 */
public class BaseController {
	@Autowired
	private HttpServletRequest request;
	
	public Integer getUserId(){
		User user=(User) request.getSession().getAttribute("user");
		return user.getId();
	}
	public User getUser(){
		User user=(User) request.getSession().getAttribute("user");
		return user;
	}
}
