package CustomTasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Custom_1 {
    public static boolean isPalindrome(String str){
        int length = str.length()-1;
        if (length <= 1) return true;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != str.charAt(length--)){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "repaper";
        System.out.println(isPalindrome(str));

    }
}
