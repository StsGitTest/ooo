package com.ysd.ooo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysd.ooo.dao.TechersDao;
import com.ysd.ooo.entity.Techers;
import com.ysd.ooo.entity.TechersQuery;
import com.ysd.ooo.service.TechersService;

@Service
public class TechersServiceimpl implements TechersService {
	@Autowired
	private TechersDao tedao;

	@Override
	public List<Techers> selecttecher(TechersQuery tequery) {
		// TODO Auto-generated method stub
		return tedao.selecttecher(tequery);
	}

	@Override
	public List<Techers> selecttech() {
		// TODO Auto-generated method stub
		return tedao.selecttech();
	}

	@Override
	public int updatethre(Techers tech) {
		// TODO Auto-generated method stub
		return tedao.updatethre(tech);
	}

	@Override
	public Techers suijiselect() {
		// TODO Auto-generated method stub
		return tedao.suijiselect();
	}

	@Override
	public int deletech(Integer techid) {
		// TODO Auto-generated method stub
		return tedao.deletech(techid);
	}

	@Override
	public int addtech(Techers tech) {
		// TODO Auto-generated method stub
		return tedao.addtech(tech);
	}

	@Override
	public int updatech(Techers tech) {
		// TODO Auto-generated method stub
		return tedao.updatech(tech);
	}

}
