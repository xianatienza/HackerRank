package hackerrank;

/**\
 * Count the biggest numbers in the array
 *
 * 1 5 2 3 5 = 2 (two 5s)
 *
 * */
public class BirthdaCandles {

    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(new int[]{1,5,2,3,5,1,5}));
    }

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {

        int max = Integer.MIN_VALUE;
        //find max
        for(int i=0;i<ar.length;i++) {
            if(ar[i] > max) {
                max = ar[i];
            }
        }


        //count max
        int maxCounter = 0;
        for(int i=0;i<ar.length;i++) {
            if(ar[i] == max) {
                maxCounter++;
            }
        }

        return maxCounter;
    }
}
