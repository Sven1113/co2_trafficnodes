package simulation;

import java.util.ArrayList;
import java.util.List;

import agents.Agent;
import agents.Vehicle;
import cellularmodel.Cell;
import cellularmodel.Edge;

public class Timer {

	long currentTime;
	long endTime;
	List<Edge> edges = new ArrayList<Edge>();
	
	List<Agent> agents = new ArrayList<Agent>();
	
	public Timer() {
		// TODO Auto-generated constructor stub
	}
	
	public Timer(long endTime) {
		this.endTime = endTime;
	}
	public Timer(long endTime, List<Edge> edges) {
		this.edges = edges;
		this.endTime = endTime;
	}
	
	public void update(){
		for(Agent agent : agents){
			agent.update();
		}
	}

	public void startSimulation() {
		for(int i = 0; i < endTime; i++){
			this.update();
			printEdges();
			System.out.println("currentTime: " + i);
			currentTime++;
		}
	}
	
	void printEdges(){
		for(Edge edge : edges){
			System.out.println(edge.name + ":\n" + edge.toString());
		}
		System.out.println("----------------------");
	}
}
