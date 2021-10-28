package com.xworkz.Gym;

import java.util.Scanner;

public class GymUtil {
public static void main(String a[]) {
		
		System.out.println("\n"+"Enter the number of equipments ");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		
		Gym gym=new Gym(size);
		
		if(size>0) {
			for(int i=0;i<size;i++) {
				EquipmentsDTO equipment=new EquipmentsDTO();
				
				System.out.println("Enter Details");
				
				System.out.println("Enter EquipmentId");
				int equipmentId=sc.nextInt();
				equipment.setEquipmentId(equipmentId);
				System.out.println("Enter EquipmentName");
				String equipmentName=sc.next();
				equipment.setEquipmentName(equipmentName);
				
				
				boolean isAdded=gym.createEquipmentsDetails(equipment);
				System.out.println("EquipmentAdded:"+isAdded);
			}
				
				gym.getEquipmentsDetails();
				System.out.println("\n"+"Enter the EquipmentId");
				int equipmentId=sc.nextInt();
				System.out.println(gym.getGymByEquipmentId(equipmentId));
				
			   System.out.println("\n"+"Enter the EquipmentName");
			   String equipmentName=sc.next();
			   String equipmentsName = null;
			System.out.println(gym.getGymByEquipmentName(equipmentName));
			 
			   
			   int choice;
				String text;
				do {
				System.out.println("Press 1 to get all equipments ");	
				System.out.println("Press 2 to get Equipment Name");
				System.out.println("Press 3 to get Equipment Id");
				System.out.println("Enter your choice :-");
				choice=sc.nextInt();
				
				 
			switch(choice) {
			case 1: gym.getEquipmentsDetails();
			  break;
			  
			case 2:System.out.println("Enter the equipment Name");
			EquipmentsDTO dto1=gym.getGymByEquipmentName(sc.next());
			    	 if(dto1!=null) {
			    		 System.out.println(dto1);
			    		 
			    	 }
			    	 else {
			    		 System.out.println("No equipments found by Name");
			    	 }
			    	 break;
			case 3:System.out.println("Enter the equipment Id");
			EquipmentsDTO dto2=gym.getEquipmentById(sc.nextInt());
			       if(dto2!=null) {
			    	   System.out.println(dto2);
			       }
			       else {
			    	   System.out.println("No equipments found by Id");
			       }
			       
			       default:
			    	 System.out.println("invalid Choice");
			}
			       System.out.println("do want continue press y/n");
			       text=sc.next();
			       
			}  
			       while(text.equals("y"));
			    //System.out.println(getItemName(sc.next());	
			   
			}
		
		
		
		System.out.println("\n"+"Enter equipmentId and equipmentName to be updated");
		int id=sc.nextInt();
		String name=sc.next();
		gym.updateEquipmentNameByEquipmentId(name, id);
		
		gym.getEquipmentsDetails();
		System.out.println("\n"+"Enter id to be deleted");
		int id1=sc.nextInt();
		gym.deleteEquipmentsById(id1);
		
	}
}
