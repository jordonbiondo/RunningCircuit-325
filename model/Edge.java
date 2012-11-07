<<<<<<< HEAD
/**
 * An edge represents a connections between two vertices
 */
public class Edge {
    
    private Vertex vertex1;
    
    private Vertex vertex2;
	
	private double Weight;
    
    public Edge(Vertex v1, Vertex v2) {
	vertex1 = v1;
	vertex2 = v2;
	calcWeight(v1,v2);
    }
    
	//this is needed for dykstras algorithem
	public calcWeight(Vertex a, Vertex b){
	//todo
	}
	
	public getVertex1(){
	return vertex1;
	}
	public getVertex2()
	{
	return vertex2;
	}
	
	public getWeight(){
	return weight;
	}
	
    public Vertex v2() {
	return vertex2;
    }
    
    public Vertex v1() {
	return vertex1;
    }
    
    @Override 
    public String toString() {
	return vertex1.toString() + " : " + vertex2.toString(); 
    }
    
    
}

=======
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

	public Vertex v2() {
		return vertex2;
	}

	public Vertex v1() {
		return vertex1;
	}

	@Override
	public String toString() {
		return vertex1.toString() + " : " + vertex2.toString();
	}

}
>>>>>>> Engine Skeleton, Presenter, Formatting
