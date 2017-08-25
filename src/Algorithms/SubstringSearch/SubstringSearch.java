package Algorithms.SubstringSearch;

public class SubstringSearch {

    public static boolean searchBoolean(String text, String pattern) {
        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            for (; j < pattern.length();) {
                if (text.charAt(i) == pattern.charAt(j)) {
                    j++;
                    break;
                }
                j = 0;
                break;
            }
        }
        
        return j == pattern.length() ? true: false;
    }

    public static int search(String text, String pattern) {
        int j;
        for (int i = 0; i < text.length(); i++) {
            for (j=0; j < pattern.length();j++) {
                if (text.charAt(i+j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == pattern.length()) return i;
        }

        return text.length();
    }

    public static void main(String[] args) {
        String a = "My word";
        String b = "word";
        System.out.println(search(a, b));
        System.out.println(4-0-1);
    }
}
