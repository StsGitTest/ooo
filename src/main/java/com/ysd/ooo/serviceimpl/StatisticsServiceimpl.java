package com.ysd.ooo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysd.ooo.dao.StatisticsDao;
import com.ysd.ooo.entity.Statistics;
import com.ysd.ooo.service.StatisticsService;

@Service
public class StatisticsServiceimpl implements StatisticsService {

	@Autowired
	StatisticsDao statisdao;

	@Override
	public int insertStatistics(Statistics statis) {
		// TODO Auto-generated method stub
		return statisdao.insertStatistics(statis);
	}

	@Override
	public Integer selectpoplenum(Integer readid) {
		// TODO Auto-generated method stub
		return statisdao.selectpoplenum(readid);
	}

}
