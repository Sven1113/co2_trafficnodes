package agents;

import cellularmodel.TrafficCell;

public class Vehicle implements Agent{

	// parameter:
	// * == constant
	
	/**
	 *  fuel type (gasoline, diesel, lpg-gas) *
	 */
	private FuelType fuelType;
	/**
	 *  size [int]: Number of raster cells *
	 */
	private int size;
	/**
	 *  number of people [int (1..n)] *
	 */
	private int numberOfPeople;
	/**
	 *  weight empty [kg] *
	 */
	private double emptyWeight;
		
	/**
	 *  weight total [kg]
	 */
	private double totalWeight;
	
	/**
	 * TODO:
	 *  average consumption <-- Formeln random
	 *  
	 */
	private double avgConsumption;
	
	/**
	 * driving direction
	 */
	private Direction drivingDirection;
	
	/**
	 *next driving direction
	 */
	private Direction nextDrivingDirection;
	
	
	/**
	 * 
	 */
	private TrafficCell previousCell;
	
	/**
	 * 
	 */
	private TrafficCell currentCell;
	
	/**
	 * 
	 */
	private TrafficCell nextCell;
	
	// velocity [m/s]
	// acceleration [m/s^2]
	
	
	// methods
	/**
	 *  random direction at junction 
	 */
	
	
	/**
	 *  distance to previous vehicle
	 */
}
