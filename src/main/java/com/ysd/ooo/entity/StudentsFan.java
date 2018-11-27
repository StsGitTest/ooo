package com.ysd.ooo.entity;

import java.util.List;

/**
 * 	学生分页返回值
 * 
 * @author 爱新觉罗
 *
 */
public class StudentsFan {

	private int total;
	private List<Students> rows;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Students> getRows() {
		return rows;
	}

	public void setRows(List<Students> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "StudentsFan [total=" + total + ", rows=" + rows + "]";
	}

	public StudentsFan(int total, List<Students> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}

	public StudentsFan() {
		super();
	}

}
