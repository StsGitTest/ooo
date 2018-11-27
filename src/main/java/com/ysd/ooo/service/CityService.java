package com.ysd.ooo.service;

import java.util.List;

import com.ysd.ooo.entity.City;

public interface CityService {

	/**
	 * 查询城市
	 */
	public List<City> selectcity();

	/**
	 * 删除城市
	 */
	public int delete(int id);

	/**
	 * 添加城市
	 */
	public int insert(City city);

	/**
	 * 更改城市信息
	 */
	public int update(City city);

}
