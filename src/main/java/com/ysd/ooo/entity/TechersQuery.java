package com.ysd.ooo.entity;

public class TechersQuery {

	private Integer ID;
	private String CardNO;
	private String Name;
	private String Sex;
	private Integer SectionID;
	private Integer Status;
	private String Remark;
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

	public int getSectionID() {
		return SectionID;
	}

	public void setSectionID(Integer sectionID) {
		SectionID = sectionID;
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

	@Override
	public String toString() {
		return "TechersQuery [ID=" + ID + ", CardNO=" + CardNO + ", Name=" + Name + ", Sex=" + Sex + ", SectionID="
				+ SectionID + ", Status=" + Status + ", Remark=" + Remark + ", page=" + page + ", rows=" + rows
				+ ", offset=" + offset + "]";
	}

	public TechersQuery(Integer iD, String cardNO, String name, String sex, Integer sectionID, Integer status, String remark,
			Integer page, Integer rows, Integer offset) {
		super();
		ID = iD;
		CardNO = cardNO;
		Name = name;
		Sex = sex;
		SectionID = sectionID;
		Status = status;
		Remark = remark;
		this.page = page;
		this.rows = rows;
		this.offset = offset;
	}

	public TechersQuery() {
		super();
	}

}
