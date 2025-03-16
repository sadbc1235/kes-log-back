package com.kesLogBack.menu.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kesLogBack.common.model.ComResult;
import com.kesLogBack.menu.mapper.MenuMapper;
import com.kesLogBack.menu.model.param.*;
import com.kesLogBack.menu.model.result.*;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MenuService {
	
	@Autowired
	final MenuMapper menuMapper = null;
	
	/**
	 * 메뉴 리스트 조회
	 * @param param
	 * @return
	 */
	public ComResult<RSelectMenuList> selectMenuList() {
		PSelectMenuListByParentMenuCode param = new PSelectMenuListByParentMenuCode(); 
		ComResult<RSelectMenuList> result = new ComResult<>(param);
		List<RSelectMenuList> innerResult = new ArrayList<>();
		
		try {
			// 매인 메뉴 조회
			param.setParentMenuCode("0");
			List<RSelectMenuListByParentMenuCode> mainMenuList = menuMapper.selectMenuListByParentMenuCode(param);
			// 조회된 매인 메뉴의 서브 메뉴 조회 후 세팅
			for(RSelectMenuListByParentMenuCode mainMenu : mainMenuList) {
				param.setParentMenuCode(mainMenu.getMenuCode());
				List<RSelectMenuListByParentMenuCode> subMenuList = menuMapper.selectMenuListByParentMenuCode(param);
				RSelectMenuList menuInfo = new RSelectMenuList(mainMenu, subMenuList);
				innerResult.add(menuInfo);
			}
			result.setSuccess(innerResult);
			return result;
		} catch (Exception ex) {
			result.setError(ex);
		}
		return result;
	}
	
	/**
	 * 메뉴 정보 조회
	 * @param param
	 * @return
	 */
	public ComResult<RSelectMenuInfo> selectMenuInfo(PSelectMenuInfo param) { 
		ComResult<RSelectMenuInfo> result = new ComResult<>(param);
		RSelectMenuInfo innerResult = new RSelectMenuInfo();
		
		try {
			/* 메뉴 타이틀 정보 조회 */
			innerResult.setMenuTitleInfo(menuMapper.selectMenuTitleInfo(param));
			result.setSuccess(innerResult);
			return result;
		} catch (Exception ex) {
			result.setError(ex);
		}
		return result;
	}
}
