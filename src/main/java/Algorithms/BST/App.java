package Algorithms.BST;

public class App {
    public static void main(String[] args) {
        Tree<Integer> tree = new BinarySearchTree<>();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);

        tree.delete(10);
        tree.traversal();

//        Tree<String> names = new BinarySearchTree<>();
//        names.insert("Adam");
//        names.insert("Karen");
//        names.insert("Joe");
//        names.insert("Billy");
//        names.insert("Daniel");
//        names.traversal();
//        System.out.println();
//        System.out.println(names.getMaxValue());

    }
}
