package simulation;

import java.util.ArrayList;
import java.util.List;

import agents.Vehicle;
import cellularmodel.Edge;
import cellularmodel.Node;
import cellularmodel.TrafficLight;

public class CaseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfCells = 30;
		
		
		
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		Node node4 = new Node();
		// junction node
		Node node5 = new Node();
		
		List<Edge> edges = new ArrayList<Edge>();
		edges.add(new Edge("edgeSN", node1, node5, 2, numberOfCells));
		edges.add(new Edge("edgeWE", node2, node5, 2, numberOfCells));
		edges.add(new Edge("edgeNW", node3, node5, 2, numberOfCells));
		edges.add(new Edge("edgeEW", node4, node5, 2, numberOfCells));
		
		
		Timer timer = new Timer(60, edges);
		
		TrafficLight trafficLight =  new TrafficLight(node5);
				
		Vehicle vehicle1 = new Vehicle(edges.get(0).getLanes().get(0).getHead());
		
		timer.agents.add(trafficLight);
		timer.agents.add(vehicle1);
		
		System.out.println("Initial state:");
		timer.printEdges();		
		System.out.println("--------------");
		timer.startSimulation();	
	}

}
