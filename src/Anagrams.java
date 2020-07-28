import java.util.*;

public class Anagrams {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(areAnagrams(s1, s2));
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
}
