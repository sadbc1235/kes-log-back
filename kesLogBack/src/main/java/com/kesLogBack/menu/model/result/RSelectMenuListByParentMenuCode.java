package com.kesLogBack.menu.model.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RSelectMenuListByParentMenuCode {
	private String menuCode;
	private String menuName;
	private String articleCnt;
	
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
}
