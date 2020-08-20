package hackerrank.problems;

public class CountSay {


    /**
     * 1
     * 11
     * 21
     * 1211
     * 111221
     * 312211
     * 13112221
     */

    public static void main(String[] args) {

        //countSay(10);
        System.out.println(countSaySub("1211"));

    }

    public static void countSay(int rows) {



    }

    /**
     * currChar = 11;
     * 111221
     *
     * @param numbers
     * @return
     */
    public static String countSaySub(String numbers) {
        char[] charArr = numbers.toCharArray();
        int i = 0;
        int currSum = 1;
        String currString = "";
        char currChar = charArr[0];
        while(i<charArr.length) {

            //1st row
            if(charArr.length==1) {
                return charArr[0]+"1";
            }

            currChar = charArr[i];

            if(charArr.length==i+1) {
                currString = currString + currSum + currChar;
                break;
            }
            //next
            if(currChar == charArr[i+1]) {
                currSum++;
                i++;
                continue;
            }

            if(currChar != charArr[i+1] ) {
             currString = currString + currSum + currChar;
             currSum = 1;
            }
            i++;

        }
        return currString;
    }

}
