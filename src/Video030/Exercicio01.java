package Video030;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, soma;

        System.out.print("Entre com um número: ");
        num1 = sc.nextInt();
        System.out.print("Entre com outro número: ");
        num2 = sc.nextInt();

        soma = num1 + num2;

        System.out.println("SOMA = " + soma);

        sc.close();
    }

}
