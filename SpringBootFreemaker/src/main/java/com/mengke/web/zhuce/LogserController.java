package com.mengke.web.zhuce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogserController {
	@RequestMapping("/logser")
	public String reg(){
		return "zhuce/logser";
	}
}
