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
	private String vehicleMaximumTorque;
	private int vehicleEngineDisplacement;
	private int vehicleNumberOfCylinders;
	private String vehicleFuelCapacity;
	private String vehicleFuelType;
	private String vehicleRange;
	
	private String vehicleMileage;
	private String vehicleGearBox;
	private String vehicleShockAbsorbers;
	private String vehicleDimensions;
	private int vehicleGroundClearance;
	
	

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
	/*-------------------------------------------------------*/
	
	

	public String getVehicleMaximumTorque() {
		return vehicleMaximumTorque;
	}

	public void setVehicleMaximumTorque(String vehicleMaximumTorque) {
		this.vehicleMaximumTorque = vehicleMaximumTorque;
	}

	public int getVehicleEngineDisplacement() {
		return vehicleEngineDisplacement;
	}

	public void setVehicleEngineDisplacement(int vehicleEngineDisplacement) {
		this.vehicleEngineDisplacement = vehicleEngineDisplacement;
	}

	public int getVehicleNumberOfCylinders() {
		return vehicleNumberOfCylinders;
	}

	public void setVehicleNumberOfCylinders(int vehicleNumberOfCylinders) {
		this.vehicleNumberOfCylinders = vehicleNumberOfCylinders;
	}

	public String getVehicleFuelCapacity() {
		return vehicleFuelCapacity;
	}

	public void setVehicleFuelCapacity(String vehicleFuelCapacity) {
		this.vehicleFuelCapacity = vehicleFuelCapacity;
	}

	public String getVehicleFuelType() {
		return vehicleFuelType;
	}

	public void setVehicleFuelType(String vehicleFuelType) {
		this.vehicleFuelType = vehicleFuelType;
	}

	public String getVehicleRange() {
		return vehicleRange;
	}

	public void setVehicleRange(String vehicleRange) {
		this.vehicleRange = vehicleRange;
	}
	
	

	public String getVehicleMileage() {
		return vehicleMileage;
	}

	public void setVehicleMileage(String vehicleMileage) {
		this.vehicleMileage = vehicleMileage;
	}

	public String getVehicleGearBox() {
		return vehicleGearBox;
	}

	public void setVehicleGearBox(String vehicleGearBox) {
		this.vehicleGearBox = vehicleGearBox;
	}

	public String getVehicleShockAbsorbers() {
		return vehicleShockAbsorbers;
	}

	public void setVehicleShockAbsorbers(String vehicleShockAbsorbers) {
		this.vehicleShockAbsorbers = vehicleShockAbsorbers;
	}

	public String getVehicleDimensions() {
		return vehicleDimensions;
	}

	public void setVehicleDimensions(String vehicleDimensions) {
		this.vehicleDimensions = vehicleDimensions;
	}
	
	

	public int getVehicleGroundClearance() {
		return vehicleGroundClearance;
	}

	public void setVehicleGroundClearance(int vehicleGroundClearance) {
		this.vehicleGroundClearance = vehicleGroundClearance;
	}

	public abstract int getOnRoadPrice();
}
