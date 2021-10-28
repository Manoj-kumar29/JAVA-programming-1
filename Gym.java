package com.xworkz.Gym;



public class Gym {
public EquipmentsDTO[] equipments;
private int index;

public Gym(int size) {
	equipments =new EquipmentsDTO [size];
	
}

public boolean createEquipmentsDetails(EquipmentsDTO equipments) {
	boolean isAdded=false;
	System.out.println("inside createEquipmentsDetails()");
	boolean Added;
	boolean equipmentsAdded;
	if(equipments!=null) {
		this.equipments[index++]= equipments;
		isAdded=true;
	}
	else {
		System.out.println("No equipments is added");
		return isAdded=false;
	}
	return isAdded;
}

public void getEquipmentsDetails() {
	for(int i=0;i<equipments.length;i++) {
		System.out.println(equipments[i]);
	}
}

public EquipmentsDTO getGymByEquipmentId(int equipmentId) {
	EquipmentsDTO equipmentDTO=null;
  System.out.println("inside food by getGymByEquipmentId()");
	if(equipmentId>0) {
		for(int i=0;i<equipments.length;i++) {
			if(equipments[i].getEquipmentId()==equipmentId) {
				System.out.println("Items found by:"+equipmentId);
			equipmentDTO = equipments[i];	
			}
			else {
				System.out.println("Equipments not found by:"+equipmentId);
			}
		}
	}
			return equipmentDTO;
		}
		public EquipmentsDTO getGymByEquipmentName(String equipmentName) {
			EquipmentsDTO equipmentDTO=null;
			System.out.println("inside food by getGymByEquipmentName()");
			if(equipmentName!=null) {
				for(int i=0;i<equipments.length;i++) {
					if(equipments[i].getEquipmentName().equals(equipmentName)) {
						System.out.println("Equipment found by:"+equipmentName);
						equipmentDTO =equipments[i];
					}
					else {
						System.out.println("Equipments not found by:"+equipmentName);
					}
				}
			}
					return equipmentDTO;
	}
		public void updateEquipmentNameByEquipmentId(String equipmentName,int equipmentId) {
			
			System.out.println("inside item by updateEquipmentNameByEquipmentId()");
			if(equipmentName!=null && equipmentId>0) {
				for(int i=0;i<equipments.length;i++) {
					if(equipments[i].getEquipmentId()==(equipmentId)) {
						System.out.println("Equipments Name is updated by:"+equipmentId);
					      equipments[i].setEquipmentName(equipmentName);
					}
					else {
						System.out.println("Equipments Name is not updates:"+equipmentId);
					}
			
				}
}
		}
		public void deleteEquipmentsById(int equipmentId) {
			System.out.println("Inside deleteEquipmentById()");
			if(equipmentId>0) {
				for(int i=0;i<equipments.length;i++) {
					if(equipments[i].getEquipmentId()==(equipmentId)) {
						System.out.println("Equipment Id is deleted by:"+equipmentId);
						equipments[i].setEquipmentId(equipmentId);
						
					}
					else {
						System.out.println("Equipment Id is not deleted:"+equipmentId);
					}
				}
			}
			
		}


		public EquipmentsDTO getEquipmentById(int nextInt) {
			// TODO Auto-generated method stub
			return null;
		}
			
}
