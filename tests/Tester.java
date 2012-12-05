
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
		pln(c.getWeight(dCalc)+": "+ c);
	    }
	    pln("\n------------------------\n");
	    for (Circuit c : Engine.bestCircuits(circuits, .5, dCalc)) {
		pln(c.getWeight(dCalc));
		gm.makeCircuitDiagram("circuit", g, c);
		break;
		pln(c.getWeight(dCalc)+": "+ c);
	    }
	    
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

    

    public static void pln(Object arg) {
	System.out.println(arg);
    }
    

    
}