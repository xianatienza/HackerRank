package hackerrank.problems;

import java.util.*;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        System.out.println(getFirstUniqueChar("abcdacdbs"));
    }

    public static char getFirstUniqueChar(String value) {

        Map<Character, Integer> charMap = new LinkedHashMap<>();
        char[] charArr = value.toCharArray();

        for(int i=0; i<charArr.length; i++) {

            Integer count = charMap.get(charArr[i]);
            if( count != null) {
                count = count + 1;
                charMap.put(charArr[i], count);
            } else {
                charMap.put(charArr[i],1);

            }
        }

        Optional<Map.Entry<Character, Integer>> charEntry = charMap.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst();



        return charEntry.get().getKey();
    }
}
