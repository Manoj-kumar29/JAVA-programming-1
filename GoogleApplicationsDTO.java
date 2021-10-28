package com.xworkz.googleapp;

public class GoogleApplicationsDTO {
	public GoogleApplicationsDTO(){
		System.out.println(this.getClass().getSimpleName()+"object created");
		}

		   private int applicationId;
		   private String applicationName;
		   
		   
		   public void setApplicationId(int applicationId){
				this.applicationId=applicationId;
				}

			public int getApplicationId(){
				return applicationId;
				}

			public void setApplicationName(String applicationName){
				this.applicationName=applicationName;
				}

			public String getApplicationName(){
				return applicationName;
				}
			
			@Override
			public String toString(){
return"GoogleApplicationsDTO-{applicationId="+this.applicationId+",applicationName="+this.applicationName+"}";
			}
}
