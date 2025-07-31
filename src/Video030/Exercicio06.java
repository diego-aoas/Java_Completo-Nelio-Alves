package Video030;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, a, b, c, d, e;

        System.out.print("Entre com o valor de A: ");
        A = sc.nextDouble();
        System.out.print("Entre com o valor de B: ");
        B = sc.nextDouble();
        System.out.print("Entre com o valor de C: ");
        C = sc.nextDouble();

        a = A * C / 2;
        b = Math.PI * Math.pow(C, 2);
        c = (A + B) * C / 2;
        d = Math.pow(B, 2);
        e = A * B;

        System.out.printf("TRIANGULO:   %.3f%n", a);
        System.out.printf("CIRCULO:     %.3f%n", b);
        System.out.printf("TRAPEZIO:    %.3f%n", c);
        System.out.printf("QUADRADO:    %.3f%n", d);
        System.out.printf("RETANGULO:   %.3f%n", e);

        sc.close();

    }

}
