package com.mengke.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.mengke.bean.User;

/**
 * 拦截器
 * LoginInteceptor<br/>
 * 创建人:曾翔<br/>
 * 时间：2017年11月2日-上午10:24:53 <br/>
 * @version 1.0.0<br/>
 *
 */
public class LoginInteceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		User user = (User) request.getSession().getAttribute("user");
		if(user==null){
			response.sendRedirect(request.getContextPath()+"/logins");
			return false;
		}else{
			return true;
		}
	}

}
