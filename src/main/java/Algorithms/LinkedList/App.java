package Algorithms.LinkedList;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        System.out.println(list.isPalindrome());
    }
}
