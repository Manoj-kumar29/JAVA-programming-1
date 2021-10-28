package com.xworkz.phoneapp;

public class ContactsDTO {
	private int serialNo;
	private String name;
	private long conNum;
	
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getConNum() {
		return conNum;
	}
	public void setConNum(long conNum) {
		this.conNum = conNum;
	}
	@Override
	public String toString() {
		return "ContactsDTO [serialNo=" + serialNo + ", name=" + name + ", conNum=" + conNum + "]";
	}
}
