package com.ysd.ooo.entity;

import java.util.List;

/**
 * 教师查询分页返回值
 * 
 * @author 爱新觉罗
 *
 */

public class TechersFan {

	private int total;
	private List<Techers> rows;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Techers> getRows() {
		return rows;
	}

	public void setRows(List<Techers> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "TechersFan [total=" + total + ", rows=" + rows + "]";
	}

	public TechersFan(int total, List<Techers> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}

	public TechersFan() {
		super();
	}

}
