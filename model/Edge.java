
package model;

/**
 * An edge represents a connections between two vertices
 */
public class Edge {
    
    private Vertex vertex1;
    
    private Vertex vertex2;
    
    private double weight;
    
    public Edge(Vertex v1, Vertex v2) {
	vertex1 = v1;
	vertex2 = v2;
    }
    
    
    public double calcWeight() {
	// TODO
	return 0;
    }
    
    public Vertex getVertex2() {
	return vertex2;
    }
    
    public Vertex getVertex1() {
	return vertex1;
    }
    
    public double getWeight() {
	return weight;
    }
    
    @Override
	public String toString() {
	return vertex1.toString() + " : " + vertex2.toString();
    }
    
}

