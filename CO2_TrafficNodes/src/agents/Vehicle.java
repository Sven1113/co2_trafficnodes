package agents;

import cellularmodel.Cell;

public class Vehicle implements Agent {

	public Vehicle(Cell currentCell) {
		super();
		this.currentCell = currentCell;
		currentCell.setVehicle(this);
	}

	// parameter:
	// * == constant

	/**
	 * fuel type (gasoline, diesel, lpg-gas) *
	 */
	private FuelType fuelType;

	/**
	 * size [int]: Number of raster cells *
	 */
	private int size;

	/**
	 * number of people [int (1..n)] *
	 */
	private int numberOfPeople;

	/**
	 * weight empty [kg] *
	 */
	private double emptyWeight;

	/**
	 * weight total [kg]
	 */
	private double totalWeight;

	/**
	 * TODO: average consumption <-- Formeln random
	 * 
	 */
	private double avgConsumption;

	/**
	 * driving direction
	 */
	private Direction drivingDirection;

	/**
	 * next driving direction
	 */
	private Direction nextDrivingDirection;

	/**
	 * 
	 */
	private Cell currentCell;

	// velocity [m/s]
	// acceleration [m/s^2]

	// methods
	/**
	 * random direction at junction
	 */

	/**
	 * cell distance to next vehicle (if 1 is returned, then there is a vehicle
	 * directly on the next cell)
	 */
	public int distanceToNextVehicle() {
		return nextCell(this.currentCell);
	}

	public int nextCell(Cell cell) {
		int i = 1;
		try {
			Cell nextCell = cell.getNextCell();

			System.out.println(String.format("current: %s | next: %s", cell.id, nextCell.id));

			if (nextCell.getVehicle() == null) {
				i += nextCell(nextCell);
				return i;
			}
		} catch (Exception e) {
			throw e;
		}
		return i;
	}

	// TODO
	public boolean moveForward(int i) {
		// throw new UnsupportedOperationException();
		Cell nextCell;
		for(int s = 0; s < i; s++){
			nextCell = this.currentCell.getNextCell();
			if (nextCell != null) {
				this.currentCell.setVehicle(null);
				this.currentCell = nextCell;
				nextCell.setVehicle(this);
				return true;
			}
			System.out.println("one false");
			return false;
		}
		System.out.println("two false");
		return false;	
	}

	@Override
	public boolean update() {
		moveForward(1);
		return false;
	}
}
