package com.xworkz.bankapp;
import java.util.*;

import com.xworkz.bankapp.dto.AccountDTO;

public class BankUtil {
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Entr number of account details to add:");
	int size=sc.nextInt();
	Bank bank=new Bank(size);
	for(int i=0;i<size;i++)
	{
		AccountDTO dto=new AccountDTO();
		System.out.println("Enter the account detils");
		System.out.println("Enter the account number: ");
		dto.setAccntNum(sc.nextLong());
		
		System.out.println("Enter the account holder name: ");
		dto.setName(sc.next());
		
		System.out.println("Enter age: ");
		dto.setAge(sc.nextInt());
		
		System.out.println("Enter mobile number");
		dto.setMblNum(sc.nextLong());
		
		System.out.println("Enter adhar number: ");
		dto.setAdharNum(sc.nextLong());
		
		System.out.println("Enter type of account");
		dto.setAccntType(sc.next());
		
		boolean detAdded = bank.addAccountDetails(dto);
		System.out.println(detAdded);
	}
	int choice;
	String text;
	
	do {
		System.out.println("Enter 1 to get Account details:");
		System.out.println("Enter 2 to get Account details by Account number:");
		System.out.println("Enter 3 to get Account details by Name:");
		System.out.println("Enter 4 to get Account details by Contact number:");
		System.out.println("Enter 5 to get Account details by Adhar number:");
		System.out.println("Enter 6 to Update Name by account number:");
		System.out.println("Enter 7 to Update Age by mobile number:");		
		System.out.println("Enter 8 to delete account details by account number:");
		
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: bank.getAccountDetails();
					break;
		case 2:System.out.println("Enter Account number: ");
				AccountDTO a = bank.getAccountByAccountNum(sc.nextLong());
				if(a!=null)
				{
					System.out.println(a);
				}
				else
					System.out.println("No records found..");
				break;
		case 3: System.out.println("Enter Name:..");
				AccountDTO b = bank.getAccountByName(sc.next());
				if(b!=null)
				{
					System.out.println(b);
				}
				else
					System.out.println("No records found");
				break;
		case 4:System.out.println("Enter contact number");
			AccountDTO c=bank.getAccountByMblNum(sc.nextLong());
			if(c!= null)
			{
				System.out.println(c);
			}
			else
				System.out.println("No records found..");
			break;
	case 5: System.out.println("Enter Adhar number:");
			AccountDTO d= bank.getAccountByAdharNum(sc.nextLong());
			if(d!= null)
			{
				System.out.println(d);
			}
			else
				System.out.println("No records found..");
			break;
	case 6: System.out.println("Enter Account number and Name:");
			AccountDTO e= bank.updateNameByAccountNum(sc.nextLong(),sc.next());
			if(e!= null)
			{
				System.out.println(e);
			}
			else
				System.out.println("No records found..");
			break;
	case 7: System.out.println("Enter Mobile Number and Age:");
			AccountDTO f= bank.updateAgeByMblNum(sc.nextLong(),sc.nextInt());
			if(f!= null)
			{
				System.out.println(f);
			}
			else
				System.out.println("No records found..");
			break;
	
	case 9: System.out.println("Enter Account number:");
			AccountDTO h= bank.deleteAccountByAccountNum(sc.nextLong());
			if(h!= null)
			{
				System.out.println(h);
			}
			else
				System.out.println("No records found..");
			break;
			
			default:
				System.out.println("Invalid Choice...");
}
System.out.println("Do you want to continue? y or n?");
text = sc.next();
}
while(text.equals("y"));
System.out.println("Thanks for visiting....");
}
		
		
		
}
