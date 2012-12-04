package model;

import java.io.*;
import java.util.*;
public class GraphMaker{
    
    private BufferedWriter out;
    private FileWriter fstream;
    private String name;

    
    public void makeGraph(String file, List<Edge> edges) {
	try {
	GraphStart(file);
	for (Edge e : edges) {
	    addEdge(e.getVertex1().coordName(), e.getVertex2().coordName());
	}
	end();
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }

    public void makeGraph(String file, Graph g) {
	makeGraph(file, g.edges);
    }

    private boolean GraphStart(String x) {
	try{
	    // Create file 
	    name = x +".dot";
	    fstream= new FileWriter(name);
	    out = new BufferedWriter(fstream);
	    out.write("graph G {\n");
	    
	}catch (Exception e){//Catch exception if any
	    System.err.println("Error: " + e.getMessage());
	    return false;
	}
	return true;
    }
    
    
    private void addEdge(String x, String y) throws IOException {
	out.write("\"" + x + "\"");
	out.write("--");
	out.write("\"" + y + "\"");
	out.write(";");
	out.write("\n");
    }

    private void end() throws IOException {
	out.write("}");
	out.close();
    }
}
