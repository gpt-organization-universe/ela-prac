package com.ohgirffers.elaprac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ohgirffers.elaprac.dto.MenuDTO;
import com.ohgirffers.elaprac.service.MenuService;

@RestController
public class MenuController {

	private final MenuService menuService;
	// 컨트롤러 객체는 반드시 메뉴서비스 객체 하나만 고정으로 받겠다

	@Autowired
	public MenuController(MenuService menuService) {
		this.menuService = menuService;
	}

	@GetMapping("health")
	public String healthCheck() {
		return "fine!";
	}

	@GetMapping("menus/{menuCode}")
	public MenuDTO findMenuByMenuCode(@PathVariable("menuCode") int menuCode) {
		MenuDTO menu = menuService.findMenuByMenuCode(menuCode);
		return menu;
	}
}
