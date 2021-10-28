package com.xworkz.shop;

import java.util.Scanner;
public class ShopUtil {
	public static void main(String args[]) {
		System.out.println("Well come to Electronics and Gadgets");
		System.out.println("\n"+"Please enter the number of gadgets");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Shop shop = new Shop(size);
		if(size >0) {
			for(int i =0; i<size; i++) {
				GadgetsDTO dto = new GadgetsDTO();
				System.out.println("ENTER THE GADGET DETAILS");
				
				System.out.println("ENTER THE GADGET ID");
				int gadgetID = sc.nextInt();
				dto.setGadgetID(gadgetID);
				
				System.out.println("ENTER THE GADGET NAME");
				String gadgetName = sc.next();
				dto.setGadgetName(gadgetName);
				
				System.out.println("ENTER THE GADGET PRICE");
				double price = sc.nextDouble();
				dto.setPrice(price);
				
				System.out.println("ENTER THE GADGET RATING");
				int ratings = sc.nextInt();
				dto.setRating(ratings);
				
				boolean isAdded = shop.creatGadgets(dto);
				System.out.println(isAdded);
			}
	shop.getGadgets();
	
	System.out.println("Get gadget By id");
	int gadgetID= sc.nextInt();
	System.out.println(shop.getGadgetByID(gadgetID));
	
	System.out.println("\n"+"Enter the agdget ID to Update Price");
	int id = sc.nextInt();
	double prc = sc.nextDouble();
	shop.updateGadgetPriceById(id, prc);
	shop.getGadgets();
	
	System.out.println("\n"+"Enter Gadget Id to Delete");
	int id1 = sc.nextInt();
	shop.deleteGadgetByID(id1);
	
		}
		else {
			System.out.println("OOPS...! Invalid gadget");
		}
	}
}
