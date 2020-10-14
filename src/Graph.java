import java.util.List;

/**

 * Simplified Graph interface

 */

public interface Graph {

 

List<Vertex> vertices();

 

int numVertices();

 

Vertex insertVertex(String name);

 

void insertEdge(Vertex u, Vertex v);

 

boolean hasEdge(Vertex u, Vertex v);

 

List<Vertex> outgoingEdges(Vertex v);

}