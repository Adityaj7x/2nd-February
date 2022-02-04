package com.vehicledekho.vehiclemanagement.data;

public abstract class Vehicle {

	private static int maxVehicleId;

	private int vehicleId=0;
	private String vehicleName;
	private String vehicleCompany;
	private String vehicleType;
	private int exShowroomPrice;
	private String vehicleRegistrationState;
	private String vehicleColour;
	private String vehicleRegistrationNumber;
	private int vehiclePower;

	public Vehicle() {
		setVehicleId(++maxVehicleId);
		}

	public int getVehicleId() {
		return vehicleId;
	}

	private void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleCompany() {
		return vehicleCompany;
	}

	public void setVehicleCompany(String vehicleCompany) {
		this.vehicleCompany = vehicleCompany;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getExShowroomPrice() {
		return exShowroomPrice;
	}

	public void setExShowroomPrice(int exShowroomPrice) {
		this.exShowroomPrice = exShowroomPrice;
	}
	/*-----------------------------------------------------------------------------------------*/
	
	

	public String getVehicleRegistrationState() {
		return vehicleRegistrationState;
	}

	public void setVehicleRegistrationState(String vehicleRegistrationState) {
		this.vehicleRegistrationState = vehicleRegistrationState;
	}

	public String getVehicleColour() {
		return vehicleColour;
	}

	public void setVehicleColour(String vehicleColour) {
		this.vehicleColour = vehicleColour;
	}

	public String getVehicleRegistrationNumber() {
		return vehicleRegistrationNumber;
	}

	public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
	}

	public int getVehiclePower() {
		return vehiclePower;
	}

	public void setVehiclePower(int vehiclePower) {
		this.vehiclePower = vehiclePower;
	}

	public abstract int getOnRoadPrice();
}
