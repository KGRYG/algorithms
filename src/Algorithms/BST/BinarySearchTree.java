package Algorithms.BST;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T>{
    private Node<T> root;

    @Override
    public void insert(T data) {
        if (root == null) {
            root = new Node<>(data);
        } else {
            insertNode(data, root);
        }
    }

    private void insertNode(T newData, Node<T> node) {
        if (newData.compareTo(node.getData()) < 0) {
            if (node.getLeftChild() != null) {
                insertNode(newData, node.getLeftChild());
            } else {
                Node<T> newNode = new Node<T>(newData);
                node.setLeftChild(newNode);
            }
        } else {
            if (node.getRightChild()!=null) {

                insertNode(newData, node.getRightChild());
            } else {
                Node<T> newNode = new Node<T>(newData);
                node.setRightChild(newNode);
            }
        }
    }

    @Override
    public T getMinValue () {
        if (root == null) return null;
        return getMin(root);

    }

    private T getMin(Node<T> node) {
        if (node.getLeftChild() != null) {
            return getMin(node.getLeftChild());
        }

        return node.getData();
    }

    @Override
    public T getMaxValue() {
        if (this.root == null) return null;
        return getMax(this.root);
    }

    private T getMax(Node<T> node) {
        if (node.getRightChild() != null) {
            return getMax(node.getRightChild());
        }

        return node.getData();
    }

    @Override
    public void traversal() {
        if (this.root != null) {
            inOrderTraversal(this.root);
        }

    }

    private void inOrderTraversal(Node<T> node) {
        if (node.getLeftChild() != null) inOrderTraversal(node.getLeftChild());

        System.out.print(node+" -> ");

        if (node.getRightChild() != null) inOrderTraversal(node.getRightChild());
    }


    @Override
    public void delete(T data) {
        if (root != null) root = delete(root, data);
    }

    private Node<T> delete(Node<T> node, T data) {
        if (node == null) return node;

        if (data.compareTo(node.getData()) < 0) {
            node.setLeftChild(delete(node.getLeftChild(), data));
        } else if (data.compareTo(node.getData()) > 0) {
            node.setRightChild(delete(node.getRightChild(), data));
        } else {

            if (node.getRightChild() == null && node.getLeftChild() == null) {
                System.out.println("Removing leaf node");
                return null;
            }

            if (node.getLeftChild() == null) {
                System.out.println("Removing right child");
                Node<T> tempNode = node.getRightChild();
                node = null;
                return tempNode;
            } else if (node.getRightChild() == null) {
                System.out.println("Removing left child");
                Node<T> tempNode = node.getLeftChild();
                node = null;
                return tempNode;
            }

            System.out.println("Removing child with two children");
            Node<T> tempNode = getPredecessor(node.getLeftChild());
            node.setData(tempNode.getData());
            node.setLeftChild(delete(node.getLeftChild(), tempNode.getData()));

        }
        return node;
    }

    private Node<T> getPredecessor(Node<T> node) {
        if (node.getRightChild() != null) return getPredecessor(node.getRightChild());
        return node;
    }
}
