package Video91.Exercicio07;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double media = 0;

        System.out.print("Quantos elementos vai ter o vetor?: ");
        n = sc.nextInt();

        double[] vetMedia = new double[n];

        for (int i = 0; i < vetMedia.length; i++) {
            System.out.print("Digite um numero: ");
            vetMedia[i] = sc.nextDouble();
            media += vetMedia[i];
        }

        media = media / n;

        System.out.printf("%nMEDIA DO VETOR = %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for (int i = 0; i < vetMedia.length; i++) {
            if (vetMedia[i] < media) {
                System.out.println(vetMedia[i]);
            }
        }

        sc.close();

    }
}
