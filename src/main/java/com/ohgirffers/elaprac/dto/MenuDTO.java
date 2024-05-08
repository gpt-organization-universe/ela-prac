package com.ohgirffers.elaprac.dto;

import lombok.Data;

@Data
public class MenuDTO {

	private int menuCode;
	private String menuName;
	private int menuPrice;
	private int categoryName;
	private String orderableStatus;
}
