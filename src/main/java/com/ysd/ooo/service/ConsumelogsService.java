package com.ysd.ooo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ysd.ooo.entity.Consumelogs;

public interface ConsumelogsService {

	/**
	 * 添加记录
	 */
	public int insertlog(Consumelogs logs);

	/**
	 * 根据卡号id查询记录
	 */
	public Consumelogs selectfromcardid(@Param("id") String id);

	/**
	 * 更改记录
	 */
	public int updateconsumlog(Consumelogs logs);
	
	/**
	 * 查询阅览室相同的所有的记录信息
	 */
	public List<Consumelogs> selectConsumelogsnum(int readid);

}
