package hackerrank;

public class StringsIntro {

    public static void main(String[] args) {

        checkStrings("apple","dog");

    }

    public static void checkStrings(String A, String B) {

        int totalLength = A.length() + B.length();
        System.out.println(""+totalLength);

        System.out.println((A.compareTo(B) < 0)?"yes":"no");

        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length()) +" "+B.substring(0,1).toUpperCase()+B.substring(1,B.length()));


    }
}
