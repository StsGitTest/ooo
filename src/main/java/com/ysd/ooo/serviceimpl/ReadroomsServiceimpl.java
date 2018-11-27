package com.ysd.ooo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysd.ooo.dao.ReadroomsDao;
import com.ysd.ooo.entity.Readrooms;
import com.ysd.ooo.service.ReadroomsService;
@Service
public class ReadroomsServiceimpl implements ReadroomsService {
	@Autowired
	ReadroomsDao readdao;

	@Override
	public List<Readrooms> selectrandomnum() {
		// TODO Auto-generated method stub
		return readdao.selectrandomnum();
	}

}
