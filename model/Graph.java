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

    private boolean addVertex(Vertex v) {
	if (! vertices.contains(v)) {
	    vertices.add(v);
	    return true;
	}
	return false;
    }

    public boolean addEdge(Edge e) {
	return (addVertex(e.v1()) || addVertex(e.v2())); 
    }
}