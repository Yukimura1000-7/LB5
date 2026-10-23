public class GraphImplementation {
    public static void main(String[] args) {
        Graph ourGraph = new Graph();

        // Вершины
        Vertex v0 = new Vertex("0");
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");

        ourGraph.addVertex(v0);
        ourGraph.addVertex(v1);
        ourGraph.addVertex(v2);
        ourGraph.addVertex(v3);

        // Края
        ourGraph.addEdge(v0, v1, 2);
        ourGraph.addEdge(v1, v2, 3);
        ourGraph.addEdge(v2, v0, 1);
        ourGraph.addEdge(v2, v3, 1);
        ourGraph.addEdge(v3, v2, 4);

        ourGraph.printGraph();
    }
}