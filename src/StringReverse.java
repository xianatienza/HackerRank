import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String toReverse = sc.nextLine();

        System.out.println(toReverse.equalsIgnoreCase(reverse(toReverse)));
    }

    public static String reverse(String toReverse) {
        char[] toRevArr = toReverse.toCharArray();
        char[] reverse = new char[toReverse.length()];
        for(int i=toRevArr.length-1; i>-1; i--) {
            reverse[toRevArr.length-1-i] = toRevArr[i];
        }
        return String.valueOf(reverse);
    }
}
