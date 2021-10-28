package com.xworkz.Hospital.Hospitalapp.dto;


import java.util.*;
public class HospitalUtil {
	public static void main(String a[]) {

	   	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of patients:");
		int size = sc.nextInt();

		Hospital hospital = new Hospital(size);

		for (int i = 0; i < size; i++) {

			PatientDTO dto = new PatientDTO();
			System.out.println("enter patient id:");
			int patientId = sc.nextInt();
			dto.setPatientId(patientId);
			
			

			System.out.println("enter patient name:");
			String patientName = sc.next();
			dto.setPatientName(patientName);

			System.out.println("enter patient address:");
			String address = sc.next();
			dto.setAddress(address);

			System.out.println("enter patient age:");
			int age = sc.nextInt();
			dto.setAge(age);

			System.out.println("enter patient Gender:");
			String gender = sc.next();
			dto.setGender(gender);

			System.out.println("enter patient bloodGroup:");
			String bloodGroup = sc.next();
			dto.setBloodGroup(bloodGroup);

			System.out.println("enter patient Contact number:");
			long contactNo = sc.nextLong();
			dto.setContactNo(contactNo);

			
			AddressDTO adress = new AddressDTO();			
			dto.setAddress(address);
			System.out.println("Enter the adress id");
			int addressId = sc.nextInt();
			adress.setAddressId(addressId);

			
			CountryDTO coun = new CountryDTO();
			System.out.println("Enter thecountry id");
			int countryId = sc.nextInt();
			coun.setCountryId(countryId);

			System.out.println("enter the name of the country");
			String countryName = sc.next();
			coun.setCountryName(countryName);
			adress.setCountry(coun);

			
			StateDTO state = new StateDTO();
			System.out.println("Enter the state id");
			int stateid = sc.nextInt();
			state.setStateId(stateid);

			System.out.println("Enter the state name");
			String stateName = sc.next();
			state.setStateName(stateName);
			coun.setState(state);

			
			boolean isAdded = hospital.createPatients(dto);
			System.out.println(isAdded);
			
		}
		
		int choice ;
		String text ;
		
		do {
			System.out.println("Press 1 to get all Patients");
			System.out.println("Press 2 to get Patients By Id");
			System.out.println("Press 3 to get patient By Name");
			System.out.println("Press 4 to get Address By AddressId");
			System.out.println("Enter your choice :-");
			choice = sc.nextInt();
			
			switch(choice) 
			{ 
			case 1 : hospital.getAllPatients();
				break;
			case 2 :
			System.out.println("Enter the Patient Id");
				int id=sc.nextInt();
				if(id!=0)
				{
					System.out.println(hospital.getPatientById(id));
				}else
				{
					System.out.println("No patient found by  id" +id);
				}
				break;
			case 3:
				System.out.println("enter the patient name");
				String name=sc.next();
				if(name!=null)
				{
					System.out.println("hospital.getPatientByName(name)");
				}
				else
				{
					System.out.println("patient name not found"+name);
				}
				break;
			case 4:
				System.out.println("please enter the valid id");
			
			default:
				System.out.println("please select the valid choice");
			
		}
		System.out.println("do you want to continue press y\n");
		text=sc.next();
	}while(text.equals("y"));
		
		//System.out.println("enter the patient name to fetch details:");
		//String name = sc.next();
		//System.out.println(hospital.getPatientByName(name));

		//System.out.println("enter the patient id to fetch details:");
		//int id = sc.nextInt();
		//System.out.println(hospital.getPatientById(id));

		//System.out.println("enter the adressid tofetch deails");
		//int aid = sc.nextInt();
		//System.out.println(hospital.getAddressById(aid));

		//System.out.println("Enter the state name to fetch details");
		//String state = sc.next();
		//System.out.println(hospital.getAdressbyStateName(state));
		
	}
}
