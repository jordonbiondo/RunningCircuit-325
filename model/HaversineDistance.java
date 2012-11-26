package model;

public class HaversineDistance implements DistanceInterface {
    @Override
    public double distance(Vertex v0, Vertex v1) {

	/* shamelessly stolen javascript implementation
	var R = 6371; 
	var dLat = (lat2-lat1).toRad();  
	var dLon = (lon2-lon1).toRad(); 
	var a = Math.sin(dLat/2) * Math.sin(dLat/2) +
	    Math.cos(lat1.toRad()) * Math.cos(lat2.toRad()) * 
	    Math.sin(dLon/2) * Math.sin(dLon/2); 
	var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)); 
	var d = R * c;
	*/

	/*
	var R = 6371; // km
	var dLat = (lat2-lat1).toRad();
	var dLon = (lon2-lon1).toRad();
	var lat1 = lat1.toRad();
	var lat2 = lat2.toRad();
	
	var a = Math.sin(dLat/2) * Math.sin(dLat/2) +
	    Math.sin(dLon/2) * Math.sin(dLon/2) * Math.cos(lat1) * Math.cos(lat2); 
	var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)); 
	var d = R * c;
	*/

	final double R = 6371;
	double dLat = Math.toRadians((v0.point.realLat()-v1.point.realLat()));
	double dLon = Math.toRadians((v0.point.realLong()-v1.point.realLong()));
	double lat1 = Math.toRadians(v0.point.realLat());
	double lat2 = Math.toRadians(v1.point.realLat());
	double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
	    Math.sin(dLon/2) * Math.sin(dLon/2) * Math.cos(lat1) * Math.cos(lat2);
	double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
	double d = R * c;
	return d * 1.60934;
	/*
	final int radius = 6371;
	double dLat = (v0.point.realLat() - v1.point.realLat());
	double dLon = (v0.point.realLong() - v1.point.realLong());
	double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
	    Math.cos(Math.toRadians(v0.point.realLat())) *
	    Math.cos(Math.toRadians(v1.point.realLat())) *
	    Math.sin(dLon/2) * Math.sin(dLon/2);
	double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
	double d = (radius * c) * 0.621371;
	return d;
	*/
    }
}