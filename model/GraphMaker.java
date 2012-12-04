package model;

import java.io.*;

public class GraphMaker{
    
    private BufferedWriter out;
    private FileWriter fstream;
    private String name;

    
    public void makeGraph(String file, Graph graph) {
	try {
	GraphStart(file);
	for (Edge g : graph.edges) {
	    //addEdge(g.getVertex1().uniqueName(), g.getVertex2().uniqueName());
	    addEdge(g.getVertex1().getValue()+"", g.getVertex2().getValue()+"");
	}

	    end();
	} catch (Exception e) {
	    e.printStackTrace();
	}
	
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
