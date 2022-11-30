package com.loacustom.web.sample.controller;

import com.loacustom.web.main.service.MainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class SampleController {
	
	//log 선언
	public final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private MainService mainService;
	
	@GetMapping("/DB-CONNECT-TEST")
	@ResponseBody
	public List<Map<String, Object>> dbConnectTest(Model model) {
		return mainService.selectMainInfo();
	}
}
