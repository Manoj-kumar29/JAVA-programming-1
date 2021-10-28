package com.xworkz.phoneapp;

import java.util.*;
public class PhoneAppUtil {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to PhoneBook");
		System.out.println("Enter the number of contacts");
		int size=sc.nextInt();
		
		PhoneApp phone=new PhoneApp(size);
		
		for(int i=0;i<size;i++) {
			ContactsDTO cont=new ContactsDTO();
			System.out.println("Enter serial number");
			cont.setSerialNo(sc.nextInt());
			
			System.out.println("Enter name in contact ");
			cont.setName(sc.next());
			
			System.out.println("Enter contact number");
			cont.setConNum(sc.nextLong());
			
			boolean isCreated=phone.createContacts(cont);
			System.out.println(isCreated);
		}
		
		int choice;
		String text;
		do {
			System.out.println("press 1 to get contacts");
			System.out.println("press 2 to get contact by name");
			System.out.println("press 3 to update contact number by serial number");
			System.out.println("press 4 to delete contact");
			System.out.println("enter the choice:");
			
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				phone.getContacts();
				break;
			case 2:
				System.out.println("enter contact name");
				boolean name=phone.getContactByName(sc.next());
				if(name!=false) {
					System.out.println(name);
					phone.getContacts();
				}
				else {
					System.out.println("No contact found by name");
				}
				break;
			case 3:
				System.out.println("enter serial no and contact number to update");
				boolean update=phone.updatecontactNumBySerialNo(sc.nextInt(), sc.nextLong());
				if(update!=false) {
					System.out.println(update);
					phone.getContacts();
				}
				else {
					System.out.println("No contact number updated");
				}
				break;
			case 4:
				System.out.println("enter serial number to delete");
				boolean delete=phone.deleteContactBySerialNo(sc.nextInt());
				if(delete!=false) {
					System.out.println(delete);
					phone.getContacts();
				}
				else {
					System.out.println("No contacts deleted");
				}
				break;
			default:
				System.out.println("Enter valid choice");
			}
			System.out.println("if you want to continue?? press y or n");
			text=sc.next();
		}while(text.equals("y"));
		System.out.println("thank you for your time ....hav a grt day");
		
			
		}
		
}
