package Algorithms;

/**
 * Created by karen on 7/28/17.
 */
public class BubbleSort {

    public static int [] BubbleSort(int [] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {3,12,34,4,5,0,12};
        BubbleSort(arr);
        for (int a : arr) {
            System.out.println(a);
        }

    }
}
