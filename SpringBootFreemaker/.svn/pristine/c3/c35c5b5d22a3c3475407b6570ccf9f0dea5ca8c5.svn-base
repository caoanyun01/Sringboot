package com.mengke.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mengke.bean.User;

@Controller
@RequestMapping("/admin")
public class DataController {
	
	/**
	 * (进入主界面)<br/>
	 * 方法名：data<br/>
	 * 创建人：曾翔 <br/>
	 * 时间：2017年11月2日-上午10:15:47 <br/>
	 * 手机:18273496162<br/>
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@RequestMapping("/index")
	public String data(){
		return "index";
	}
	/**
	 * 
	 * (进入用户信息页面)<br/>
	 * 方法名：user<br/>
	 * 创建人：曾翔 <br/>
	 * 时间：2017年11月2日-下午5:44:15 <br/>
	 * 手机:18273496162<br/>
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@RequestMapping("/user")
	public String user(){
		return "user/index";
	}
	/**
	 * (退出登录)<br/>
	 * 方法名：exit<br/>
	 * 创建人：曾翔 <br/>
	 * 时间：2017年11月2日-上午10:15:22 <br/>
	 * 手机:18273496162<br/>
	 * @param session
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@RequestMapping("/exit")
	@ResponseBody
	public String exit(HttpSession session){
		session.removeAttribute("user");
		session.invalidate();
		return "success";
	}
}
