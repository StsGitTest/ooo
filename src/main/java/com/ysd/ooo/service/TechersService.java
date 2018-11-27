package com.ysd.ooo.service;

import java.util.List;

import com.ysd.ooo.entity.Techers;
import com.ysd.ooo.entity.TechersQuery;

public interface TechersService {

	/**
	 * 查询教师
	 */
	public List<Techers> selecttecher(TechersQuery tequery);
	
	/**
	 * 查询所有学生
	 *
	 */
	public List<Techers> selecttech();

	/*
	 * 更改教师信息
	 */
	public int updatethre(Techers tech);

	/**
	 * 随机出来一个教师
	 */
	public Techers suijiselect();
	
	/**
	 * 删除一个老师
	 */
	public int deletech(Integer techid);

	/**
	 * 新增一个老师
	 */
	public int addtech(Techers tech);

	/**
	 * 更改一个老师信息
	 */
	public int updatech(Techers tech);

}
