package com.vehicledekho.vehiclemanagement;

import java.util.ArrayList;
import java.util.List;

import com.vehicledekho.vehiclemanagement.data.Bikes;
import com.vehicledekho.vehiclemanagement.data.Cars;
import com.vehicledekho.vehiclemanagement.data.OnRoadPrice;
import com.vehicledekho.vehiclemanagement.data.Vehicle;


public class VehicleDekhoMain {
	
	public static void main(String[] args) {
		
		Cars car = new Cars();
		car.setVehicleName("Mustang");
		car.setVehicleCompany("Ford");
		car.setVehicleType("Sportscar");
		car.setExShowroomPrice(1859000);
		car.setRtoTaxes(360000);
		car.setVehicleColour("Black");
		car.setVehicleRegistrationState("Maharashtra");
		car.setVehicleRegistrationNumber("MH48CA0913");
		car.setVehiclePower(1000);
//		OnRoadPrice.printOnRoadPrice(car);
		
		Bikes bike = new Bikes();
		bike.setVehicleName("Pulsar");
		bike.setVehicleCompany("Bajaj ");
		bike.setVehicleType("Sportsbike");
		bike.setExShowroomPrice(75000);
		bike.setRtoTaxes(30000);
		bike.setVehicleColour("White");
		bike.setVehicleRegistrationState("Maharashtra");
		bike.setVehicleRegistrationNumber("MH48CA0011");
		bike.setVehiclePower(70);
//		OnRoadPrice.printOnRoadPrice(bike);
		
		
		Vehicle vehicles[] = new Vehicle[2];
		vehicles[0] = car;
		vehicles[1] = bike;
		
		List<Vehicle> list = new ArrayList<Vehicle>();
		list.add(car);
		list.add(bike);
		OnRoadPrice.printOnRoadPrice(list);
	}
}
