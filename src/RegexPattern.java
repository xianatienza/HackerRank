import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class RegexPattern {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {

    public String pattern = "\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}";



}