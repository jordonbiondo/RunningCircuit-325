package control;
import java.util.*;
import model.*;

public class ShortestPath {
    public ArrayList<Edge> edges = new ArrayList<Edge>();
    public ArrayList<Vertex> vertices = new ArrayList<Vertex>();
    public ArrayList<Edge> adjacentEdge = new ArrayList<Edge>();
    public Vertex at;
    public Vertex too;
    
    public List<Vertex> ShortestPath(Vertex a, Vertex b, Graph graph){
	ArrayList<Edge> edges = graph.edges;
	ArrayList<Vertex> vertices = graph.vertices;
	at=a;
	too=b;

	for (Vertex v : vertices) {
	    v.setValue(0);
	}

	/* why set to null?
	for(int i=0;i<vertices.size;i++){
	    Vertex temp =vertices.get(i);
	    temp.setValue=null;
	}
	*/

	scan(a,b);
       
	// temp so it compiles
	return null;
    }
    
    public void getAdjacent(Vertex v){
	
	for (Edge e : edges) {
	    if (e.getVertex1() == v && !v.scanned) {
		adjacentEdge.add(e);
	    }
	}
	/*
	for(int i=0;i<edges.size();i++){
	    // did you mean to check scanned on an edge here? should be v?
	    if(edges.get(i).getVertex1()==v && !edges.get(i).scanned){
		adjacentEdge.add(edges.get(i));
	    }
	}
	*/
    }
    

    public void scan(Vertex a, Vertex b){
	getAdjacent(at);
	for (Edge edge : adjacentEdge) {
	    if (edge.getVertex2().value < (edge.getVertex2().value + edge.getWeight())) {
		edge.getVertex2().setValue(edge.getVertex2().value + edge.getWeight());
	    }
	}

	/*
	for(int i=0;i<adjacentEdge.size();i++){
	    if(adjacentEdge.get(i).getVertex2().value<(adjacentEdge.get(i).getVertex2().value + adjacentEdge.get(i).getWeight()))
		adjacentEdge.get(i).getVertex2().setValue(adjacentEdge.get(i).getVertex2().getvalue() + adjacentEdge.get(i).getWeight());
	}
	*/

	/*
	 *scan for smallest value
	 *set vertex boolean to scanned
	 *save taken route to list(maybe have list set @ the vertex, idk ideas)
	 *scan to the next thing
	 */
    }
}