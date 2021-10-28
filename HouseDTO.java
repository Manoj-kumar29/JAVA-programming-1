package com.xworkz.Hospital.Hospitalapp.dto;

public class HouseDTO {
	private String houseName;
	private int houseId;
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	@Override
	public String toString() {
		return "HouseDTO [houseName=" + houseName + ", houseId=" + houseId + "]";
	}
}
