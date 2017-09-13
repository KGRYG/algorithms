package Algorithms.Sorting;

public class SelectionHungarianWay {
    public static void main(String[] args) {

        int nums[] = {  56, 32, 89 };

        for (int i = 0; i < nums.length-1; ++i) {

            int index = i;

            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }

            if (index != i) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }

        showArray(nums);
    }

    public static void showArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"  ");
        }
    }
}
