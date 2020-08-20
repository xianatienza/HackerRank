package hackerrank.problems;

import hackerrank.Helper;

import java.util.Arrays;

public class RemoveDuplicateInArray {

    public static void main(String[] args) {
        removeDuplicate(new int[]{9, 7, 1, 1, 2, 3, 4, 4, 5, 5, 6, 6, 6});
    }

    public static void removeDuplicate(int[] values) {
        Arrays.sort(values);
        Helper.printArray(values);

        int[] uniqueVals = new int[values.length];
        int prev = values[0];
        for(int i=1; i< values.length; i++) {
            if(prev == values[i]) {

            }
        }
    }
}
