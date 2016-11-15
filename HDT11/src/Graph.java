/*Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Joice Miranda
Marlon Fuentes
Jose Antonio Ramirez
Proposito: Programa donde se lee el texto que deseamos y se aplica el algoritmo de floyd.
*/
public interface Graph <V,E>  {
    
    public void add(V label);
    // pre: label is a non-null label for vertex
    // post: a vertex with label is added to graph
    // if vertex with label is already in graph, no action
    public void addEdge(V vtx1, V vtx2, E label);
    // pre: vtx1 and vtx2 are labels of existing vertices
    // post: an edge (possibly directed) is inserted between
    // vtx1 and vtx2.

}

