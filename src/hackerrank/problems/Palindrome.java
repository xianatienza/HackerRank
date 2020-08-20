package hackerrank.problems;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(checkIfPalindrome("bananab"));
    }

    public static boolean checkIfPalindrome(String value) {
        char[] valArr = value.toCharArray();

        for(int i=0; i< valArr.length/2; i++) {
            if(valArr[i] != valArr[valArr.length-1-i]) {
                return false;
            };
        }
        return true;
    }


}
