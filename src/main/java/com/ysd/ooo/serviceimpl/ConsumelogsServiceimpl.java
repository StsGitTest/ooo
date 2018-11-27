package com.ysd.ooo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysd.ooo.dao.ConsumelogsDao;
import com.ysd.ooo.entity.Consumelogs;
import com.ysd.ooo.service.ConsumelogsService;

@Service
public class ConsumelogsServiceimpl implements ConsumelogsService {

	@Autowired
	ConsumelogsDao consum;

	@Override
	public int insertlog(Consumelogs logs) {
		// TODO Auto-generated method stub
		return consum.insertlog(logs);
	}

	@Override
	public Consumelogs selectfromcardid(String id) {
		// TODO Auto-generated method stub
		return consum.selectfromcardid(id);
	}

	@Override
	public int updateconsumlog(Consumelogs logs) {
		// TODO Auto-generated method stub
		return consum.updateconsumlog(logs);
	}

	@Override
	public List<Consumelogs> selectConsumelogsnum(int readid) {
		// TODO Auto-generated method stub
		return consum.selectConsumelogsnum(readid);
	}

}
