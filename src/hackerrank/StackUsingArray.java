package hackerrank;

public class StackUsingArray {

    int[] arr1;
    int count = 0;

    public static void main(String[] args){

        StackUsingArray stack = new StackUsingArray(10);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(9);
        System.out.println(stack.pop());

    }

    public StackUsingArray(int size) {
        arr1 = new int[size];
    }

    public void push(int value) {
        arr1[count] = value;
        count++;

    }

    public int pop() {
        //put to 2nd arr
        if(count > 0) {
            count--;
            int num = arr1[count];
            return num;
        }
        return -1;
    }

}
