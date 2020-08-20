package hackerrank.problems;

public class DynamicProgrammingPractice {

    public static void main(String[] args) {

        int n = 10;
        int[] computed = new int[n+1];
        System.out.println(factorial(n, computed));

    }

    public static int fibo(int n, int[] computed) {
        if(computed[n] != 0) {
            return computed[n];
        }
        if(n == 1 || n == 2){
            return 1;
        }
        int sum = fibo(n-1, computed) + fibo(n-2, computed);
        computed[n] = sum;

        return sum;
    }

    // n = 5,
    // f(4) * f(3)
    // f(3) f(2)    f(2) f(1)
    //                     1
     public static int factorial(int n, int[] computed) {
        if(computed[n] != 0) {
            return computed[n];
        }
        if(n <= 1) {
            return 1;
        }
        int product = n*factorial(n-1, computed);
        computed[n] = product;
        return product;

    }
}
