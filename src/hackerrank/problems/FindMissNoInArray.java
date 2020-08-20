package hackerrank.problems;

public class FindMissNoInArray {

    public static void main(String[] args) {
        System.out.println(""+findMissing(new int[]{1,2,3,4,5,6,7,0,9,10}));
    }

    public static int findMissing(int[] values) {

        int n = values.length;
        int sum = 0;
        int expectedSum = (n*(n+1))/2;
        for(int i=0; i<n; i++) {
            sum = sum + values[i];
        }

        return expectedSum - sum;

    }
}
