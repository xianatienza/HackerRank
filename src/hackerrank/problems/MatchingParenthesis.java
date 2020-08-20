package hackerrank.problems;

import java.util.EmptyStackException;
import java.util.Stack;

/****
 * Given a string of parethesis,
 * check if it is properly matching or
 * not
 *
 */
public class MatchingParenthesis {
    public static void main(String[] args) {
        System.out.println(checkParenthesis("{{{{}}{}}}"));
    }

    public static boolean checkParenthesis(String input) {
        Stack<Character> charStack = new Stack<Character>();

        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == '{') {
                charStack.push(input.charAt(i));
            } else {
                try {
                    charStack.pop();
                } catch(EmptyStackException e) {
                    return false;
                }
            }
        }
        return charStack.empty();
    }
}
