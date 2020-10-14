import java.util.ArrayList;

import java.util.List;

 

public class Vertex {

 

	private String name;

	private List<Vertex> edges;

 

	public Vertex(String initName) {

		name = initName;

		edges = new ArrayList<Vertex>();

	}

 

	public String getName() {
		return name;
	}

 

	public List<Vertex> getEdges() {
		return edges;
	}
	
	public void addEdge(Vertex destination) {
		edges.add(destination);
	}
	
	public boolean hasEdge(Vertex destination) {
		//return true if there is an edge
		//between this Vertex and destination
		for(Vertex v: edges) {
			if (v.equals(destination)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean equals(Object other) {
		//two nodes are equal if the name is equal
		if(!(other instanceof Vertex)) {
			return false;
		}
		
		Vertex otherVertex = (Vertex) other;
		return getName().equals(otherVertex.getName());
	}
	
	
}