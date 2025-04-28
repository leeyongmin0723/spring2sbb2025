package com.sg.ai;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	@ResponseBody
	public String hellow() {
		return "안녕하세요, sbb 처음 페이지 입니다";
	}
}