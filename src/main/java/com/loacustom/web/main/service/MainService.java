package com.loacustom.web.main.service;

import com.loacustom.web.main.mapper.MainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MainService {
	
	@Autowired
	private MainMapper mainMapper;

	public List<Map<String, Object>> selectMainInfo() {
		return mainMapper.selectMainInfo();
	}
}
