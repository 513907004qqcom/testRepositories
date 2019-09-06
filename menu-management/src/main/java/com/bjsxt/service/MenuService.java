package com.bjsxt.service;

import java.util.List;
import java.util.Map;

import com.bjsxt.pojo.Menu;

public interface MenuService {
	List<Menu> show();
	
	Map<String,Object> showMenu(int id);
	
	int update(Menu menu);
}
