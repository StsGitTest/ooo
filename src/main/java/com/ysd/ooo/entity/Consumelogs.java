package com.ysd.ooo.entity;

import java.util.Date;

/**
 * 记录表实体类
 * 
 * @author 爱新觉罗
 *
 */
public class Consumelogs {

	private int ID;
	private String CardNO;
	private int ReadRoomID;
	private Date InTime;
	private Date OutTime;
	private String Status;

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

	public int getReadRoomID() {
		return ReadRoomID;
	}

	public void setReadRoomID(int readRoomID) {
		ReadRoomID = readRoomID;
	}

	public Date getInTime() {
		return InTime;
	}

	public void setInTime(Date inTime) {
		InTime = inTime;
	}

	public Date getOutTime() {
		return OutTime;
	}

	public void setOutTime(Date outTime) {
		OutTime = outTime;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Consumelogs(int iD, String cardNO, int readRoomID, Date inTime, Date outTime, String status) {
		super();
		ID = iD;
		CardNO = cardNO;
		ReadRoomID = readRoomID;
		InTime = inTime;
		OutTime = outTime;
		Status = status;
	}
	
	
	

	public Consumelogs(String cardNO, int readRoomID, Date inTime, Date outTime, String status) {
		super();
		CardNO = cardNO;
		ReadRoomID = readRoomID;
		InTime = inTime;
		OutTime = outTime;
		Status = status;
	}

	public Consumelogs() {
		super();
	}

	@Override
	public String toString() {
		return "Consumelogs [ID=" + ID + ", CardNO=" + CardNO + ", ReadRoomID=" + ReadRoomID + ", InTime=" + InTime
				+ ", OutTime=" + OutTime + ", Status=" + Status + "]";
	}

}
