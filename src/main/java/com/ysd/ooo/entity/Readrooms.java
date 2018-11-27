package com.ysd.ooo.entity;

/**
 * 阅览室的实体类
 * 
 * @author 爱新觉罗
 *
 */
public class Readrooms {
	private int ID;
	private String Name;
	private String Remark;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	@Override
	public String toString() {
		return "Readrooms [ID=" + ID + ", Name=" + Name + ", Remark=" + Remark + "]";
	}

	public Readrooms(int iD, String name, String remark) {
		super();
		ID = iD;
		Name = name;
		Remark = remark;
	}

	public Readrooms() {
		super();
	}

}
