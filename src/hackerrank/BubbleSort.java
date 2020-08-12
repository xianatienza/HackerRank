package hackerrank;

public class BubbleSort {


    public static void main(String[] args) {
        int[] arr = {5,4,2,10,3,1,6,7};
        sort(arr);
        print(arr);

    }

    //4,5,8,1,0,3,3
    static void sort(int[] intArr) {

        for(int i=0; i<intArr.length; i++) {
            for(int j=0; j<intArr.length-1; j++) {
                if(intArr[j] > intArr[j+1]) {
                    switchArr(intArr, j,j+1);
                }
            }
        }

    }

    static void print(int[] intArr) {
        for(int i=0;i<intArr.length;i++) {
            System.out.print(intArr[i]+" ");
        }
    }

    static void switchArr(int[] intArr, int a, int b) {
        int temp = intArr[a];
        intArr[a] = intArr[b];
        intArr[b] = temp;
    }
}
