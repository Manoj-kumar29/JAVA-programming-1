package com.xworkz.Mobile;

import java.util.*;
public class MobileUtil {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of applications");
		int size=sc.nextInt();
		
		Mobile mob=new Mobile(size);
		
		for(int i=0;i<size;i++) {
			ApplicationDTO app=new ApplicationDTO();
			System.out.println("Enter the application id");
			app.setAppId(sc.nextInt());
			
			System.out.println("Enter the application name");
			app.setAppName(sc.next());
			
			System.out.println("Enter the size of app in MB");
			app.setSizeInMb(sc.nextInt());
			
			System.out.println("Enter rating of app");
			app.setRating(sc.next());
			
			System.out.println("Enter the app is present in playstore or not");
			app.setAvailableInPlaystore(sc.nextBoolean());
			
			boolean isAdded=mob.createApplication(app);
			System.out.println(isAdded);
				
		}
		int choice;
		String text;
		do {
			System.out.println("press 1 to get application");
			System.out.println("press 2 to get application by name");
			System.out.println("press 3 to update size by app id");
			System.out.println("press 4 to delete app by id");
			System.out.println("enter your choice:");
			
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				mob.getApps();
				break;
			case 2:
				System.out.println("enter name");
				boolean name=mob.getApplicationByAppname(sc.next());
				if(name!=false) {
					System.out.println(name);
					mob.getApps();
				}
				else {
					System.out.println("No application found");
				}
				break;
			case 3:
				System.out.println("enter id to update size");
				boolean update=mob.updateSizeByAppId(sc.nextInt(), sc.nextInt());
				if(update!=false) {
					System.out.println(update);
					mob.getApps();
				}
				else {
					System.out.println("No update in size of app");
				}
				
				break;
			case 4:
				System.out.println("enter app id to delete");
				boolean delet=mob.deleteApplicationById(sc.nextInt());
				if(delet!=false) {
					System.out.println(delet);
					mob.getApps();
				}
				else {
					System.out.println("No application deleted");
				}
				break;
			default:
				System.out.println("enter valid choice....");
			}
			System.out.println("if you want to continue?? press y or n");
			text=sc.next();
			
		}while(text.equals("y"));
		System.out.println("Thank you for choosing application process");
		
		
	}
}
