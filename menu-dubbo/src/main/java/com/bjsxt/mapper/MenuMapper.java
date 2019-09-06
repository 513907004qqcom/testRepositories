package com.bjsxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bjsxt.pojo.Menu;

public interface MenuMapper {
	@Select("select * from menu")
	List<Menu> selAll();
	@Select("select * from menu where id=#{0}")
	Menu selById(int id);
	@Update("update menu set pid=#{pid}, name=#{name} where id=#{id}")
	int updMenu(Menu menu);
	@Select("select * from menu where pid=#{0}")
	List<Menu> selByPid(int pid);
}
