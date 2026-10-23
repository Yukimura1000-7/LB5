public class Matrix {
    private int[][] matrix;
    private String[] vertexNames;
    private int vertexCount; 


    public Matrix(int size){
        matrix = new int[size][size];
        vertexNames = new String[size];
        vertexCount = 0;
    }

    public void addVetrex(String name){
        if(vertexCount < vertexNames.length){
            vertexNames[vertexCount++] = name;
        }
    }

    public void addEdge(int from, int to, int weight) {
        matrix[from][to] = weight;
        matrix[to][from] = weight;
    }

    public void printMatrix(){
    System.out.printf("%4s", "");
    for (int i = 0; i < vertexCount; i++){
        System.out.printf("%4s", vertexNames[i]);
    }
    System.out.println();

    for (int i = 0; i < vertexCount; i++) {
        System.out.printf("%4s", vertexNames[i]);
        for (int j = 0; j < vertexCount; j++) {
            System.out.printf("%4d", matrix[i][j]);
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        Matrix graph = new Matrix(7);

        graph.addVetrex("A");
        graph.addVetrex("B");
        graph.addVetrex("C");
        graph.addVetrex("D");
        graph.addVetrex("E");
        graph.addVetrex("F");
        graph.addVetrex("G");
        
        // A
        graph.addEdge(0, 1, 1); // A-B
        graph.addEdge(0, 2, 1); // A-C
        graph.addEdge(0, 3, 1); // A-D
        graph.addEdge(0, 5, 1); // A-F
        graph.addEdge(0, 6, 1); // A-G

        //B
        graph.addEdge(1, 2, 1); // B-C
        graph.addEdge(1, 3, 1); // B-D
        graph.addEdge(1, 4, 1); // B-E
        graph.addEdge(1, 6, 1); // B-G

        //c
        graph.addEdge(2, 3, 1); // C-D
        graph.addEdge(2, 4, 1); // C-E
        graph.addEdge(2, 5, 1); // C-F

        //D
        graph.addEdge(3, 4, 1); // D-E
        graph.addEdge(3, 5, 1); // D-F
        graph.addEdge(3, 6, 1); // D-G

        //E
        graph.addEdge(4, 5, 1); // E-F
        graph.addEdge(4, 6, 1); // E-G

        //F
        graph.addEdge(5, 6, 1); // F-G

        graph.printMatrix();

    }
}
