package com.vehicledekho.vehiclemanagement;

import java.util.ArrayList;
import java.util.List;

import com.vehicledekho.vehiclemanagement.data.Bikes;
import com.vehicledekho.vehiclemanagement.data.Cars;
import com.vehicledekho.vehiclemanagement.data.DisplayVehicleDetails;
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
		car.setVehicleDimensions("4900mm X 1980mm X 750mm");
		car.setVehicleEngineDisplacement(1999);
		car.setVehicleFuelCapacity("75 Litres");
		car.setVehicleFuelType("Petrol");
		car.setVehicleGearBox("7 Speed Dual Clutch");
		car.setVehicleMaximumTorque("960 Nm");
		car.setVehicleMileage("5 Kmpl");
		car.setVehicleRange("750 Kilometers");
		car.setVehicleShockAbsorbers("MacPherson Strut with Verticle Stabilizers");
		car.setVehicleGroundClearance(90);
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
		bike.setVehicleDimensions("2300mm X 360mm X 600mm");
		bike.setVehicleEngineDisplacement(150);
		bike.setVehicleFuelCapacity("15 Litres");
		bike.setVehicleFuelType("Petrol");
		bike.setVehicleGearBox("5 Speed");
		bike.setVehicleMaximumTorque("90 Nm");
		bike.setVehicleMileage("55 Kmpl");
		bike.setVehicleRange("825 Kilometers");
		bike.setVehicleShockAbsorbers("Coil Spring");
		bike.setVehicleGroundClearance(160);
//		OnRoadPrice.printOnRoadPrice(bike);
		
		
		Vehicle vehicles[] = new Vehicle[2];
		vehicles[0] = car;
		vehicles[1] = bike;
		
		List<Vehicle> list = new ArrayList<Vehicle>();
		list.add(car);
		list.add(bike);
		DisplayVehicleDetails.displayVehicleDetails(list);
	}
}
