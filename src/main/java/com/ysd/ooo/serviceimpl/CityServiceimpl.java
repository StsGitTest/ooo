package com.ysd.ooo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysd.ooo.dao.CityDao;
import com.ysd.ooo.entity.City;
import com.ysd.ooo.service.CityService;

@Service
public class CityServiceimpl implements CityService {

	@Autowired
	private CityDao city;

	@Override
	public List<City> selectcity() {
		// TODO Auto-generated method stub
		return city.selectcity();
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return city.delete(id);
		
	}

	@Override
	public int insert(City city1) {
		// TODO Auto-generated method stub
		
		return city.insert(city1);
	}

	@Override
	public int update(City city1) {
		// TODO Auto-generated method stub
		return city.update(city1);
	}

}
