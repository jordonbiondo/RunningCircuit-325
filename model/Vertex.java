
package model;

import java.util.*;

public class Vertex {
    
    public GeoPoint point;
    public double value;
    public boolean scanned;
    public ArrayList<Vertex> connections;
    
    public Vertex(GeoPoint p) {
	point = p;
	value = 0;
	connections = new ArrayList<Vertex>();
    }
    
    public Vertex(int la, int lo) {
	point = new GeoPoint(la, lo);
	value = 0;
	connections = new ArrayList<Vertex>();
    }

    public void setValue(double val) {
	value = val;
    }
    
    public void setScanned() {
	scanned = true;
    }

    public void resetScanned() {
	scanned = false;
    }
    /**
     * Connect vertex to another vertex
     */
    public boolean connect(Vertex v) {
	if (!connections.contains(v)) {
	    connections.add(v);
	    return true;
	}
	return false;
    }
    
    @Override
    public boolean equals(Object a) {
	if (a instanceof Vertex) {
	    return ((Vertex) a).point.equals(this.point);
	}
	return false;
    }
    
    @Override
    public String toString() {
	return "(" + value + ": " + point.lat + ", " + point.lon + ")";
    }
    

}