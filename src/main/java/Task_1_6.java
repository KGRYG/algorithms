

public class Task_1_6 {
    public static String compression(String a) {
        StringBuilder sb = new StringBuilder();
        int index = 1;

        for (int i = 0; i < a.length(); i++) {
            if(i+1 >= a.length() || a.charAt(i) != a.charAt(i+1)){
                sb.append(a.charAt(i)).append(index);
                index = 1;
            }
            if(i+1 >= a.length() || a.charAt(i) == a.charAt(i+1)){
                index++;
            }
        }

        return sb.length() < a.length() ? sb.toString() : a;

    }

    public static String compression2(String str) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            index++;
            if(i+1 >= str.length() ||str.charAt(i) != str.charAt(i+1)) {
                sb.append(str.charAt(i)).append(index);
                index = 0;
            }
        }
        return sb.length() > str.length() ? str : sb.toString();
    }


    public static void main(String[] args) {
        String a = "aaabbbbccebjj";
        System.out.println(compression2(a));
        System.out.println(compression(a));
    }
}
