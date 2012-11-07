import java.util.*;
public class Graph {

    /**
     * List of vertices contained in the graph
     */
    public LinkedList<Vertex> vertices;

    /**
     * List of all edges spanning the graphs vertices
     */
    public LinkedList<Edge> edges;

    /**
     *  New Graph Object
     */
    public Graph() {
	vertices = new LinkedList<Vertex>();
	edges = new LinkedList<Edge>();
    }

    public boolean addVertex(Vertex v) {
	if (! vertices.contains(v)) {
	    vertices.add(v);
	    return true;
	}
	return false;
    }

    public boolean AddEdge(Edge e) {
	addVertex(e.v1());
	addVertex(e.v2());
	
    }
    

    /**
     * An edge represents a connections between two vertices
     */
    private class Edge {
	
	private Vertex vertex1;
	
	private Vertex vertex2;

	public Edge(Vertex v1, Vertex v2) {
	    vertex1 = v1;
	    vertex2 = v2;
	}

	public Vertex v2() {
	    return vertex2;
	}
	
	public Vertex v1() {
	    return vertex1;
	}
	
	    
    }
}