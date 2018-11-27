package com.ysd.ooo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ysd.ooo.entity.Students;
import com.ysd.ooo.entity.StudentsQuery;

public interface StudentDao {

	/**
	 * 查询学生条件
	 */
	public List<Students> selectstuer(StudentsQuery stuquery);

	/**
	 * 查询所有学生
	 * 
	 * @return
	 */
	public List<Students> selectstu();

	/**
	 * 更改学生信息
	 */
	public int updatestu(Students stu);

	/**
	 * 随机查询一条学生记录
	 */
	public Students suijiselect();

	/**
	 * 新增学生
	 */
	public int addstu(Students stu);

	/**
	 * 删除一个学生
	 */
	public int deletestu(@Param("stuid") Integer stuid);
	
	/**
	 * 查询学生
	 */
	public List<Students> selectstuduo(@Param("id")String id);
	

}
