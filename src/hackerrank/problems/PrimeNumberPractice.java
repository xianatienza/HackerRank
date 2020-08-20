package hackerrank.problems;

public class PrimeNumberPractice {

    public static void main(String[] args) {
        System.out.println(isPrime(100));
    }

    public static boolean isPrime(int value) {
        int sqrt = (int) Math.sqrt(value) - 1;
        for(int i=2; i< sqrt; i++) {
            if(value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
