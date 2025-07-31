package Video070.application;

import Video070.util.CalculatorV03;

import java.util.Locale;
import java.util.Scanner;

public class ProgramV03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = CalculatorV03.circumference(radius);

        double v = CalculatorV03.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Value: %.2f%n", CalculatorV03.PI);

        sc.close();
    }

}
