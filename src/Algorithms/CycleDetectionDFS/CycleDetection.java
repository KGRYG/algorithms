package Algorithms.CycleDetectionDFS;

import java.util.List;

public class CycleDetection {
    public void detectCycle(List<Vertex> vertexList) {
        for (Vertex v: vertexList) {
            if (!v.isVisited()) {
                dfs(v);

            }
        }
    }

    private void dfs(Vertex v) {

        System.out.println("DFS on vertex " + v);
        v.setBeingVisited(true);

        for (Vertex vertex: v.getAdjacenciesList() ) {
            System.out.println("Visiting neighbours of vertex " +v);
            if (vertex.isBeingVisited()) {
                System.out.println("There is a cycle");
                return;
            }

            if (!vertex.isVisited()) {
                System.out.println("Visiting vertex " + vertex +" recursively");
                vertex.setVisited(true);
                dfs(vertex);
            }
        }

        System.out.println("Set vertex " + v + "setBeingVisited(false) and setVisited(true)...");
        v.setBeingVisited(false);
        v.setVisited(true);
    }
}
