package CustomTasks;

public class Task_1_5 {

    private static boolean oneway(String a, String b) {
        if(Math.abs(a.length() - b.length()) > 1) return false;
        boolean diff = false;
        int index1 = 0;
        int index2 = 0;

        String s1 = a.length() > b.length() ? a : b;
        String s2 = a.length() > b.length() ? b : a;

        while (index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)){
                if (diff) return false;
                diff = true;
                if (s1.length() == s2.length()) index2++;
            } else {
                index2++;
            }
            index1++;
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "ple";
        String b = "pale";
        System.out.println(oneway(a, b));

    }
}
