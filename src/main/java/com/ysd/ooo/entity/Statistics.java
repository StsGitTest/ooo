package com.ysd.ooo.entity;

/**
 * 统计实体类
 * 
 * @author 爱新觉罗
 *
 */
public class Statistics {

	private int ID;
	private int ReadRoomID;
	private int PeopleNums;
	private int Year;
	private int Month;
	private int Day;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getReadRoomID() {
		return ReadRoomID;
	}

	public void setReadRoomID(int readRoomID) {
		ReadRoomID = readRoomID;
	}

	public int getPeopleNums() {
		return PeopleNums;
	}

	public void setPeopleNums(int peopleNums) {
		PeopleNums = peopleNums;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {
		Month = month;
	}

	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		Day = day;
	}

	@Override
	public String toString() {
		return "Statistics [ID=" + ID + ", ReadRoomID=" + ReadRoomID + ", PeopleNums=" + PeopleNums + ", Year=" + Year
				+ ", Month=" + Month + ", Day=" + Day + "]";
	}

	public Statistics(int iD, int readRoomID, int peopleNums, int year, int month, int day) {
		super();
		ID = iD;
		ReadRoomID = readRoomID;
		PeopleNums = peopleNums;
		Year = year;
		Month = month;
		Day = day;
	}
	
	
	

	public Statistics(int readRoomID, int peopleNums, int year, int month, int day) {
		super();
		ReadRoomID = readRoomID;
		PeopleNums = peopleNums;
		Year = year;
		Month = month;
		Day = day;
	}

	public Statistics() {
		super();
	}

}
