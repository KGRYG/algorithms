package Algorithms.Sorting;

public class SelectionSort {
    public int [] selectionSort(int [] arr) {
        int a;
        for (int i = 0; i < arr.length; i++) {
            a = smallestIndex(arr, i);
            swap(arr, a, i);
        }
        return arr;
    }

    private void swap(int[] arr, int a, int i) {
        int temp = arr[a];
        arr[a] = arr[i];
        arr[i] = temp;
    }

    private int smallestIndex(int[] arr, int i) {
        int minValue = arr[i];
        int minIndex = i;
        for (int j = minIndex + 1; j < arr.length; j++) {
            if (arr[j] < minValue) {
                minValue = arr[j];
                minIndex = j;
            }
        }
        return minIndex;
    }
}
