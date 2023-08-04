package chapter31.graph;

public class UndirectedGraph {
    private final int count;
    private final int[][] vertexMatrix;

    public UndirectedGraph(int count) {
        this.count = count;
        vertexMatrix = new int[count][count];
    }

    public void addEdges(int from, int to, int weight) {
        vertexMatrix[from][to] = weight;
        vertexMatrix[to][from] = weight;
    }

    public int[][] getVertexMatrix() {
        return vertexMatrix;
    }
}
