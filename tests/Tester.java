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
	    pln("------------------------");	    

	    
	    ArrayList<Circuit> circuits = Engine.getCircuits(g, g.vertices.get(0));
	    
	    //	    DistanceInterface dCalc= new SimpleDistance();
	    DistanceInterface dCalc= new HaversineDistance();
	    for (Circuit c : circuits) {
		pln(c.getWeight(dCalc)+": "+ c);
	    }
	    pln("\n------------------------\n");
	    for (Circuit c : Engine.bestCircuits(circuits, 7, dCalc)) {
		pln(c.getWeight(dCalc)+": "+ c);
	    }

	    
	} catch (Exception e) {
	    e.printStackTrace();
	}

	Edge edge = new Edge(new Vertex(4285898, -85847180),
			     new Vertex(4285884, -85842510));

	System.out.println(edge.getWeight());


	
    }

    
    public static List<Vertex> shortestPath(Graph g, Vertex start, Vertex end) {		
	PriorityQueue<Vertex> x = new PriorityQueue<Vertex>();
	for (Vertex v : start.connections) {
	    
	}

	return null;
    }

    public static void pln(Object arg) {
	System.out.println(arg);
    }
    

    
}