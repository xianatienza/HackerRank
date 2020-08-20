package hackerrank;

import java.util.*;
import java.util.concurrent.BlockingQueue;

public class Anagrams {

    public static void main(String[] args) {
        List list = new ArrayList();
        Stack test = new Stack();
        Set set = new HashSet();
        Map map = new Hashtable();


//
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//
//        System.out.println(areAnagrams(s1, s2));

        System.out.println(tryFinally());

        if(null instanceof Object) {
            System.out.println("true");

        }
    }

    public static boolean tryFinally() {
        try {
            System.exit(1);
        } finally {
            return false;
        }
    }

    public static boolean areAnagrams(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length() != s2.length())
            return false;

        char[] s1Arr = s1.toCharArray();
        for(int i=0;i<s1.length();i++) {
            s2 = s2.replaceFirst(String.valueOf(s1Arr[i]),"");
        }
        if(s2.length() == 0) {
            return true;
        } else {
            return false;
        }

    }

//    public static boolean areAnagrams2(String s1, String s2) {
//
//
//
//    }
}
