package com.xworkz.Hospital.Hospitalapp.dto;

public class Hospital {
		
	public PatientDTO[] patients;
	public AddressDTO adress;

	private int index;

	public Hospital(int size){
	patients=new PatientDTO[size];
	}

	public boolean createPatients(PatientDTO patients){

	 boolean patientAdded=false;

	System.out.println("inside createPatients method");

	if(patients!=null){            //null check logic;
	  this.patients[index++]=patients;
	  patientAdded=true;
	}
	else{
	 System.out.println("No Patient Added");
	 return patientAdded=false;
	}
	return patientAdded;
	}

	public void getAllPatients(){
	for(int i=0;i<patients.length;i++){
	System.out.println(patients[i]);
	}

	}

	public PatientDTO getPatientByName(String patientName){
	PatientDTO patientDTO=null;
	System.out.println("Inside the getPatientByName()");

	 if(patientName!=null){

	  for(int i=0;i<patients.length;i++){

	    if(patients[i].getPatientName().equals(patientName)){
	      System.out.println("Patient found by Name: "+patientName);
	      patientDTO=patients[i];
	     }
	   }
	 }
	 else{
	      System.out.println("No records found");
	     }
	 return patientDTO;
	}

	 public PatientDTO getPatientById(int patientId){
	PatientDTO patientDTO=null;
	System.out.println("Inside the getPatientById()");

	 if(patientId!=0){

	  for(int i=0;i<patients.length;i++){

	    if(patients[i].getPatientId() == patientId){
	      System.out.println("Patient found by Id: "+patientId);
	      patientDTO=patients[i];
	     }
	   }
	 }
	 else{
	      System.out.println("No records found");
	     }
	 return patientDTO;
	}

	public PatientDTO getAddressByAddressId(int addressid )
	{
		PatientDTO pateintdto=null;
		System.out.println("Inside the getAdressById()");

		 if(addressid!=0){

		  for(int i=0;i<patients.length;i++){

		    if(patients[i].getAddressDTO().getAddressId()==(addressid))
		    {
		      System.out.println("Patient found by adressid: "+addressid);
		      pateintdto=patients[i];
		     }
		   }
		 }
		 else{
		      System.out.println("No records found");
		     }
		 return pateintdto;
	}
	
	public PatientDTO getAddressbyStateName(String stateName)
	{
	PatientDTO patient=null;
	System.out.println("inside getAddressbyStateName");
	if(stateName!=null)
	{
		for(int i=0;i<patients.length;i++)
		{
			if(patients[i].getAddressDTO().getCountry().getState().getStateName().equals(stateName))
			{
				System.out.println("adress found");
				patient=patients[i];
			}
		}
	}
	else
	{
		System.out.println("no name found");
		
	}
	return patient;
}

	
		}
