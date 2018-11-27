package com.ysd.ooo.dao;

import org.apache.ibatis.annotations.Param;

import com.ysd.ooo.entity.Statistics;

public interface StatisticsDao {

	/**
	 * 新增一条日志
	 */
	public int insertStatistics(Statistics statis);

	/**
	 * 查询readroomid为多少的时候的人次(图表)
	 */
	public Integer selectpoplenum(@Param("readid") Integer readid);

}
