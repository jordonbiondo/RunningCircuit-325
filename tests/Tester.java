<<<<<<< HEAD
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

	    Graph out = GraphLoader.loadGraph(args[0]):
		
		ArrayList<Edge> shortEdge = out.ShortestPath(out.getVertexList().get(0), out.getVertexList().get(out.getVertexList().length()-1));
		out.clearConnection();
		for (Edge E: shortEdge){
			out.addConnection(E.getVertex1(),E.getVertex2());
		}

	    ArrayList<Circuit> circuits = Engine.getCircuits(g, g.vertices.get(0));
	    GraphMaker gm = new GraphMaker();
	    gm.makeGraph("myGraph", g);
		

	    DistanceInterface dCalc= new SimpleDistance();
	    //DistanceInterface dCalc= new HaversineDistance();
	    i = 0;
		gm.makeGraph("ShortestDistance",out):
		
	    for (Circuit c : circuits) {
		pln(c.getWeight(dCalc)+": "+ c);
	    }
	    pln("\n------------------------\n");
	    for (Circuit c : Engine.bestCircuits(circuits, 7, dCalc)) {
		pln(c.getWeight(dCalc)+": "+ c);
		gm.makeGraph("circuit"+i, c.toGraph());
		i++;
	    }

	    
	} catch (Exception e) {
	    e.printStackTrace();
	}

	Edge edge = new Edge(new Vertex(4285898, -85847180),
			     new Vertex(4285884, -85842510));

	System.out.println(edge.getWeight());

    }

    public static void pln(Object arg) {
	System.out.println(arg);
    }
    

    
=======
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
	    for (Edge e : g.edges) {
		pln(e);
	    }
	    pln("------------------------");	    

	    
	    ArrayList<Circuit> circuits = Engine.getCircuits(g, g.vertices.get(0));
	    
	    GraphMaker gm = new GraphMaker();
	    gm.makeGraph("myGraph", g);
	    gm.makeGraph("myGraph2", g.edges);


	    DistanceInterface dCalc= new SimpleDistance();
	    //DistanceInterface dCalc= new HaversineDistance();
	    i = 0;
	    for (Circuit c : circuits) {
		//pln(c.getWeight(dCalc)+": "+ c);
	    }
	    pln("\n------------------------\n");
	    for (Circuit c : Engine.bestCircuits(circuits, 7, dCalc)) {
		//pln(c.getWeight(dCalc)+": "+ c);
	    }
	    
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

    

    public static void pln(Object arg) {
	System.out.println(arg);
    }
    

    
>>>>>>> Graphmaker fix, Test updates
}