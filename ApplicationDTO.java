package com.xworkz.Mobile;

public class ApplicationDTO {
	private int appId;
	private String appName;
	private int sizeInMb;
	private String rating;
	private boolean isAvailableInPlaystore;
	
	

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public int getSizeInMb() {
		return sizeInMb;
	}

	public void setSizeInMb(int sizeInMb) {
		this.sizeInMb = sizeInMb;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public boolean isAvailableInPlaystore() {
		return isAvailableInPlaystore;
	}

	public void setAvailableInPlaystore(boolean isAvailableInPlaystore) {
		this.isAvailableInPlaystore = isAvailableInPlaystore;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [appId=" + appId + ", appName=" + appName + ", sizeInMb=" + sizeInMb + ", rating="
				+ rating + ", isAvailableInPlaystore=" + isAvailableInPlaystore + "]";
	}

	
	}
