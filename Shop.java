package com.xworkz.shop;



public class Shop {
	public GadgetsDTO[] gadgets;
	private int index;
	private int gadgetID;
	public static int s=0;


	public Shop(int size) {
		gadgets = new GadgetsDTO[size];
	}

	public boolean creatGadgets(GadgetsDTO gadgets) {
		boolean gadgetsAdded =false;
		System.out.println("inside create gadgets");
		if(gadgets != null) {
			this.gadgets[index++] = gadgets;
			gadgetsAdded =true;
		}
		else {
			System.out.println("No gadget added");
			return gadgetsAdded = false;
		}
		return gadgetsAdded;
	}
	public void getGadgets()
	{
		for(int i=0; i<gadgets.length-s; i++)
		{
			System.out.println(gadgets[i]);
		}
	}

	public GadgetsDTO getGadgetByID(int gadgetID) {
		boolean f = false;
		GadgetsDTO gadgetsDto = null;
		System.out.println("inside get gadgets by id method");
		if(gadgetID != 0) {
			for(int i=0; i<gadgets.length; i++) {
				if(gadgets[i].getGadgetID()==(gadgetID))
				{
					System.out.println("Gadget found by ID : "+gadgetID);
					gadgetsDto = gadgets[i];
					f = true;
					break;
				}
				else
				{
					f= false;
				}
			}
		}
		if(f==false)
		{
			System.out.println("Gadgets not found");
		}
		return gadgetsDto;
	}

	public boolean updateGadgetPriceById(int gadgetID, double price)
	{
	 boolean f= false;
	 GadgetsDTO gadgetsDto = null;
	 System.out.println("Inside update Price by Id Method");
	 if(gadgetID > 0 && price >0)
	 {
		 for(int i=0; i<gadgets.length; i++)
		 {
			 
			if(gadgets[i].getGadgetID()==(gadgetID))
			 {
				 System.out.println("Gadgets price updated by : "+price);
				 gadgets[i].setPrice(price);
				 f=true;
				 break;
			 }
			 else
			 {
				 f = false;
			 }
		 }
	 }
	 if(f==false)
	 {
		 System.out.println("Gadget Price not Updated");
	 }
		return f;
	}

	public boolean deleteGadgetByID(int id)
	{
	boolean f = false;
	int y=0;
	GadgetsDTO gadgetDto = null;
	System.out.println("Inside Delete gadget Method");
	if(id >0) 
	{
	for(int i=0; i<gadgets.length; i++)	
	{
	if(gadgets[i].getGadgetID()==(id))
	{
		System.out.println("gadget deleted by ID: "+id);
		y=i;
		s=s+1;
		f=true;
		break;
	}
	else {
		f=false;
	}
	}
	if(y!=-1)
	{
	for(int i=y;i<gadgets.length-1;i++)
	{
	gadgets[i]=gadgets[i+1];	
	}
	}
	}
	if(f==false) {
		System.out.println("Gadgets not Deleted");
	}
	return f;
	}
	
}
