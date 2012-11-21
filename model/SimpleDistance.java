package model;

public class SimpleDistance implements DistanceInterface {
	/**
	 * Pythagorean theorem distance for simple test cases
	 */
	public double distance(Vertex v0, Vertex v1) {
		double as = Math.pow(v1.point.lat - v0.point.lat, 2);
		double bs = Math.pow(v1.point.lon - v0.point.lon, 2);
		return Math.sqrt(as + bs);
	}
}