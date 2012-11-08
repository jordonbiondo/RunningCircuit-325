package tests;
import java.util.*;
import model.*;


/**
 * Test cases go here
 */
public class Tester {


    public static void main(String[] args) {	

	try {
	    Graph g = GraphLoader.loadGraph(args[0]);
	    int i = 0;
	    for (Vertex v : g.vertices) {
		v.value = ++i;
		System.out.println(v);
		for (Vertex c : v.connections ) {
		    System.out.println("    "+c);
		}
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
	
    }

    
    public static List<Vertex> shortestPath(Graph g, Vertex start, Vertex end) {		
	PriorityQueue<Vertex> x = new PriorityQueue<Vertex>();
	for (Vertex v : start.connections) {
	    
	}

	return null;
    }

    

    
}