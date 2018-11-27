package com.ysd.ooo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ysd.ooo.entity.City;

public interface CityDao {

	/**
	 * 查询城市
	 */
	public List<City> selectcity();

	/**
	 * 删除城市
	 */
	public int delete(@Param("id") int id);

	/**
	 * 添加城市
	 */
	public int insert(@Param("city") City city);

	/**
	 * 更改城市信息
	 */
	public int update(@Param("city") City city);

}
