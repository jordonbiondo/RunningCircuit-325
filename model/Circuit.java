import java.util.*;

public class Circuit {

    public ArrayList<Vertex> vertices;

    public Circuit() {
	vertices = new ArrayList<Vertex>();
    }

    public boolean addVertex() {
	return false;
    }

    public double getWeight(DistanceInterface calc) {
	double dist = 0;
	for (int i = 0; i < vertices.size()-1; i++) {
	    dist += calc.distance(vertices.get(i), vertices.get(i+1));
	}
	dist += calc.distance(vertices.get(0), vertices.get(vertices.size()-1));
	return dist;
    }
}