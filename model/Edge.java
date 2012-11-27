
package model;

/**
 * An edge represents a connections between two vertices
 */
public class Edge {
    
    private Vertex vertex1;
    
    private Vertex vertex2;

    
    public Edge(Vertex v1, Vertex v2) {
	vertex1 = v1;
	vertex2 = v2;
    }
    
    
    
    public Vertex getVertex2() {
	return vertex2;
    }
    
    public Vertex getVertex1() {
	return vertex1;
    }
    
    public double getWeight() {
	// Only supports haversine currently 
	HaversineDistance distCalc = new HaversineDistance();
	return distCalc.distance(vertex1, vertex2);
    }
    
    @Override
	public String toString() {
	return vertex1.toString() + " : " + vertex2.toString();
    }
    
}

