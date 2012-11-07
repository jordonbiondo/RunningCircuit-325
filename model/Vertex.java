<<<<<<< HEAD
public class Vertex {

    public GeoPoint point;
    public int value;
	public boolean scanned;
    
    public Vertex(GeoPoint p) {
	point = p;
	value = 0;
    }
    
    public Vertex(int la, int lo) {
	point = new GeoPoint(la, lo);
    }

	public setValue(int vals){
		value=vals;
	}

    @Override
    public boolean equals(Object a) {
	if (a instanceof Vertex) {
	    return ((GeoPoint)a).equals(this.point);
	}
	return false;
    }
	public isScanned(){
		scanned=true;
	}
	
	public resetScanned(){
		scanned=false;
	}

    @Override 
    public String toString() {
	return "" + value + ": " + point.lati + ", " + point.longi;
    }
    
    
=======
package model;

import java.util.*;

public class Vertex {

	public GeoPoint point;
	public int value;
	ArrayList<Vertex> connections;

	public Vertex(GeoPoint p) {
		point = p;
		value = 0;
		connections = new ArrayList<Vertex>();
	}

	public Vertex(int la, int lo) {
		point = new GeoPoint(la, lo);
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
		return "" + value + ": " + point.lati + ", " + point.longi;
	}

>>>>>>> Engine Skeleton, Presenter, Formatting
}