import java.io.*
import java.util.scanner;

public class loadGraph(){

	public List<vertex> lGraph;
	public List<edge> connections;

	public loadGraph(String file){
		//graph holds both the lists correct?
		lGraph = graph.getVertexList(); 
		connections = graph.getEdgeList();
		gfile = new File(file);
		Scanner scanner = new FileReader(gfile);
		try {
			while (scanner.hasNextLine() ){
				loadConnection(scanner.nextLine());
			}
		finally {
			scanner.close();
		}
	}
	
	public loadConnection(String edge){
		string[] con = vertex.split('=');
		string[] vertex1 = con[0].split(',');
		string[] vertex2 = con[1].split(',');
		Vertex temp1 = new Vertex(Integer.parseInt(vertex1[0]), Integer.parseInt(vertex1[1]));
		Vertex temp2 = new Vertex(Integer.parseInt(vertex2[0]), Integer.parseInt(vertex2[1]));
		if (false = graph.contains(temp1)){
			lGraph.add(temp1);
		}
		if (false = graph.contains(temp2)){
			lGraph.add(temp2);
		}
		edge tempE = new Edge(temp1, temp2);
		if (false = connections.contains(tempE)){
			connections.add(tempE);
		}
	}
}
