package hackerrank.problems;

public class FiboIterative {

    public static void main(String[] args) {
        System.out.println(printFibo(11));
    }

    //1,1,2,3,5,8,13,21,34,55,89
    //
    //pSum 1
    //cSum 1
    //F6 = 8
    public static int printFibo(int n) {

        int prevSum = 1;
        int currSum = 1;
        int totalSum = 1;

        if(n == 1) {
            return prevSum;
        }

        if(n == 2) {
            return currSum;
        }

        for(int i=2; i<n; i++) {
           totalSum = currSum + prevSum;
           prevSum = currSum;
           currSum = totalSum;
        }

        return totalSum;
    }
}
