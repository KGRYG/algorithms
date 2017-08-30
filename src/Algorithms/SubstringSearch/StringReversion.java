package Algorithms.SubstringSearch;

public class StringReversion {
    public static String revertString(String text) {
        int lengthOfText = text.length();
        StringBuilder sb = new StringBuilder();
        for (int i = lengthOfText-1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }

        return sb.toString();
//        return new StringBuilder(text).reverse().toString().equals(text);
    }

    public static void main(String[] args) {
        String str = "rotor";
        String newStr = revertString(str);
        System.out.println(str.equals(newStr));
        System.out.println(new StringBuilder("Vasya").reverse());

    }
}
