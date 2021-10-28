package com.xworkz.Hospital.Hospitalapp.dto;

public class StateDTO {
	private int stateId;
	private String stateName;
	private String areaName;
	
	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	
	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	@Override
	public String toString() {
		return "StateDTO [StateId=" + stateId + ", StateName=" + stateName + ", AreaName=" + areaName + "]";
	}
	
	
	 

}
