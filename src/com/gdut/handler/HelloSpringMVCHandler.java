package com.gdut.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringMVCHandler {
	@RequestMapping("")
	public String index() {
		int x = 10;
		return "index";
	}
	@RequestMapping("/my/Handler")
	public String welcome() {
		// test for comment
		return "success";
	}
}
