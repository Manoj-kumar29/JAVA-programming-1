package com.xworkz.Mobile;

public class Mobile {
public ApplicationDTO[] applications;
	
	private int index;
	private static int s=0;
	
	public Mobile(int size) {
		 applications=new ApplicationDTO[size];
	}
	
	//create applications:
	public boolean createApplication(ApplicationDTO applications) {
		boolean isCreated=false;
		System.out.println("inside create application()");
		if(applications!=null) {
			this.applications[index++]=applications;
			isCreated=true;
		}
		else {
			System.out.println("No applications created");
			return isCreated;
		}
		return isCreated;
	}
	
	public void getApps(){
		for(int i=0;i<applications.length-s;i++) {
			System.out.println(applications[i]);
		}
	}
	
	//read applications:
	public boolean getApplicationByAppname(String appName) {
		boolean f=false;
		ApplicationDTO application = null;
		System.out.println("inside get application by app name");
		if(applications!=null) {
			for(int i=0;i<applications.length;i++) {
				if(applications[i].getAppName().equals(appName)){
					System.out.println("application found by name:"+appName);
					f=true;
				}
				else {
					f=false;
				}
			}
		}
		if(f==false){
			System.out.println("No application found");
		}
		return f;
	}
	
	//update application:
	public boolean updateSizeByAppId(int appId,int sizeInMb) {
		boolean update=false;
		ApplicationDTO application = null;
		System.out.println("inside update rating by size");
		if(appId>0 && sizeInMb>0) {
			for(int i=0;i<applications.length;i++) {
				if(applications[i].getAppId()==appId) {
					System.out.println("application found by id:"+appId);
					applications[i].setSizeInMb(sizeInMb);
					update=true;
				}
				else {
					update=false;
				}
			}
		}
		if(update==false) {
			System.out.println("no rating updated");
		}
		return update;
	}
	
	//delete application:
	public boolean deleteApplicationById(int appId) {
		boolean delete=false;
		int id=0;
		ApplicationDTO application = null;
		System.out.println("inside delete application method");
		if(appId>0) {
			for(int i=0;i<applications.length;i++) {
				if(applications[i].getAppId()== appId) {
					System.out.println("application deleted by id:"+appId);
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
				for(int i=id;i<applications.length-1;i++) {
					applications[i]=applications[i+1];
				}
			}
		}
		if(delete==false) {
			System.out.println("No application deleted");
		}
		return delete;
	}
}
