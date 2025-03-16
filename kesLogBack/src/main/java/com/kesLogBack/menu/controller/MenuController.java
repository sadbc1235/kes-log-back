package com.kesLogBack.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kesLogBack.common.model.ComResult;
import com.kesLogBack.menu.model.param.PSelectMenuInfo;
import com.kesLogBack.menu.model.result.*;
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
	public ComResult<RSelectMenuList> selectMenuList(
			HttpServletRequest httpServletRequest
			, HttpServletResponse httpServletResponse
	) {
		return menuService.selectMenuList();
	}
	
	/**
	 * 메뉴 정보 조회
	 * @param httpServletRequest
	 * @param httpServletResponse
	 * @param param
	 * @return
	 */
	@PostMapping("/api/selectMenuInfo")
	public ComResult<RSelectMenuInfo> selectMenuInfo(
			HttpServletRequest httpServletRequest
			, HttpServletResponse httpServletResponse
			, @RequestBody PSelectMenuInfo param
	) {
		return menuService.selectMenuInfo(param);
	}
}
