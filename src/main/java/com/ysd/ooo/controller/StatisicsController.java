package com.ysd.ooo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ysd.ooo.entity.Result;
import com.ysd.ooo.service.StatisticsService;
import com.ysd.ooo.util.Cors;

/**
 * 图表Controller
 * 
 * @author 爱新觉罗
 *
 */
@Controller
@RequestMapping("/statosics")
public class StatisicsController extends Cors {
	@Autowired
	StatisticsService statis;

	/**
	 * 图表
	 * 
	 * @return
	 */
	@RequestMapping("/statis")
	@ResponseBody
	public Result selectpoplenum(int readid) {
		int r = statis.selectpoplenum(readid);
		Result res = new Result(true, null, r);
		return res;
	}

}
