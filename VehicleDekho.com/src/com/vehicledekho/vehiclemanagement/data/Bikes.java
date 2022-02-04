package com.vehicledekho.vehiclemanagement.data;

public class Bikes extends Vehicle {

	private int rtoTaxes;

	public void setRtoTaxes(int rtoTaxes) {
	this.rtoTaxes = rtoTaxes;
	}

	public int getOnRoadPrice() {
	return getExShowroomPrice()+ this.rtoTaxes;
	}
}