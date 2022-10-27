package com.loacustom.web.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/main")
	public String main() { 
		System.out.println("컨트롤러 확인");
		return "10월 27일 프로젝트 생성";
	}
}
