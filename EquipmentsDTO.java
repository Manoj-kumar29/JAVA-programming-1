package com.xworkz.Gym;

public class EquipmentsDTO {
public EquipmentsDTO() {
	System.out.println(this.getClass().getSimpleName()+ "object is created");
}

private int equipmentId;
private String equipmentWeight;
private long equipmentWarranty;
private long equipmentPrice;
private String equipmentName;


public String getEquipmentName() {
	return equipmentName;
}
public void setEquipmentName(String equipmentName) {
	this.equipmentName = equipmentName;
}
public int getEquipmentId() {
	return equipmentId;
}
public void setEquipmentId(int equipmentId) {
	this.equipmentId = equipmentId;
}
public String getEquipmentWeight() {
	return equipmentWeight;
}
public void setEquipmentWeight(String equipmentWeight) {
	this.equipmentWeight = equipmentWeight;
}
public long getEquipmentWarranty() {
	return equipmentWarranty;
}
public void setEquipmentWarranty(long equipmentWarranty) {
	this.equipmentWarranty = equipmentWarranty;
}
public long getEquipmentPrice() {
	return equipmentPrice;
}
public void setEquipmentPrice(long equipmentPrice) {
	this.equipmentPrice = equipmentPrice;
}
@Override
public String toString() {
	return "EquipmentsDTO [equipmentId=" + equipmentId + ", equipmentWeight=" + equipmentWeight + ", equipmentWarranty="
			+ equipmentWarranty + ", equipmentPrice=" + equipmentPrice + ", equipmentName=" + equipmentName + "]";
}


}
