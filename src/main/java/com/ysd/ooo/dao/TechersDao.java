package com.ysd.ooo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ysd.ooo.entity.Techers;
import com.ysd.ooo.entity.TechersQuery;

/**
 * 学生dao层
 * 
 * @author 爱新觉罗
 *
 */
public interface TechersDao {
	/**
	 * 查询教师条件
	 */
	public List<Techers> selecttecher(TechersQuery tequery);

	/**
	 * 查询所有教师
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
