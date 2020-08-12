package hackerrank;

public class Macquarie {

    /**
     * Macquarie questions:
     * 1. Call an API then creat a list
     * 2. String dvisibility
     * 3. SQL
     *
     */


    /** Reverse Linked List
     * Node reverse(Node node) {
     *         Node prev = null;
     *         Node current = node;
     *         Node next = null;
     *         while (current != null) {
     *             next = current.next;
     *             current.next = prev;
     *             prev = current;
     *             current = next;
     *         }
     *         node = prev;
     *         return node;
     *     }
     *
     *
     */


    /**
     * Binary tree height
     *
     * // Write your code here.
     *
     *         Node curr = root;
     *         int h = 0;
     *         int hl = 0;
     *         int hr = 0;
     *         //singlenode
     *         if(curr.left == null && curr.right == null) {
     *             return h;
     *         }
     *
     *         if(curr.left != null) {
     *             hl = height(curr.left);
     *         }
     *
     *         if(curr.right != null) {
     *             hr = height(curr.right);
     *         }
     *
     *         if(hr > hl) {
     *             return 1 + hr;
     *         } else {
     *             return 1 + hl;
     *         }
     *
     *
     */

    /***
     * Reverse Print linked list
     */

    public static void main() {

        //SinglyLinkedListNode

    }
}
