package com.kesLogBack.menu.model.result;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RSelectMenuList {
	private String menuCode;
	private String menuName;
	private String articleCnt;
	private List<RSelectMenuListByParentMenuCode> subMenuList;	
	
	public RSelectMenuList(RSelectMenuListByParentMenuCode result, List<RSelectMenuListByParentMenuCode> subMenuList) {
		this.menuCode = result.getMenuCode();
		this.menuName = result.getMenuName();
		this.articleCnt = result.getArticleCnt();
		this.subMenuList = subMenuList;
	}
	
	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getArticleCnt() {
		return articleCnt;
	}

	public void setArticleCnt(String articleCnt) {
		this.articleCnt = articleCnt;
	}
	
	public List<RSelectMenuListByParentMenuCode> getSubMenuList() {
		return subMenuList;
	}

	public void setSubMenuList(List<RSelectMenuListByParentMenuCode> subMenuList) {
		this.subMenuList = subMenuList;
	}
}
