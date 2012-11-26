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

    /** return decimal of lat */
    public double realLat() {
	double dlat = (double) lat;
	return (dlat / 1000000);
    }
    
    /** return decimal of long */
    public double realLong() {
	double dlong = (double) lon;
	return (dlong / 1000000);
    }
    
    @Override
	public boolean equals(Object a) {
	if (a instanceof GeoPoint) {
	    return (lat == ((GeoPoint) a).lat && lon == ((GeoPoint) a).lon);
	}
	return false;
    }
    
}