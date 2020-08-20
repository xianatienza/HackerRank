package hackerrank.problems;

import java.util.HashMap;
import java.util.Map;

public class FindSumOfInArray {

    public static void main(String[] args) {
        int[] input = {5,2,1,7,6,9,3};
        findIndexOfSum(input, 10);
    }

    public static void findIndexOfSum(int[] inputArr, int sum) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        for(int i=0; i<inputArr.length; i++) {
            int delta = sum - inputArr[i];

            if(numIndexMap.get(delta) != null) {
                System.out.println(numIndexMap.get(delta)+","+i);
            }
            numIndexMap.put(inputArr[i],i);
        }
    }
}
