package com.kesLogBack.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kesLogBack.common.model.ComResult;
import com.kesLogBack.menu.model.result.RSelectMenuList;
import com.kesLogBack.menu.service.MenuService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MenuController {
	@Autowired
	final MenuService menuService = null;
	
	/**
	 * 메뉴 리스트 조회
	 * @param httpServletRequest
	 * @param httpServletResponse
	 * @return
	 */
	@PostMapping("/api/selectMenuList")
	public ComResult<RSelectMenuList> select1(
			HttpServletRequest httpServletRequest
			, HttpServletResponse httpServletResponse
	) {
		return menuService.selectMenuList();
	}
}
