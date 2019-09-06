package com.bjsxt.dubbo.service;

import java.util.List;

import com.bjsxt.pojo.Menu;

public interface MenuDubboService {
	List<Menu> selAll();
	
	int updMenu(Menu menu);
	
	Menu selById(int id);
}
