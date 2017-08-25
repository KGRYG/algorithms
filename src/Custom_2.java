import java.util.Arrays;

public class Custom_2 {

    public static int[] rotateArray(int[] arr, int d){
        // Because the constraints state d < n, we need not concern ourselves with shifting > n units.
        int n = arr.length;

        // Create new array for rotated elements:
        int[] rotated = new int[n];

        // Copy segments of shifted elements to rotated array:
        System.arraycopy(arr, d, rotated, 0, n - d);
        System.arraycopy(arr, 0, rotated, n - d, d);

        return rotated;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int d = 4;
//        for (int i = 1; i<=d; i++) {
//            int temp = a[0];
//            for (int j = 0; j < a.length-1; j++) {
//                a[j] = a[j+1];
//            }
//            a[a.length-1] = temp;
//        }

        a = rotateArray(a, d);

//        for (int x : a) {
//            System.out.print(x);
//        }
        Arrays.stream(a).forEach(System.out::print);
    }
}
