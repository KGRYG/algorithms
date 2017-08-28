import java.util.*;
import java.util.stream.Collectors;

public class Play {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        HashMap<String, String> hashMap = new HashMap<>();
        System.out.println(distance(-6,8,-3,9));
        System.out.println(Math.pow(5, 2));

    }
}
