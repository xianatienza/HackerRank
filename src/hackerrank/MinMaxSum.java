package hackerrank;

public class MinMaxSum {

    public static void main(String[] args) {
        miniMaxSum(new int[]{1,2,3,4,5});
    }

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int total = 0;

        for(int i=0; i< arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];

            }
            if(arr[i]< min) {
                min = arr[i];

            }
            total += arr[i];
        }

        System.out.println(""+(total-max)+" "+(total-min));

    }
}
