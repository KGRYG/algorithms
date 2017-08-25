package Algorithms.Sorting;

public class App {
    public static void main(String[] args) {
        int [] arr = {4, 8, -2, 99, 0, 9,55};
//        SelectionSort selectionSort = new SelectionSort();
//        selectionSort.selectionSort(arr);
        QuickSort quickSort = new QuickSort(arr);
        quickSort.sort();
        quickSort.showArray();

    }
}
