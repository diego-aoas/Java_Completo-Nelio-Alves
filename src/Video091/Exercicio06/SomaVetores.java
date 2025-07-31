package Video091.Exercicio06;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos numeros voce vai digitar?: ");
        n = sc.nextInt();

        int[] vetA = new int[n];
        int[] vetB = new int[vetA.length];
        int[] vetC = new int[vetB.length];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++) {
            vetA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < n; i++) {
            vetB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < n; i++) {
            vetC[i] = vetA[i] + vetB[i];
            System.out.println(vetC[i]);
        }

        sc.close();

    }
}
