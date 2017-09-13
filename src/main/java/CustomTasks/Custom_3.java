package CustomTasks;

import java.util.HashSet;
import java.util.Set;

public class Custom_3 {
    class Node {
        int data;
        Node next;
    }

    static boolean hasCycle(Node head) {
        Node fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            head = head.next;

            if(head.equals(fast)) {
                return true;
            }
        }
        return false;
    }

    static boolean hasCycle2(Node head) {
        Set<Node> seen = new HashSet<>();
        Node headN = head;
        while (headN != null) {
            seen.add(headN);
            headN = headN.next;
            if (seen.contains(headN)) return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
