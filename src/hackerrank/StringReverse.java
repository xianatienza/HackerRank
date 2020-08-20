package hackerrank;

import java.util.*;

public class StringReverse {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String toReverse = sc.nextLine();

        //System.out.println(toReverse.equalsIgnoreCase(reverse(toReverse)));
//        System.out.println(reverseBuffer(toReverse));
//        System.out.println(hasUnique(toReverse));

        //System.out.println(reverseManual(toReverse));

        Helper.printArray(swapWithOutTemp(new int[]{1,-1},0,1));

    }

    public static String reverse(String toReverse) {
        char[] toRevArr = toReverse.toCharArray();
        char[] reverse = new char[toReverse.length()];
        for(int i=toRevArr.length-1; i>-1; i--) {
            reverse[toRevArr.length-1-i] = toRevArr[i];
        }
        return String.valueOf(reverse);
    }

    public static String reverseBuffer(String toReverse) {
        StringBuffer sb = new StringBuffer(toReverse);
        sb.reverse();

        return sb.toString();
    }

    public static boolean hasUnique(String toCheck) {

        Set<Character> charSet = new HashSet<Character>();
        char[] charArr = toCheck.toCharArray();

        for(int i = 0; i<charArr.length; i++) {
            if(!charSet.add(charArr[i])){
                return false;
            }
        }

        return true;
    }

    public static String reverseManual(String toReverse) {

        char[] value = toReverse.toCharArray();

        for(int i=0; i<value.length/2; i++) {
            swap(value, i, value.length-1-i);
        }

        return String.valueOf(value);
    }

    private static void swap(char[] value, int x, int y) {
        char temp = value[x];
        value[x] = value[y];
        value[y] = temp;
    }

    private static int[] swapWithOutTemp(int[] value, int x, int y) {
        value[x] = value[x] + value[y];
        value[y] = value[x] - value[y];
        value[x] = value[x] - value[y];
        return value;
    }
}

