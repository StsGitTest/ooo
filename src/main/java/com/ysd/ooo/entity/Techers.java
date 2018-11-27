package com.ysd.ooo.entity;

/**
 * 教师实体类
 * 
 * @author 爱新觉罗
 *
 */
public class Techers {

	private int ID;
	private String CardNO;
	private String Name;
	private String Sex;
	private int SectionID;
	private int Status;
	private String Remark;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getCardNO() {
		return CardNO;
	}

	public void setCardNO(String cardNO) {
		CardNO = cardNO;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public int getSectionID() {
		return SectionID;
	}

	public void setSectionID(int sectionID) {
		SectionID = sectionID;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	public Techers(int iD, String cardNO, String name, String sex, int sectionID, int status, String remark) {
		super();
		ID = iD;
		CardNO = cardNO;
		Name = name;
		Sex = sex;
		SectionID = sectionID;
		Status = status;
		Remark = remark;
	}

	public Techers() {
		super();
	}

	@Override
	public String toString() {
		return "Techers [ID=" + ID + ", CardNO=" + CardNO + ", Name=" + Name + ", Sex=" + Sex + ", SectionID="
				+ SectionID + ", Status=" + Status + ", Remark=" + Remark + "]";
	}

}
