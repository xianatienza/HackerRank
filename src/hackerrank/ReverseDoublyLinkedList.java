package hackerrank;

public class ReverseDoublyLinkedList {



    public static void main(String[] args) {
        DoublyLinkedListNode input = createDoublyLinkedList(new int[]{1,2,3,4,5,6});
        print(reverse(input));
    }




    // 1 next 2 next 3 next 4 next 5
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

        DoublyLinkedListNode curr = head;

        //reach the tail
        while(curr != null) {
            DoublyLinkedListNode temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;

            if(temp  == null) {
                return curr;
            }
            curr = temp;

        }
        return head;
    }


    public static DoublyLinkedListNode createDoublyLinkedList(int[] arr) {

        DoublyLinkedListNode root = new DoublyLinkedListNode();
        root.data = arr[0];
        DoublyLinkedListNode curr = root;

        for(int i=1; i<arr.length; i++) {
            DoublyLinkedListNode newNode = new DoublyLinkedListNode();
            newNode.data = arr[i];

            curr.next = newNode;
            newNode.prev = curr;

            curr = newNode;
        }

        return root;
    }


    private static void print(DoublyLinkedListNode root) {
        while(root != null) {
            System.out.println(root.data);
            root = root.next;
        }
    }

}

class DoublyLinkedListNode {
      int data;
      DoublyLinkedListNode next;
      DoublyLinkedListNode prev;
  }