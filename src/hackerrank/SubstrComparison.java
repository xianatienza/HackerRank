package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubstrComparison {

    public static void main(String[] args){
        substrComparison("welcometojava",3);
    }

    public static void substrComparison(String s, int k) {

        String smallest = s;
        String largest = "";

        for(int i=0; i+k<=s.length(); i++ ) {
            String currSub = s.substring(i,i+k);

            if(currSub.compareTo(smallest) < 0) {
                smallest = currSub;
            }
            if(currSub.compareTo(largest) > 0) {
                largest = currSub;
            }

        }


        System.out.println(smallest+" "+largest);
    }
}
