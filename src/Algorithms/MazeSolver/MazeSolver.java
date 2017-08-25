package Algorithms.MazeSolver;

public class MazeSolver {
    private int [][] mazeMap;
    private boolean[][] visited;
    private int startPositionCol;
    private int startPositionRow;

    public MazeSolver(int[][] mazeMap, int startPositionCol, int startPositionRow) {
        this.mazeMap = mazeMap;
        this.startPositionCol = startPositionCol;
        this.startPositionRow = startPositionRow;
        this.visited = new boolean[mazeMap.length][mazeMap.length];
    }
    
    public void findWayOut() {
        try {
            dfs(startPositionRow, startPositionCol);
            System.out.println("No solutiion found...");
        } catch (RuntimeException e) {
            System.out.println("Route found to exit!!");
        }
    }

    private void dfs(int startPositionRow, int startPositionCol) {
        System.out.println("Visiting i="+ startPositionRow+", j=" + startPositionCol);
        if (this.mazeMap[startPositionRow][startPositionCol] == 3) {
            throw new RuntimeException();
        }

        int endOfMap = this.mazeMap.length-1;

        if (visited[startPositionRow][startPositionCol]) {
            return;
        } else if (startPositionRow < 0 || startPositionRow >= endOfMap){
            return;
        } else if (startPositionCol < 0 || startPositionCol >= endOfMap){
            return;
        } else if (this.mazeMap[startPositionRow][startPositionCol] == 1){
            return;
        } else {
            this.visited[startPositionRow][startPositionCol] = true;
            dfs(startPositionRow+1, startPositionCol);
            dfs(startPositionRow, startPositionCol+1);
            dfs(startPositionRow, startPositionCol-1);
            dfs(startPositionRow-1, startPositionCol);

        }

    }
}
