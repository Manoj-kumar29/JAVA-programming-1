package com.xworkz.Hospital.Hospitalapp.dto;

public class AddressDTO {
	
	private int addressId;
	private CountryDTO country;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public CountryDTO getCountry() {
		return country;
	}
	public void setCountry(CountryDTO country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "AddressDTO [AddressId=" + addressId + ", country=" + country + "]";
	}

}
