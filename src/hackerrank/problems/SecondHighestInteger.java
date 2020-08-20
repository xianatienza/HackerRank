package hackerrank.problems;

public class SecondHighestInteger {
    public static void main(String[] args) {
        System.out.println(findSecondMax(new int[]{1,4,6,3,8,7,9,1,4,10}));
    }

    /**
     *  1 4 6 3 8 7 9 1 4
     * */
    public static int findSecondMax(int[] values) {
        int max = 0;
        int maxMax = 0;

        for(int i=0; i<values.length; i++) {
            if(values[i] > maxMax) {
                max = maxMax;
                maxMax = values[i];
            }
        }

        return max;
    }
}
