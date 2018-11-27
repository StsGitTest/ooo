package com.ysd.ooo.entity;

import com.ysd.ooo.util.PoiHandler;

/**
 * 学生实体类
 * 
 * @author 爱新觉罗
 *
 */
public class Students {

	@PoiHandler(excelHeader = "编号")
	private Integer ID;
	@PoiHandler(excelHeader = "卡号ID")
	private String CardNO;
	@PoiHandler(excelHeader = "姓名")
	private String Name;
	@PoiHandler(excelHeader = "性别")
	private String Sex;
	@PoiHandler(excelHeader = "院系id")
	private Integer MembershipID;
	@PoiHandler(excelHeader = "状态")
	private Integer Status;
	@PoiHandler(excelHeader = "备注")
	private String Remark;
	@PoiHandler(excelHeader = "学号")
	private Integer StuNO;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
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

	public Integer getMembershipID() {
		return MembershipID;
	}

	public void setMembershipID(Integer membershipID) {
		MembershipID = membershipID;
	}

	public Integer getStatus() {
		return Status;
	}

	public void setStatus(Integer status) {
		Status = status;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	public Integer getStuNO() {
		return StuNO;
	}

	public void setStuNO(Integer stuNO) {
		StuNO = stuNO;
	}

	public Students(Integer iD, String cardNO, String name, String sex, Integer membershipID, Integer status,
			String remark, Integer stuNO) {
		super();
		ID = iD;
		CardNO = cardNO;
		Name = name;
		Sex = sex;
		MembershipID = membershipID;
		Status = status;
		Remark = remark;
		StuNO = stuNO;
	}

	public Students(String cardNO, String name, String sex, Integer membershipID, Integer status, String remark,
			Integer stuNO) {
		super();
		CardNO = cardNO;
		Name = name;
		Sex = sex;
		MembershipID = membershipID;
		Status = status;
		Remark = remark;
		StuNO = stuNO;
	}

	public Students() {
		super();
	}

	@Override
	public String toString() {
		return "Students [ID=" + ID + ", CardNO=" + CardNO + ", Name=" + Name + ", Sex=" + Sex + ", MembershipID="
				+ MembershipID + ", Status=" + Status + ", Remark=" + Remark + ", StuNO=" + StuNO + "]";
	}

}
