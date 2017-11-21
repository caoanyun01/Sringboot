package com.mengke.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mengke.bean.User;
import com.mengke.mapper.user.IUsermapper;

@Controller
public class IndexController {
	
	@Autowired
	private IUsermapper iUsermapper;
	/**
	 * 
	 * (登录)<br/>
	 * 方法名：login<br/>
	 * 创建人：曾翔 <br/>
	 * 时间：2017年11月2日-上午10:17:19 <br/>
	 * 手机:18273496162<br/>
	 * @param session
	 * @param user
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@RequestMapping("/login")
	@ResponseBody
	public String login(HttpSession session,User user){
		User user2=iUsermapper.user(user);
		if(user2!=null){
			session.setAttribute("user", user2);
			return "success";
		}else{
			return "fail";
		}
	}
	/**
	 * 
	 * (进入登录页面)<br/>
	 * 方法名：login1<br/>
	 * 创建人：曾翔 <br/>
	 * 时间：2017年11月2日-上午10:17:33 <br/>
	 * 手机:18273496162<br/>
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@RequestMapping("/logins")
	public String login1(){
		return "login";
	}
}