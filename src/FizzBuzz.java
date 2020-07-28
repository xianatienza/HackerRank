import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(fizzBuzz(Integer.parseInt(input)));

    }

    public static String fizzBuzz(int num) {
        if(num % 15 == 0) {
            return "fizzBuzz";
        } else
        if (num % 3 == 0) {
            return "fizz";
        } else
        if(num % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(num);
    }


}
