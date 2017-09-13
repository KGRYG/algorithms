package Algorithms.MazeSolver;

public class App {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("/home/karen/Dropbox/Programming/map", 7,7);
        fileReader.parseFile();
        MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(), fileReader.getStartPositionCol(), fileReader.getStartPositionRow());
        mazeSolver.findWayOut();

    }
}
