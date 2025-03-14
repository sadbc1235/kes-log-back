package com.kesLogBack.menu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kesLogBack.menu.mapper.MenuMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MenuService {
	
	@Autowired
	final MenuMapper menuMapper = null;
	
	public String select1() {
		String result = "";
		try {
			result = menuMapper.select1();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
