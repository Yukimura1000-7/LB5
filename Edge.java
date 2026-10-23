class Edge {
    private int weight;
    private Vertex target;

    public Edge(int weight, Vertex target) {
        this.weight = weight;
        this.target = target;
    }

    public int getWeight() {
        return weight;
    }

    public Vertex getTarget() {
        return target;
    }

    @Override
    public String toString() {
        return "-> " + target.getName() + " (Длина: " + weight + ")";
    }
}