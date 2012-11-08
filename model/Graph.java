package model;

import java.util.*;

public class Graph {
    
    /**
     * List of vertices contained in the graph
     */
    public ArrayList<Vertex> vertices;
    
    /**
     * List of edges contained in the graph
     */
    public ArrayList<Edge> edges;
    
    /**
     * New Graph Object
     */
    public Graph() {
	vertices = new ArrayList<Vertex>();
	edges = new ArrayList<Edge>();
    }
    
    private boolean addVertex(Vertex v) {
	if (!vertices.contains(v)) {
	    vertices.add(v);
	    return true;
	}
	return false;
    }
    
    public boolean addConnection(Vertex v1, Vertex v2) {
	Vertex vA = v1;
	Vertex vB = v2;
	edges.add(new Edge(v1, v2));
	if (!addVertex(v1)) {
	    vA = vertices.get(vertices.indexOf(v1));
	}

	if (!addVertex(v2)) {
	    vB = vertices.get(vertices.indexOf(v2));
	}
	return (vA.connect(vB) && vB.connect(vA));
    }
}