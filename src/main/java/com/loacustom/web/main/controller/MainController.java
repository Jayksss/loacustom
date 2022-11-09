package com.loacustom.web.main.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.loacustom.web.main.service.MainService;

@Controller
@RequestMapping("/")
public class MainController {
	
	//log 선언
	public final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private MainService mainService;
	
	@GetMapping("/index")
	public String index() {
		
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: Start ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: End ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		return "content/index";
	}

	@GetMapping("/main")
	public String main(Model model) {
		
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: Start ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		System.out.println(formatter.format(date) + " >>> 메인페이지 연결확인");
		
		System.out.println(formatter.format(date) + " >>> 테스트쿼리");
		List<Map<String, Object>> list = mainService.selectMainInfo();
		logger.info("결과 >>> {}", list);
		
		model.addAttribute("list", list);
		
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: End ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		return "content/main";
	}
	
	@GetMapping("/ajaxTest")
	@ResponseBody
	public List<Map<String, Object>> ajaxTest(Model model) {
		return mainService.selectMainInfo();
	}
}
