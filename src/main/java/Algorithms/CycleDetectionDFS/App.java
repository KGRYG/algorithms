package Algorithms.CycleDetectionDFS;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Vertex vertex1 = new Vertex("1");
        Vertex vertex2 = new Vertex("2");
        Vertex vertex3 = new Vertex("3");
        Vertex vertex4 = new Vertex("4");
        Vertex vertex5 = new Vertex("5");
        Vertex vertex6 = new Vertex("6");

        vertex1.addNeighbour(vertex2);
        vertex1.addNeighbour(vertex3);
        vertex2.addNeighbour(vertex3);
        vertex4.addNeighbour(vertex1);
        vertex4.addNeighbour(vertex5);
        vertex5.addNeighbour(vertex6);
        vertex6.addNeighbour(vertex4);

        List<Vertex> vertices = new ArrayList<>();

        vertices.add(vertex1);
        vertices.add(vertex2);
        vertices.add(vertex3);
        vertices.add(vertex4);
        vertices.add(vertex5);
        vertices.add(vertex6);

        CycleDetection cycleDetection = new CycleDetection();
        cycleDetection.detectCycle(vertices);

    }
}
