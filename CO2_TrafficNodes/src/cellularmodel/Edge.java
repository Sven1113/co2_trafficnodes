package cellularmodel;

import java.util.ArrayList;
import java.util.List;

public class Edge {

	public String name;
	Node startNode;
	Node edgeNode;

	private List<Lane> lanes = new ArrayList<Lane>();

	public Edge(String name, Node startNode, Node endNode, int numOfLanes, int numberOfCells) {
		this.name = name;
		this.startNode = startNode;
		this.edgeNode = endNode;
		createLanes(numOfLanes, numberOfCells);
	}

	public List<Lane> getLanes() {
		return lanes;
	}

	private void createLanes(int numOfLanes, int numberOfCells) {

		for (int i = 0; i < numOfLanes; i++) {
			lanes.add(new Lane(numberOfCells, (i % 2) == 0));
			System.out.println("Line number: " + i);
		}
	}
	
	@Override
	public String toString() {
		String s = "";
		for (Lane lane : lanes) {
			s += lane.toString()+ "\n";
		}
		return s;
	}
}
