package Algorithms;

/**
 * Created by karen on 7/31/17.
 */
public class SelectionSort {
    public static int [] sorting(int [] arr) {
        for (int i = 0; i < arr.length; i++){
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[index] > arr[j]){
                    index = j;
                }
            }
            if (index != i) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] a = {32, 5,77,13,9,53,21,1,2};
        sorting(a);
        for (int i: a) {
            System.out.println(i);
        }
    }
}
