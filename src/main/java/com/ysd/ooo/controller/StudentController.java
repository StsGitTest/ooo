package com.ysd.ooo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ysd.ooo.entity.Result;
import com.ysd.ooo.entity.Students;
import com.ysd.ooo.entity.StudentsFan;
import com.ysd.ooo.entity.StudentsQuery;
import com.ysd.ooo.service.StudentService;
import com.ysd.ooo.util.Cors;
import com.ysd.ooo.util.UUIDUtils;

@Controller
@RequestMapping("/students")
public class StudentController extends Cors {
	@Autowired
	StudentService stuservice;

	/**
	 * 查询学生
	 * 
	 * @return
	 */
	@RequestMapping("/stu")
	@ResponseBody
	public StudentsFan select(StudentsQuery stuquery) {
		/*
		 * System.out.println(stuquery.getName());
		 * System.out.println(stuquery.getMembershipID());
		 */

		List<Students> students = stuservice.selectstuer(stuquery);
		System.out.println(students);
		int lengehS1 = students.size();
		return new StudentsFan(lengehS1, students);
	}

	/**
	 * 更改学生信息
	 */
	@RequestMapping("/updatestu")
	@ResponseBody
	public Result updatestu(Students stu) {
		int r = stuservice.updatestu(stu);
		if (r > 0) {
			return new Result(true, "修改成功", null);
		} else {
			return new Result(false, "修改失败", null);
		}
	}

	/**
	 * 添加一个学生
	 */
	@RequestMapping("/addstu")
	@ResponseBody
	public Result addstu(Students stu) {

		// 生成一个卡号
		String carid = UUIDUtils.getUUID();
		stu.setCardNO(carid);
		// 生成一个三位数的学号
		int stuNo = (int) (Math.random() * 900 + 100);
		stu.setStuNO(stuNo);
		// 状态为0(默认)
		stu.setStatus(0);

		System.out.println(stu);

		int r = stuservice.addstu(stu);
		if (r > 0) {
			return new Result(true, "新增成功", null);
		} else {
			return new Result(false, "新增失败", null);
		}
	}

	/**
	 * 删除一个学生(根据id)
	 */
	@RequestMapping("/deletestu")
	@ResponseBody
	public Result deletestu(Integer stuid) {
		int r = stuservice.deletestu(stuid);
		if (r > 0) {
			return new Result(true, "删除成功", null);
		} else {
			return new Result(false, "删除失败", null);
		}
	}

}
