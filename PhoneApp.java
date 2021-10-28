package com.xworkz.phoneapp;

public class PhoneApp {
public ContactsDTO[] contacts;
	
	int index;
	private static int s=0;
	
	public PhoneApp(int size) {
		contacts =new ContactsDTO[size];
	}
	
	//create contacts:
	public boolean createContacts(ContactsDTO contacts) {
		boolean isCreated=false;
		System.out.println("inside create contacts");
		if(contacts!=null) {
			this.contacts[index++]=contacts;
			isCreated=true;
		}
		else {
			System.out.println("No contact created");
			return isCreated;
		}
		return isCreated;
	}
	
	public void getContacts() {
		for(int i=0;i<contacts.length-s;i++) {
			System.out.println(contacts[i]);
		}
	}
	
	//get operation:
	public boolean getContactByName(String conName) {
		boolean f=false;
		ContactsDTO contact=null;
		if(contacts!=null) {
			for(int i=0;i<contacts.length;i++){
				if(contacts[i].getName().equals(conName)){
					System.out.println("contact found by name:"+conName);
					f=true;
					break;
				}
				else {
					f=false;
				}
			}
		}
		if(f==false) {
			System.out.println("No contact found");
		}
		return f;
	}
	
	
	
	//update operation:
	public boolean updatecontactNumBySerialNo(int serialNo,long conNo) {
		boolean update=false;
		ContactsDTO contact=null;
		System.out.println("inside update method");
		if(serialNo>0 && conNo>0) {
			for(int i=0;i<contacts.length;i++) {
				if(contacts[i].getSerialNo()==serialNo) {
					System.out.println("contact number updated by serialNo:"+serialNo);
					contacts[i].setConNum(conNo);
					update=true;
					break;
				}
				else {
					update=false;
				}
			}
		}
		if(update==false) {
			System.out.println("No contact number updated");
		}
		return update;
	}
	
	//delete operation:
	public boolean deleteContactBySerialNo(int serialNo) {
		boolean delete=false;
		int id=0;
		ContactsDTO contact=null;
		System.out.println("inside delete operation");
		if(serialNo>0) {
			for(int i=0;i<contacts.length;i++) {
				if(contacts[i].getSerialNo()==serialNo) {
					System.out.println("contact number deleted by serialNo:"+serialNo);
					id=i;
					s=s+1;
					delete=true;
					break;
				}
				else {
					delete=false;
				}
			}
			if(id!=-1) {
				for(int i=id;i<contacts.length-1;i++) {
					contacts[i]=contacts[i+1];
				}
			}
		}
		if(delete==false){
			System.out.println("No contacts deleted");
		}
		return delete;
	}
	
}
