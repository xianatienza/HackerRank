package hackerrank;

public class BinaryTree {

    public static void main(String[] args) {

        Node root = new Node(10);


        root.addRecursive(root, 2);
        root.addRecursive(root, 6);
        root.addRecursive(root, 3);
        root.addRecursive(root, 1);
        root.addRecursive(root, 10);
        root.addRecursive(root, 7);


        root.printRecursive(root);


    }

}




class Node {

    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Node addRecursive(Node currentNode, int value) {
        if(currentNode == null) {
            return new Node(value);
        }

        if(value < currentNode.value) {
            currentNode.left = addRecursive(currentNode.left, value);
        } else
        if(value > currentNode.value) {
            currentNode.right = addRecursive(currentNode.right, value);
        } else {
            return currentNode;
        }

        return currentNode;
    }

    public void printRecursive(Node currentNode) {


        if(currentNode == null) {
            return;
        }


        printRecursive(currentNode.left);
        System.out.println(currentNode.value);
        printRecursive(currentNode.right);

    }

}