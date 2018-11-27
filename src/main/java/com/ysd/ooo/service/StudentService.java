package com.ysd.ooo.service;

import java.util.List;

import com.ysd.ooo.entity.Students;
import com.ysd.ooo.entity.StudentsQuery;

public interface StudentService {

	/**
	 * 查询学生
	 */
	public List<Students> selectstuer(StudentsQuery stuquery);

	/**
	 * 查询所有学生
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
	public int deletestu(Integer stuid);
	

	/**
	 * 查询学生
	 */
	public List<Students> selectstuduo(String id);
	


}
