package com.gdut.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringMVCHandler {
	@RequestMapping("")
	public String index() {
		return "index";
	}
	@RequestMapping("/my/Handler")
	public String welcome() {
		return "success";
	}
}
