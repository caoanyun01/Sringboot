package com.mengke.web.calss;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class CalssController {
	
	@RequestMapping("/calss")
	public String calss(){
		return "myworkes/calss";
	}
}
