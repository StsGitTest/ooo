package com.ysd.ooo.entity;

public class StudentsQuery {

	private Integer ID;
	private String CardNO;
	private String Name;
	private String Sex;
	private Integer MembershipID;
	private Integer Status;
	private String Remark;
	private Integer StuNO;
	private Integer page, rows, offset;// 第几页 条数 偏移量

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

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getOffset() {
		return (page - 1) * rows;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public StudentsQuery(Integer iD, String cardNO, String name, String sex, Integer membershipID, Integer status,
			String remark, Integer stuNO, Integer page, Integer rows, Integer offset) {
		super();
		ID = iD;
		CardNO = cardNO;
		Name = name;
		Sex = sex;
		MembershipID = membershipID;
		Status = status;
		Remark = remark;
		StuNO = stuNO;
		this.page = page;
		this.rows = rows;
		this.offset = offset;
	}

	public StudentsQuery() {
		super();
	}

	@Override
	public String toString() {
		return "StudentsQuery [ID=" + ID + ", CardNO=" + CardNO + ", Name=" + Name + ", Sex=" + Sex + ", MembershipID="
				+ MembershipID + ", Status=" + Status + ", Remark=" + Remark + ", StuNO=" + StuNO + ", page=" + page
				+ ", rows=" + rows + ", offset=" + offset + "]";
	}

}
