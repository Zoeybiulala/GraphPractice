import java.util.*;

public class AdjacencyGraph implements Graph {

	//only one instance variable;
	private List<Vertex> vertices;
	
	public AdjacencyGraph() {
		vertices = new ArrayList<Vertex>();
	}
	

	public List<Vertex> vertices() {
		return vertices;
	}
	
	public boolean hasEdge(Vertex u, Vertex v) {
		return u.hasEdge(v);
	}

	public void insertEdge(Vertex u, Vertex v) {
		u.addEdge(v);//should do some checks
	}

	//might not always be string so return the type of Vertex
	public Vertex insertVertex(String name) {
		Vertex newVertex = new Vertex(name);
		vertices.add(newVertex);
		return newVertex;//return so we can use it instantly
	}

	public int numVertices() {	
		return vertices.size();
	}

	public List<Vertex> outgoingEdges(Vertex v) {
		return v.getEdges();
	}
	
	public List<Vertex> incomingEdges(Vertex v) {
		List<Vertex> incomingList = new ArrayList<Vertex>();
		for(Vertex origin: vertices) {//wrost case is O(n)
			if (hasEdge(origin, v)) {
				incomingList.add(origin);
			}
		}
		return incomingList;
	}
	//runtime will be O(n^2) in total!!!!

}
