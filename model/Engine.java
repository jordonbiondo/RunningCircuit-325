package model;

import java.util.*;

public class Engine {

	/**
	 * Simple circuit finder algorithm
	 * 
	 * @return a list of simple circuit that contained in g that contains v
	 */
	public ArrayList<Circuit> circuitFetcher(Graph g, Vertex v)
			throws IllegalArgumentException {

		// first verify that v is in g
		if (!g.vertices.contains(v)) {
			throw new IllegalArgumentException(
					"The given vertex must be in the graph");
		}

		return null;
	}

	/**
	 * returns a list of circuits ordered by the distance difference between
	 * each circuit an the desired distance
	 */
	public ArrayList<Circuit> bestCircuits(ArrayList<Circuit> circuits,
			double desiredDist) {
		return null;
	}

}