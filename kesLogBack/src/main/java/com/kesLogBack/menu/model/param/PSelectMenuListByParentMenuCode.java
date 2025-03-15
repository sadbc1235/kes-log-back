package com.kesLogBack.menu.model.param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PSelectMenuListByParentMenuCode {
	private String parentMenuCode;

	public String getParentMenuCode() {
		return parentMenuCode;
	}

	public void setParentMenuCode(String parentMenuCode) {
		this.parentMenuCode = parentMenuCode;
	}
}
