package Video072.application;

import Video072.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double priceDolar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double qtyDollar = sc.nextDouble();

        System.out.println("Amount to be paid in reais = " + CurrencyConverter.calculate(priceDolar, qtyDollar));

        sc.close();

    }

}
