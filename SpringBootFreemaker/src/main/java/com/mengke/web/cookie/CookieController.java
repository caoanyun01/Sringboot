package com.mengke.web.cookie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam")
public class CookieController {
	@RequestMapping("/{pathname}")
	public String exam(@PathVariable("pathname")String pathname){
		return "cookie/"+pathname;
	}
}
