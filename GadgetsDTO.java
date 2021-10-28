package com.xworkz.shop;

public class GadgetsDTO {
	private int gadgetID;
	private String gadgetName;
	private double price;
	private int rating;

	public int getGadgetID() {
		return gadgetID;
	}
	public void setGadgetID(int gadgetID) {
		this.gadgetID = gadgetID;
	}
	public String getGadgetName() {
		return gadgetName;
	}
	public void setGadgetName(String gadgetName) {
		this.gadgetName = gadgetName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "GadgetsDTO [gadgetID=" + gadgetID + ", gadgetName=" + gadgetName + ", price=" + price + ", rating=" + rating
				+ "]";
	}
}
