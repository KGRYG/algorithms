package Algorithms.LinkedList;

import java.util.Stack;

public class LinkedList <T extends Comparable<T>> implements List<T> {
    private Node<T> root;
    private int sizeOfList;

    @Override
    public void insert(T data) {
        ++this.sizeOfList;
        if (root == null) {
            this.root = new Node<>(data);
        } else {
            inserDataAtBeginning(data);
        }
    }

    private void inserDataAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }

    public void insertDataAtEnd(T data, Node<T> node) {
        if (node.getNextNode() != null) {
            insertDataAtEnd(data, node.getNextNode());
        } else {
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {
        if (this.root == null) return;
        --this.sizeOfList;

        if (this.root.getData().compareTo(data) == 0) {
            this.root = this.root.getNextNode();
        } else {
            remove(data, root, root.getNextNode());
        }


    }

    private void remove(T data, Node<T> previousNode, Node<T> actualNode) {
        while (actualNode != null) {
            if (actualNode.getData().compareTo(data) == 0) {
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }
            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }

    }

    public boolean isPalindrome() {
        Stack<Node> stack = new Stack<>();
        Node<T> slow = this.root;
        Node<T> fast = this.root;

        while (fast != null && fast.getNextNode() != null) {
            stack.push(slow);
            slow = slow.getNextNode();
            fast = fast.getNextNode().getNextNode();
        }

        if (fast != null) slow = slow.getNextNode();

        while (slow != null) {
            if (slow.getData().compareTo((T) stack.pop().getData()) != 0) {
                return false;
            }

            slow = slow.getNextNode();
        }

        return true;
    }

    @Override
    public void traverseList() {

        if (this.root == null) return;

        Node<T> actualNode = this.root;
        while (actualNode != null){
            System.out.print(actualNode + " -> ");
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.sizeOfList;
    }
}
