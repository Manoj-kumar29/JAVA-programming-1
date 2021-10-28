package com.xworkz.City;

import java.util.Scanner;

public class CityUtil {
	public static void main(String a[]){

		System.out.println("\n"+"Enter the number of companys");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		City city = new City(size);
		if(size>0)
		{	
			for(int i = 0; i< size; i++)
			{
			CompanyDTO dto = new CompanyDTO();
			System.out.println("Enter the company details");
			
			System.out.println("Enter the company ID");
			int companyId = sc.nextInt();
			dto.setCompanyId(companyId);
			
			System.out.println("Enter the company name");
			String companyName = sc.next();
			dto.setCompanyName(companyName);
			
			
			boolean isAdded = city.createCompanyDetails(dto);
			System.out.println(isAdded);
			}
				
			int choice;
			String text;
			do {
				System.out.println("Press 1 to get all Companys");
				System.out.println("Press 2 to get all Companys by Name");
				System.out.println("Press 3 to get all Companys by Id");
				System.out.println("Enter the choice:-");
				choice = sc.nextInt();
				switch(choice){
				case 1: city.getAllCompanys();
				break;
				case 2: System.out.println("Enter the Company Name"); 
					CompanyDTO dto = city.getCompanyByName(sc.next());
					   if(dto!=null)
					   {
						   System.out.println("dto");
					   }
					   else {
						   System.out.println("No Company Found by Name");
					   }
				break;
				case 3:System.out.println("Enter the Company Id");
				CompanyDTO dto1 = city.getCompanyById(sc.nextInt());
				if(dto1!=null)
				{
					System.out.println("dto1");
				}
				else {
					System.out.println("No Company Found by Id");
				}
				break;
				default:
				System.out.println("sorry Invalid Choice.......Please provide valid choice");
				}
				System.out.println("do you want to continue??? press y/n");
				text=sc.next();
				
			}while(text.equals("y"));
			//System.out.println(google.getApplicationByName(sc.next()));
				}
			
			System.out.println("Enter company id and company name  to update");
			int applicationId1=sc.nextInt();
		    String applicationName1=sc.next();
			city.updateCompanyNameByCompanyId("TCS",1);
			
		
			
			System.out.println("\n"+"Enter company Id to delete");
			int id1=sc.nextInt();
			city.deleteCompanyById(id1);
			
			city.getAllCompanys();
			
			}
}
