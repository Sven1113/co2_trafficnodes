package test;

import java.util.Collection;
import java.util.Collections;

import cellularmodel.Edge;

public class TestEdge {

	public static void main(String[] args) {
		Edge edge = new Edge(2, 20);
		
		System.out.println("# of lanes " + edge.getLanes().size());
	}

}
