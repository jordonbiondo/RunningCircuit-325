public class GeoPoint {
    /** Lattitude */
    public float lati;
    
    /** Longitude */
    public float longi;

    /** New GeoPoint given a lat and long */
    public GeoPoint(float la, float lo) {
	lati = la;
	longi = lo;
    }

    @Override
    public boolean equals(Object a) {
	if (a instanceof GeoPoint) {
	    return (lati == ((GeoPoint)a).lati && longi == ((GeoPoint)a).longi);
	}
	return false;
    }

}