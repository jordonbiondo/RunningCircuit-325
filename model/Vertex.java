public class Vertex {

    public GeoPoint point;
    public int value;
    
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

    @Override 
    public String toString() {
	return "" + value + ": " + point.lati + ", " + point.longi;
    }
    
    
}