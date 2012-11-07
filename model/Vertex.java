public class Vertex {

    public GeoPoint point;
    
    public Vertex(GeoPoint p) {
	point = p;
    }
    
    public Vertex(int la, int lo) {
	point = new GeoPoint(la, lo);
    }

    @Override
    public boolean equals(Object a) {
	if (a instanceof Vertex) {
	    return ((GeoPoint)a).equals(this.point);
	}
	return false;
    }
    
    
}