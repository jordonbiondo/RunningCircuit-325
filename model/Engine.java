package model;

import java.util.*;

public class Engine {
    

    private static ArrayList<Vertex> vStack = new ArrayList<Vertex>();
    
    private static ArrayList<Circuit> allCircuits = new ArrayList<Circuit>();


    /**
     * Simple circuit finder algorithm
     * 
     * @return a list of simple circuit that contained in g that contains v
     */
    public static ArrayList<Circuit> getCircuits(Graph g, Vertex v)
	throws IllegalArgumentException {
	
	vStack.clear();
	allCircuits.clear();

	// first verify that v is in g
	if (!g.vertices.contains(v)) {
	    throw new IllegalArgumentException("The given vertex must be in the graph");
	}

	traverse(v, v);
	return allCircuits;
    }
    
    /**
     *  recursive traversal method.
     */
    private static void traverse(Vertex root, Vertex v) {
	vStack.add(v);
	// copy needed to avoid concurrent modification issues
	ArrayList<Vertex> cons = new ArrayList<Vertex>(v.connections);
	for (Vertex c : cons) {
	    if (vStack.size() > 2) {
		if (! vStack.contains(c)) {
		    traverse(root, c); 
		} else {
		    if (root.equals(c)) {
			makeCircuit(); 

		    }
		}
	    } else {
		if (!vStack.contains(c)) {
		    traverse(root, c);
		}
	    }
	}
	vStack.remove(v);
	return;
    }

    

    /**
     * Make a circuit of the the current vStack and all it to the list
     */
    private static void makeCircuit(){ 
	Circuit circuit = new Circuit();
	for (int i = 0; i < vStack.size(); i++) {
	    circuit.addVertex(vStack.get(i));
	}
	allCircuits.add(circuit);
    }


    
    /**
     * returns a list of circuits ordered by the distance difference between
     * each circuit an the desired distance
     */
    public static ArrayList<Circuit> bestCircuits(ArrayList<Circuit> circuits,
					   final double desiredDist,
					   final DistanceInterface calc) {
	Collections.sort(circuits, new Comparator<Circuit>() {
		
		@Override
		    public int compare(Circuit a, Circuit b) {
		    double aDist = Math.abs(desiredDist - a.getWeight(calc));
		    double bDist = Math.abs(desiredDist - b.getWeight(calc));
		    return (aDist < bDist) ? -1 : 1;
		}
	    });
	return circuits;
	
    }
    
}