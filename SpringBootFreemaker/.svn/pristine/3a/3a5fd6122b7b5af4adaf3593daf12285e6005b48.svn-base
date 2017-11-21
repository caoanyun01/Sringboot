package com.mengke.code;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;
/**
 * 关于获取服务器根目录
 * BasePathExposer<br/>
 * 创建人:曾翔<br/>
 * 时间：2017年11月2日-上午10:24:22 <br/>
 * @version 1.0.0<br/>
 */
@Component
public class BasePathExposer implements ServletContextAware{
	
	private ServletContext servlerContext;
	@Value("${zx.basePath}")
	private String basePath;
	
	public void init(){
		servlerContext.setAttribute("basePath", basePath);
	}
	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servlerContext=servletContext;
		
	}

}
