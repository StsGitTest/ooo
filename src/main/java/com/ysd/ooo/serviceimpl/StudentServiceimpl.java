package com.ysd.ooo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysd.ooo.dao.StudentDao;
import com.ysd.ooo.entity.Students;
import com.ysd.ooo.entity.StudentsQuery;
import com.ysd.ooo.service.StudentService;

@Service
public class StudentServiceimpl implements StudentService {
	@Autowired
	private StudentDao studao;

	/**
	 * 多条件查询学生
	 */
	@Override
	public List<Students> selectstuer(StudentsQuery stuquery) {
		// TODO Auto-generated method stub
		return studao.selectstuer(stuquery);
	}

	/**
	 * 查询学生
	 */
	@Override
	public List<Students> selectstu() {
		// TODO Auto-generated method stub
		return studao.selectstu();
	}

	/**
	 * 更改学生
	 */
	@Override
	public int updatestu(Students stu) {
		// TODO Auto-generated method stub
		return studao.updatestu(stu);
	}

	/**
	 * 
	 */
	@Override
	public Students suijiselect() {
		// TODO Auto-generated method stub
		return studao.suijiselect();
	}

	/**
	 * 添加
	 */
	@Override
	public int addstu(Students stu) {
		// TODO Auto-generated method stub
		return studao.addstu(stu);
	}

	/**
	 * 删除学生
	 */
	@Override
	public int deletestu(Integer stuid) {
		// TODO Auto-generated method stub
		return studao.deletestu(stuid);
	}

	@Override
	public List<Students> selectstuduo(String id) {
		// TODO Auto-generated method stub
		return studao.selectstuduo(id);
	}

}
