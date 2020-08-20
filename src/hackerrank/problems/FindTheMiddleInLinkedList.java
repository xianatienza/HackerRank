package hackerrank.problems;

public class FindTheMiddleInLinkedList {


    public static void main(String[] args) {
        LinkedList input = generateLinkedList(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13});
       // printLinkedList(input);
        //System.out.println(getTheMiddleNo(input));

        input.next.next.next.next = input;

        System.out.println(isCircular(input));
    }

    public static int getTheMiddleNo(LinkedList list) {

        LinkedList singlePtr = list;
        LinkedList doublePtr = list;
        while(doublePtr != null && doublePtr.next != null) {

            singlePtr = singlePtr.next;
            doublePtr = doublePtr.next.next;
        }

        return singlePtr.data;

    }

    private static LinkedList generateLinkedList(int[] intArr) {
        LinkedList head = new LinkedList();
        LinkedList curr = head;
        head.data = intArr[0];
        for(int i=1; i<intArr.length; i++) {
            LinkedList newNode = new LinkedList();
            newNode.data = intArr[i];

            curr.next = newNode;
            curr = newNode;
        }
        return head;
    }

    private static void printLinkedList(LinkedList head) {
        LinkedList curr = head;
        while(curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    private static boolean isCircular(LinkedList head) {

        LinkedList curr = head;
        while(true) {
            if(curr.next == null) {
                return false;
            }
            if(curr.next == head) {
                return true;
            }
            curr = curr.next;
        }

    }

}

class LinkedList {

    int data;
    LinkedList next;

}
