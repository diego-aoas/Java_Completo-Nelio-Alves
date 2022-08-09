package Video91.Exercicio04;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nElementos;

        System.out.print("Quantos numeros voce vai digitar?: ");
        nElementos = sc.nextInt();

        int[] vetPar = new int[nElementos];

        for (int i = 0; i < vetPar.length; i++) {
            System.out.print("Digite um numero: ");
            vetPar[i] = sc.nextInt();
        }

        int cont = 0;
        System.out.print("NUMEROS PARES: ");
        for (int i = 0; i < vetPar.length; i++) {
            if (vetPar[i] % 2 == 0) {
                cont += 1;
                System.out.print(vetPar[i] + "    ");
            }
        }

        System.out.println("\nQUANTIDADE DE PARES = " + cont);

        sc.close();
    }
}
