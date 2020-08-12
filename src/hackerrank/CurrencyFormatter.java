package hackerrank;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();



        // Write your code here.

        NumberFormat usNf = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usNf.format(payment);

        NumberFormat inNf = NumberFormat.getCurrencyInstance(new Locale("Rs."));
        String india = inNf.format(payment);

        NumberFormat chNf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chNf.format(payment);

        NumberFormat frNf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = frNf.format(payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
