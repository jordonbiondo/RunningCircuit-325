public class GeoPoint {
    /** Lattitude */
    public int lati;
    
    /** Longitude */
    public int longi;

    /** New GeoPoint given a lat and long */
    public GeoPoint(int la, int lo) {
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