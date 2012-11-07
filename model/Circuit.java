package model;

import java.util.*;

public class Circuit {

	/**
	 * Ordered list of vertices that make up the circuit Each vertice is
	 * considered connected to the vertex one space to the right and left. The
	 * first and last vertex are considered connected
	 */
	public ArrayList<Vertex> vertices;

	// set to true when a vertex has been added
	private boolean hasChanged = true;

	// calculated weight of circuit
	private double weight = 0;

	/**
	 * New Circuit Object
	 */
	public Circuit() {
		vertices = new ArrayList<Vertex>();
	}

	/**
	 * addes vertex to the list, it will be conisdered connected to the last
	 * vertex that was added
	 */
	public boolean addVertex(Vertex v) {
		if (!vertices.contains(v)) {
			vertices.add(v);
			if (vertices.size() > 0) {
				v.connect(vertices.get(vertices.size() - 1));
				vertices.get(vertices.size() - 1).connect(v);
			}
			hasChanged = true;
			return true;
		}
		return false;
	}

	/**
	 * get or calculate the circuit weight
	 * 
	 */
	public double getWeight(DistanceInterface calc) {
		// if the circuit has not changed since getWeight() was last called
		// return the value it got before to stop needless recalculation
		if (!hasChanged) {
			return weight;
		}

		double dist = 0;
		// sum the weights between vertices
		for (int i = 0; i < vertices.size() - 1; i++) {
			dist += calc.distance(vertices.get(i), vertices.get(i + 1));
		}
		// add the weight of the edge from the first to the last
		dist += calc.distance(vertices.get(0),
				vertices.get(vertices.size() - 1));

		// set the stored weight to what was calculated
		weight = dist;
		// the circuit weight has been set and no change has been made to the
		// circuit
		hasChanged = false;
		return dist;
	}
}