package model;

public class GeoPoint {
    /** Lattitude */
    public int lat;
    
    /** Longitude */
    public int lon;
    
    /** New GeoPoint given a lat and long */
    public GeoPoint(int la, int lo) {
	lat = la;
	lon = lo;
    }
    
    @Override
	public boolean equals(Object a) {
	if (a instanceof GeoPoint) {
	    return (lat == ((GeoPoint) a).lat && lon == ((GeoPoint) a).lon);
	}
	return false;
    }
    
}