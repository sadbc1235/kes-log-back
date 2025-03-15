package com.kesLogBack.menu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kesLogBack.menu.model.param.PSelectMenuListByParentMenuCode;
import com.kesLogBack.menu.model.result.RSelectMenuListByParentMenuCode;

@Mapper
public interface MenuMapper {
	
	/**
	 * 메뉴 리스트 조회
	 * @param param
	 * @return
	 * @throws Exception
	 */
	List<RSelectMenuListByParentMenuCode> selectMenuListByParentMenuCode(PSelectMenuListByParentMenuCode param) throws Exception;
}
