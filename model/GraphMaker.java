package model;

import java.io.*;

public class GraphMaker{
	
	private BufferedWriter out;
	private FileWriter fstream;
	private String name;
	
  public boolean GraphStart(String x) {
	
  try{
  // Create file 
   name = x +".dot";
   fstream= new FileWriter(name);
   out = new BufferedWriter(fstream);
   out.write("graph G {\n");
   
  }catch (Exception e){//Catch exception if any
  System.err.println("Error: " + e.getMessage());
  }
  return true;
  }
  
	
  public void addEdge(String x, String y) throws IOException {
	out.write(x);
	out.write("--");
	out.write(y);
	out.write(";");
	out.write("\n");
  }
  public void end() throws IOException {
	out.write("}");
	out.close();
  }
}
