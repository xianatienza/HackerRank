package hackerrank;

public class LeftRotation {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        leftRotate(arr, 4);

        Helper.printArray(arr);
    }

    public static void leftRotate(int[] arr, int rotateCount) {

    }

    public static void shiftLeft(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        for(int i=1; i<arr.length; i++) {
            arr[i] = temp;
        }
    }


}
