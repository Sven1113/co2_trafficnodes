package cellularmodel;

import agents.Agent;

public class TrafficLight implements TrafficRegulation, Agent {

	private Node juctionNode;
	
	public TrafficLight(Node juctionNode) {
		super();
		this.juctionNode = juctionNode;
	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}
}
