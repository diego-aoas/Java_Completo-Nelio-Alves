package Video91.Exercicio08;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, par = 0;
        double media = 0;

        System.out.print("Quantos elementos vai ter o vetor?: ");
        n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();

            if (vet[i] % 2 == 0) {
                media += vet[i];
                par++;
            }
        }

        media = media / par;

        if (media > 0) {
            System.out.printf("MEDIA DOS PARES = %.1f\n", media);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}
