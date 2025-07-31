package Video035;

import java.util.Scanner;

public class EstruturaCondicional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // EXEMPLO 1
        /*
         * int x = 5;
         *
         * System.out.println("Bom dia");
         *
         * if (x < 0) { System.out.println("Boa tarde"); }
         *
         * System.out.println("Boa noite");
         */

        // EXEMPLO 2

        int hora;

        System.out.print("Quantas horas? ");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia");
        } else if (hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        sc.close();
    }
}
