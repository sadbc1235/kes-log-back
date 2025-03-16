package com.kesLogBack.menu.model.result;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RSelectMenuInfo {
	private RSelectMenuTitleInfo menuTitleInfo;

	public RSelectMenuTitleInfo getMenuTitleInfo() {
		return menuTitleInfo;
	}

	public void setMenuTitleInfo(RSelectMenuTitleInfo menuTitleInfo) {
		this.menuTitleInfo = menuTitleInfo;
	}
}
