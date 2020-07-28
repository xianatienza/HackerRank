public class LowestAncestor {

    class Node {
        Node left;
        Node right;
        int data;
    }

    public static Node lca(Node head, int x, int y) {

        int rightVal = 0;
        int leftVal = 0;
        if(x > y) {
            rightVal = x;
            leftVal = y;
        }

        if(leftVal < head.data && head.data < rightVal) {
            return head;
        }

        //both on the left
        if(leftVal < head.data && rightVal < head.data) {
            return lca(head.left, x,y);
        }

        //both on the right
        if(leftVal > head.data && rightVal > head.data) {
            return lca(head.right, x,y);
        }

        return head;

    }



}
