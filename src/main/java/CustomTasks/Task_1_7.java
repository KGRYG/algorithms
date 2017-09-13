package CustomTasks;

public class Task_1_7 {

    public static void rotateMatrix(int n) {
        int[][] matrix = new int[n][n];
        init2dArr(matrix);
        print2Darr(matrix);

        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i]; // save top

                // left -> top
                matrix[first][i] = matrix[last-offset][first];

                // bottom -> left
                matrix[last-offset][first] = matrix[last][last - offset];

                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                // top -> right
                matrix[i][last] = top; // right <- saved top
            }
        }
        System.out.println("=================");
        print2Darr(matrix);

    }
    private static void print2Darr(int [][] matrix ) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] init2dArr(int[][] matrix) {
        int x =10;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++) {
                x++;
                matrix[i][j] = x;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        rotateMatrix(4);
    }
}
