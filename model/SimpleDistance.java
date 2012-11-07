package model;

public class SimpleDistance implements DistanceInterface {
	/**
	 * Pythagorean theorem distance for simple test cases
	 */
	public double distance(Vertex v0, Vertex v1) {
		double as = Math.pow(v1.point.lati - v0.point.lati, 2);
		double bs = Math.pow(v1.point.longi - v0.point.longi, 2);
		return Math.sqrt(as + bs);
	}
}