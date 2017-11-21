package com.mengke.web.cookie2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/coolie")
public class CookieController2 {
	@RequestMapping("/{pathname}")
	public String exam(@PathVariable("pathname")String pathname){
		return "cookie2/"+pathname;
	}
}