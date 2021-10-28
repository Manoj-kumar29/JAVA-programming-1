package com.xworkz.bankapp;

import com.xworkz.bankapp.dto.AccountDTO;
public class Bank {
	public AccountDTO[] account;
	private int index;
	
	public Bank(int size)
	{
		account = new AccountDTO[size];
	}
	public boolean addAccountDetails(AccountDTO account)
	{
		boolean detAdded=false;
		if(account!=null)
		{
			this.account[index++]=account;
			detAdded=true;
		}
		else
		{
		System.out.println("Account details not found");
		detAdded=false;
		}
		return detAdded;
	}
	//get account details
	public void getAccountDetails()
	{
		for(int i=0; i<account.length;i++)
		{
			System.out.println("account[i]");
		}
	}
	//get account detils by account numbder..
	public AccountDTO getAccountByAccountNum(long accountNum)
		{
		AccountDTO accountdto=null;
		if(accountNum>0)
		{
			
			for(int i=0;i<account.length;i++)
			{
				if(account[i].getAccntNum()==accountNum)
				{
					accountdto=account[i];
					return accountdto;
				}
				else
					System.out.println("No records found");
			}
		}
		return accountdto;
	}
	
	//Get Account details by name
	public AccountDTO getAccountByName(String name)
	{
		AccountDTO accountdto=null;
		if(name!=null)
		{
			for(int i=0;i<account.length;i++)
			{
				if(account[i].getName()==name)
				{
					accountdto = account[i];
					return accountdto;
				}
				else
					System.out.println("No record found");
			}
		}
		return accountdto;
	}
	
	//get account detils by contact number
	
	public AccountDTO getAccountByMblNum(long mblNum)
	{
		AccountDTO accountdto=null;
		if(mblNum>0)
		{
			for(int i=0;i<account.length;i++)
			{
				if(account[i].getMblNum()==mblNum)
				{
					accountdto=account[i];
					return accountdto;
				}
				else
					System.out.println("No records found");
			}
		}
		return accountdto;
	}
	
	//get Account details by adhar number
	public AccountDTO getAccountByAdharNum(long adharNum)
	{
		AccountDTO accountdto=null;
		if(adharNum>0)
		{
			for(int i=0;i<account.length;i++)
			{
				if(account[i].getAdharNum()==adharNum)
				{
					accountdto = account[i];
							return accountdto;
				}
				else
					System.out.println("No records found");
			}
		}
		return accountdto;
	}
	
	//update name by account number
	public AccountDTO updateNameByAccountNum(long accountNum, String name)
	{
		AccountDTO accountdto=null;
		if(accountNum>0 && name!=null)
		{
			for(int i=0;i<account.length;i++)
			{
				if(account[i].getAccntNum()==accountNum)
				{
					account[i].setName(name);
					accountdto = account[i];
					return accountdto;
				}
				else
					System.out.println("No records found");
			}
		}
		return accountdto;
	}
	
	//update age by mobile number
	public AccountDTO updateAgeByMblNum(long mblNum, int age)
	{
		AccountDTO accountdto=null;
		if(mblNum>0 && age>0)
		{
			for(int i=0; i<account.length;i++)
			{
				if(account[i].getMblNum()==mblNum)
				{
					account[i].setAge(age);
					accountdto=account[i];
					return accountdto;
				}
				else
					System.out.println("No recods found");
			}
		}
		return accountdto;
	}
	//Delete Account details by account number
	
	public AccountDTO deleteAccountByAccountNum(long accountNum)
	{
		AccountDTO accountdto=null;
		int y=0;
		if(accountNum>0)
		{
			for(int i=0;i<account.length;i++)
			{
				if(account[i].getAccntNum()==accountNum)
				{
					y = i;
					break;
					
				}
				else
				{
					System.out.println("No records found");
				}
				if(account.length==1)
				{
					account[i]=null;
					accountdto = account[i];
					return accountdto;
				}
				else
				{
					for(int x=y;x<account.length-1;x++) {
						account[i]=account[i+1];
						accountdto=account[i];
					}
				}
			}
		}
		return accountdto;
	}
	  
	
}
