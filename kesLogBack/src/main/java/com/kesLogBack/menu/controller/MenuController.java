package com.kesLogBack.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kesLogBack.menu.service.MenuService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MenuController {
	@Autowired
	final MenuService menuService = null;
	
	@PostMapping("/mybatis/test")
	public String select1(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		String result = "";
		try {
			result = menuService.select1();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}
}
