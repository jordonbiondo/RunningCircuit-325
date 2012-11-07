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
    
    public Vertex v2() {
	return vertex2;
    }
    
    public Vertex v1() {
	return vertex1;
    }
    
    
}
