package test;

import agents.Vehicle;
import cellularmodel.Lane;

public class VehicleTest {

	public static void main(String[] args) {
		Lane lane = new Lane(20,false);
		
		Vehicle vehicle1 = new Vehicle(lane.getCells().get(9));
		Vehicle vehicle2 = new Vehicle(lane.getCells().get(15));	
		
		Vehicle vehicle = new Vehicle(lane.getHead());
		
		System.out.println(lane.toString());
		
		System.out.println("distance: " + vehicle.distanceToNextVehicle());
		System.out.println("distance: " + vehicle1.distanceToNextVehicle());
		
		vehicle.moveForward(3);
		System.out.println(lane.toString());
	}
}
