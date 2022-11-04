package com.loacustom.web.main.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loacustom.web.main.mapper.MainMapper;

@Service
public class MainService {
	
	@Autowired
	private MainMapper mainMapper;

	public List<Map<String, Object>> selectMainInfo() {
		return mainMapper.selectMainInfo();
	}
}
