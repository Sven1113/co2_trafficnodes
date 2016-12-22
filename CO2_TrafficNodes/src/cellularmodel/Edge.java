package cellularmodel;

import java.util.ArrayList;
import java.util.List;

public class Edge {

	public List<Lane> getLanes() {
		return lanes;
	}

	private List<Lane> lanes = new ArrayList<Lane>();

	public Edge(int numOfLanes, int numberOfCells) {
		createLanes(numOfLanes,numberOfCells);
	}

	private void createLanes(int  numOfLanes, int numberOfCells) {
		
		for(int i = 0; i < numOfLanes; i++){
			lanes.add(new Lane(numberOfCells, (i % 2) == 0));			
			System.out.println("Line number: " + i);
		}
	}

}
