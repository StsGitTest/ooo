package com.ysd.ooo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ysd.ooo.entity.Result;
import com.ysd.ooo.entity.TechersFan;
import com.ysd.ooo.entity.TechersQuery;
import com.ysd.ooo.service.TechersService;
import com.ysd.ooo.util.Cors;

@Controller
@RequestMapping("/techers")
public class TechersController extends Cors {
	@Autowired
	TechersService techerservice;
	/**
	 * 查询学生
	 * 
	 * @return
	 */
	@RequestMapping("/techer")
	@ResponseBody
	public TechersFan select(TechersQuery tequery) {
		
		return new TechersFan((techerservice.selecttecher(tequery)).size(), techerservice.selecttecher(tequery));
	}
	 
	/*
	@RequestMapping("/techer")
	@ResponseBody
	public Result deletech(Integer techid) {
		int r =techerservice.deletech(techid);
		if(r>0) {
			return new 
		}
	}*/
	

}
