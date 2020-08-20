package hackerrank.dynamicprogramming;

/**
 * Given demonations and amount
 * return the no. of ways that the amount
 * can be changed
 *
 * [1,2,5], amount 8
 * f(denom, 8) = f(denom, 8-denom[i]) + 1;
 *
 * **/
public class NumberOfWaysChange {

    public static void main(String[] args) {
        int amount = 14;
        int[] denom = {1,2,5,7};
        int[] minChange = new int[amount+1];

        //initialize max ways
        for(int i=0; i<minChange.length; i++) {
            minChange[i] = amount+1;
        }

        System.out.println(minChange(denom, amount, minChange));

    }

    /**
     * Bottom up approach
     * [1,2,5]
     * amount 10
     *                   i
     *          0  1  2  3
     * maxWays [0, 1, 2,-1,-1,-1,-1,-1,-1,-1,-1]
     *
     * */
    public static int minChange(int[] denom, int amount, int[] minChange) {

        for(int i=0; i<=amount; i++) {
            if(i == 0) {
                minChange[i] = 0;
                continue;
            }

            //iterate to denoms
            int currWays = 0;
            for(int j=0; j<denom.length; j++) {
                int tempAmount = i;
                if(tempAmount >= denom[j]) {
                    tempAmount = tempAmount - denom[j];
                    currWays = 1 + minChange[tempAmount];
                }
                if(currWays < minChange[i]) {
                    minChange[i] = currWays;
                }
            }

        }
        return minChange[amount];

    }



}
