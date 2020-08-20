package hackerrank;

import java.util.*;

public class StringsIntro {

    public static void main(String[] args) {

//        checkStrings("apple","dog");
        //System.out.println(removeChar("aaanbasdbart",'a'));

       // printPerm("","ABCD");
        //System.out.println(longestPalindrome("xyzabccbaweraaaaaaaaaa"));
        System.out.println(areAnagrams("abdea","dbaee"));
    }

    public static void checkStrings(String A, String B) {

        int totalLength = A.length() + B.length();
        System.out.println(""+totalLength);

        System.out.println((A.compareTo(B) < 0)?"yes":"no");

        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length()) +" "+B.substring(0,1).toUpperCase()+B.substring(1,B.length()));


    }

    public static String removeChar(String value, char charToRemove) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i< value.length(); i++) {
            if(value.charAt(i) != charToRemove) {
                builder.append(value.charAt(i));
            }
        }
        return builder.toString();
    }


     /**
      * ABCD
      *
      * A BCD
      *
      *   B CD
      *   C BD
      *   D BC
      *
      * B ACD
      *   A CD
      *     C D
      *     D C
      *   C AD
      *     A D
      *     D A
      *   D AC
      *     A C
      *     C A
      *
      * C
      *
      * D
      *
      * printPerm("","ABCD");
      * printPerm("A","BCD");
      * printPerm("B","ACD");
      * printPerm("C","ABD");
      * printPerm("D","ABC");
      * **/
    public static void printPerm(String fixed, String perm) {

        if(perm.length() == 1) {
            System.out.println(fixed+perm);
            return;
        }

        for(int i=0; i<perm.length(); i++) {
            printPerm(fixed.concat(String.valueOf(perm.charAt(i))),perm.replaceAll(String.valueOf(perm.charAt(i)),""));
        }

    }
    /***
     * i j
     * adeabcdcbabas
     * Find 2 same char and adjacent
     * Find 2 same char with 1 diff
     *
     *
     * **/
    public static String longestPalindrome(String value) {

        //find 2 consecutive
        String max = "";
        for(int i=0; i<value.length()-1; i++) {
            if(value.charAt(i) == value.charAt(i+1)) {
                String curr = growPalindrome(value, i, i+1);
                if(curr.length() > max.length()) {
                    max = curr;
                }
            }
        }
        return max;
    }


    private static String growPalindrome(String value, int x, int y) {
        while(x > 1 && y < value.length()-2) {
            if(value.charAt(x-1) != value.charAt(y+1)) {
                return value.substring(x,y);
            }
            x--;
            y++;
        }
        return value.substring(x,y);
    }

    private static boolean areAnagrams(String s1, String s2) {

        if(s1.length() != s2.length()) {
            return false;
        }

        char[] s1arr = s1.toCharArray();
        char[] s2arr = s2.toCharArray();

        Arrays.sort(s1arr);
        Arrays.sort(s2arr);

        for(int i=0; i<s1arr.length; i++) {
            if(s1arr[i] != s2arr[i]) {
                return false;
            }
        }

        return true;

    }
}
