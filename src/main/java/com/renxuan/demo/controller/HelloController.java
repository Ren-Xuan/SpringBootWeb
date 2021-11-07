package com.renxuan.demo.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}

	//其他的都自动配置好了
	//eg.查出一些数据展示
	@RequestMapping("/success")
	public String success(Map<String, Object> map) {

        map.put("hello","<h1>壬玄</h1>");
        map.put("users",Arrays.asList("zhangsan","lisi","wangwu"));

		return "success";
	}
	
	
}
