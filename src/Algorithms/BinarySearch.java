package Algorithms;

/**
 * Created by karen on 7/28/17.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int [] searchArray = new int[11];
        for (int i = 0; i < searchArray.length; i++) {
            searchArray[i] = i;
        }
        int number = 0;
        int low = 0;
        int mid = 0;
        int high = searchArray.length-1;
        int numberOfTry = 0;
        while (true){
            if (low > high) break;
            numberOfTry++;
            mid = low + ((high - low)/2);

            if (searchArray[mid] == number) {
                break;
            }
            if (searchArray[mid] < number) {
                low = mid+1;
            }
            if (searchArray[mid] > number) {
                high = mid-1;
            }
        }
        System.out.println(numberOfTry);


    }
}
