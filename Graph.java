import java.util.ArrayList;
import java.util.List;

class Graph {
    private List<Vertex> vertices;

    public Graph() {
        vertices = new ArrayList<>();
    }

    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    public void addEdge(Vertex from, Vertex to, int weight) {
        from.getEdges().add(new Edge(weight, to));
    }

    public void printGraph() {
        for (Vertex v : vertices) {
            System.out.print("Вершина  " + v.getName() + ": ");
            for (Edge e : v.getEdges()) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}