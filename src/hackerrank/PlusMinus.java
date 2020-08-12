package hackerrank;

public class PlusMinus {

    public static void main(String[] args) {
        printRatio(10,23);
    }

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        int pos = 0;
        int neg = 0;
        int zeros = 0;

        for(int i=0; i< arr.length; i++) {
            if(arr[i] > 0) {
                pos++;
            } else
            if(arr[i] < 0) {
                neg++;
            } else {
                zeros++;
            }
        }
        printRatio(pos, arr.length);
        printRatio(neg, arr.length);
        printRatio(zeros, arr.length);

    }

    private static void printRatio(int num, int total) {
        float ratio = (float) num / total;
        System.out.format("%.6f",ratio);
    }
}
