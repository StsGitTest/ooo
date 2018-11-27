package com.ysd.ooo.service;

import com.ysd.ooo.entity.Statistics;

public interface StatisticsService {

	/**
	 * 新增一条日志
	 */
	public int insertStatistics(Statistics statis);

	/**
	 * 查询readroomid为多少的时候的人次(图表)
	 */
	public Integer selectpoplenum(Integer readid);

}
