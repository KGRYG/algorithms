package Algorithms.Sorting;

public class MyQuickSort {

    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5,0, -6};
        sort(arr, 0, arr.length-1);
        for (int a: arr) {
            System.out.print(a+" ");
        }
    }

    public static void sort(int arr[], int low, int high) {
        if (low >= high) return;
        int pivot = partition(arr, low, high);
        sort(arr, low, pivot-1);
        sort(arr, pivot+1, high);
    }

    private static int partition(int arr[], int low, int high)
    {
        int pivot = (low + high) / 2;
        swap(arr, pivot, high);
        int i = low;
        for (int j=low; j<high; j++) {
            if (arr[j] <= arr[high]) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);
        return i;
    }

    private static void swap (int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
