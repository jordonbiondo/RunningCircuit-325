package model;

import java.io.*;
import java.util.Scanner;
import java.util.*;

public class GraphLoader {

	public List<Vertex> lGraph;
	public List<Edge> connections;

	public static Graph loadGraph(String file) throws FileNotFoundException {
		File gfile = new File(file);
		Scanner scanner;

		int lineCount = 0;
		try {
			scanner = new Scanner(gfile);
		} catch (FileNotFoundException fnfe) {
			throw fnfe;
		}
		Graph graph = new Graph();
		try {
			while (scanner.hasNextLine()) {
				lineCount++;
				String nextL = scanner.nextLine();
				// can comment lines in graph files with a #
				if (nextL.charAt(0) != '#') {
					Vertex[] vPair = loadEdgeLine(nextL);
					if (vPair.length != 2)
						throw new Exception("Bad file line: " + lineCount);
					graph.addConnection(vPair[0], vPair[1]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		scanner.close();
		return graph;
	}

	/**
	 * Grabs shit and does
	 */
	public static Vertex[] loadEdgeLine(String edgeLine) {
		String[] con = edgeLine.split("/");
		String[] vertex1 = con[0].split(",");
		String[] vertex2 = con[1].split(",");
		Vertex temp1;
		Vertex temp2;
		try {
			temp1 = new Vertex(Integer.parseInt(vertex1[0]),
					Integer.parseInt(vertex1[1]));
			temp2 = new Vertex(Integer.parseInt(vertex2[0]),
					Integer.parseInt(vertex2[1]));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return new Vertex[] { temp1, temp2 };
	}
}
