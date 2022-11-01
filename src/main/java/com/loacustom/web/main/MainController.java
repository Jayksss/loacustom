package com.loacustom.web.main;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	//log 선언
	public final Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/main")
	public String main(Model model) {
		
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: Start ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		System.out.println(formatter.format(date) + " >>> 메인페이지 연결확인");
		
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: End ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		return "content/main";
	}
}
