package cn.zj.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}
	
	
	@RequestMapping("/welcome")
	public String welcome() {
		System.out.println("哈哈哈");
		return "welcome";
	}
}
