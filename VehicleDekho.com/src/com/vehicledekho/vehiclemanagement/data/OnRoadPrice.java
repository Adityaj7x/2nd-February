package com.vehicledekho.vehiclemanagement.data;

import java.util.List;

public class OnRoadPrice {
//	public static void printOnRoadPrice(Cars car) {
//		System.out.println("Display Name: " + car.getVehicleCompany() + " " + car.getVehicleName()); 
//		System.out.println("Vehicle Id: " + car.getVehicleId()); 
//		System.out.println("Vehicle Type: " + car.getVehicleType()); 
//		System.out.println("OnRoad Price: " + car.getOnRoadPrice()); 
//		System.out.println("State the Vehicle is registered: " + car.getVehicleRegistrationState());
//		System.out.println("Vehicle's registration number: " + car.getVehicleRegistrationNumber());
//		System.out.println("Colour of Vehicle: " + car.getVehicleColour());
//		System.out.println("Power output of vehicle: " + car.getVehiclePower() + " HP");
//		System.out.println("\n"); }	
//
//		public static void printOnRoadPrice(Bikes bike) {
//		System.out.println("Display Name: " + bike.getVehicleCompany() + " " + bike.getVehicleName()); 
//		System.out.println("Vehicle Id: " + bike.getVehicleId());
//		System.out.println("Vehicle Type: " + bike.getVehicleType());
//		System.out.println("OnRoad Price: " + bike.getOnRoadPrice()); 
//		System.out.println("State the Vehicle is registered: " + bike.getVehicleRegistrationState());
//		System.out.println("Vehicle's registration number: " + bike.getVehicleRegistrationNumber());
//		System.out.println("Colour of Vehicle: " + bike.getVehicleColour());
//		System.out.println("Power output of vehicle: " + bike.getVehiclePower() + " BHP" + "\n");
//		}
	
		
//		public static void printOnRoadPrice(Vehicle vehicle) {
//			System.out.println("Display Name: " + vehicle.getVehicleCompany() + " " + vehicle.getVehicleName()); 
//			System.out.println("Vehicle Id: " + vehicle.getVehicleId()); 
//			System.out.println("Vehicle Type: " + vehicle.getVehicleType()); 
//			System.out.println("OnRoad Price: " + vehicle.getOnRoadPrice()); 
//			System.out.println("State the Vehicle is registered: " + vehicle.getVehicleRegistrationState());
//			System.out.println("Vehicle's registration number: " + vehicle.getVehicleRegistrationNumber());
//			System.out.println("Colour of Vehicle: " + vehicle.getVehicleColour());
//			System.out.println("Power output of vehicle: " + vehicle.getVehiclePower() + " HP");
//			System.out.println("\n"); }		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	public static void printOnRoadPrice(List<Vehicle> vehicles) {
		for (Vehicle vehicle : vehicles) {
			System.out.println("------------------------------------");
			System.out.println("Display Name: " + vehicle.getVehicleCompany() + " " + vehicle.getVehicleName());
			System.out.println("Vehicle Id: " + vehicle.getVehicleId());
			System.out.println("Vehicle Type: " + vehicle.getVehicleType());
			System.out.println("OnRoad Price: " + vehicle.getOnRoadPrice());
			System.out.println("State the Vehicle is registered: " + vehicle.getVehicleRegistrationState());
			System.out.println("Vehicle's registration number: " + vehicle.getVehicleRegistrationNumber());
			System.out.println("Colour of Vehicle: " + vehicle.getVehicleColour());
			System.out.println("Power output of vehicle: " + vehicle.getVehiclePower());
			if(vehicle instanceof Cars) {
				Cars car = (Cars)vehicle;
				System.out.println("THIS IS CAR LIST");
			} else if(vehicle instanceof Bikes) {
				Bikes bike = (Bikes)vehicle;
				System.out.println("THIS IS BIKE LIST");
			}
			System.out.println("--------------------------------------" + "\n");
		}
	}
}
