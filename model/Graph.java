package model;

import java.util.*;

public class Graph {

	/**
	 * List of vertices contained in the graph
	 */
	public ArrayList<Vertex> vertices;

	/**
	 * New Graph Object
	 */
	public Graph() {
		vertices = new ArrayList<Vertex>();
	}

	private boolean addVertex(Vertex v) {
		if (!vertices.contains(v)) {
			vertices.add(v);
			return true;
		}
		return false;
	}

	public boolean addConnection(Vertex v1, Vertex v2) {
		addVertex(v1);
		addVertex(v2);
		// true if connection was not made already
		return (v1.connect(v2) && v2.connect(v1));
	}
}