package hackerrank.problems;

import java.util.HashSet;

public class GettingADifferentNumber {

    /**
     * Give an array of non-negative no.
     * find the smallest no. that is not in
     * the array
     * arr = [0, 1, 2, 3]
     * smallest = 4
     *
     * min = 0;
     *
     * [5, 6, 7, 0, 8,  1, 2,  3, 4,10, 12]
     *
     * {5,6,7,0}
     *
     * min = 0
     * */
    public static void main(String[] args) {

        System.out.println(findSmallestNonExisting(new int[]{5, 6, 7, 0, 8, 1, 2, 3, 4, 10, 12}));
        System.out.println(findSmallestNonExisting(new int[]{0,1,2,3}));
    }

    public static int findSmallestNonExisting(int[] arr) {
        HashSet visitedNums = new HashSet();

        int min = 0;
        for (int i=0; i<arr.length; i++) {
            visitedNums.add(arr[i]);
            if(visitedNums.contains(min)) {
                min++;
                while(visitedNums.contains(min)) {
                    min++;
                }
            }
        }
        return min;
    }
}
