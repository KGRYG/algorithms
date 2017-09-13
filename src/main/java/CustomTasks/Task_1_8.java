package CustomTasks;

public class Task_1_8 {
    public static void zeroMatrix() {
        int [][] matrix = {
                {1,2,3,5,1},
                {7,0,9,4,2},
                {4,5,7,8,3},
                {9,3,6,0,2}
        };
        int [][] copyMatrix = {
                {1,2,3,5,1},
                {7,0,9,4,2},
                {4,5,7,8,3},
                {9,3,6,0,2}
        };
        print2Darr(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    for (int k = i; k <= i; k++) {
                        for (int l = 0; l < matrix[0].length; l++) {
                            copyMatrix[k][l] = 0;
                            if (l >= matrix.length) break;
                            copyMatrix[l][j] = 0;
                        }
                    }
                }
            }
        }

        System.out.println("================");
        print2Darr(copyMatrix);

    }

    private static void print2Darr(int [][] matrix ) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length+1;j++){
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
        zeroMatrix();
    }
}
