package hackerrank;

public class StackPractice {

    private int size;
    private int topIndex = -1;
    private int[] arr;

    public StackPractice(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public void push(int num) {
        if(topIndex < size - 1) {
            topIndex++;
            arr[topIndex] = num;
        } else {
            throw new RuntimeException("Stackoverflow");
        }
    }

    public int peek() {
        if(topIndex == -1) {
            throw new RuntimeException("Stack empty");
        }
        return arr[topIndex];
    }

    public int pop() {
        if(topIndex < 0) {
           throw new RuntimeException("Stack Undeflow");
        } else {
            int value = arr[topIndex];
            arr[topIndex] = 0;
            topIndex--;
            return value;

        }
    }

    public static void main(String[] args) {
        StackPractice stack = new StackPractice(2);

        stack.push(1);
        stack.push(2);
//        stack.push(3);
//        stack.push(4);

        System.out.printf(""+stack.pop());
     //   System.out.printf(""+stack.pop());
        System.out.printf(""+stack.peek());
        System.out.printf(""+stack.peek());

    }

}

