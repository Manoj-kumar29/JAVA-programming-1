package com.xworkz.City;



public class City {
	public CompanyDTO[] companys ;
	  private int index;

	public City(int size){
	 companys=new CompanyDTO[size];
	}
	
	public boolean createCompanyDetails(CompanyDTO companys){
		boolean companysAdded=false;
		System.out.println("inside createCompanys()");
		if(companys!=null){
		  this.companys[index++]=companys;
		  companysAdded=true;
		}

		else{
		System.out.println("No companys added");
		return companysAdded=false;
		}
		return companysAdded;
		}
	
	public void getAllCompanys(){
		for(int i=0;i<companys.length;i++){
		System.out.println(companys[i]);
		}
		}
	
	public CompanyDTO getCompanyByName(String companyName){
		CompanyDTO CompanyDTO=null;
		System.out.println("inside getCompanyByName()");
		if(companyName!=null){
		   for(int i=0;i<companys.length;i++){
		     if(companys[i].getCompanyName().equals(companyName)){
		System.out.println("Company found by Name:"+companyName);
		      CompanyDTO=companys[i];
		     }
		  
		else{
		System.out.println("No Company Found by Name:"+companyName);
		}
		   }
		}
		return CompanyDTO;
		}


public CompanyDTO getCompanyById(int companyId){
	CompanyDTO CompanyDTO=null;
	System.out.println("inside getCompanyById()");
	if(companyId!=0){
	   for(int i=0;i<companys.length;i++){
	     if(companys[i].getCompanyId()==(companyId)){
	System.out.println("Company found by Id:"+companyId);
	   CompanyDTO=companys[i];
	     }
	  
	else{
	System.out.println("No Company Found by Id:"+companyId);
	}
	   }
	}
	return CompanyDTO;
}


public void updateCompanyNameByCompanyId(String companyName,int companyId){
	System.out.println("inside updateCompanyNameByCompanyId()");
	if(companyId>0 && companyName!=null){
	   for(int i=0;i<companys.length;i++){
	     if(companys[i].getCompanyId()==(companyId)){
	System.out.println("Company Name updated by:"+companyName);
	   companys[i].setCompanyName(companyName);
	     }

	else{
	System.out.println("Company not updated");
	}
	   }
	}
}


public void deleteCompanyById(int companyId){
	System.out.println("Inside deleteCompanyById()");
	if(companyId > 0){
	for(int i=0; i<companys.length; i++){
	if(companys[i].getCompanyId()==(companyId)){
	System.out.println("Company deleted by id : "+companyId);
	companys[i].setCompanyId(companyId);
	}
	
	
	else{
	System.out.println("Company is not deleted");
	}
	}
	}
			
}
}
