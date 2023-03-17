package Video91.Exercicio11;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        int masc = 0, fem = 0;
        double menorAltura = Byte.MAX_VALUE, maiorAltura = Byte.MIN_VALUE, mediaAltF = 0;
        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();

            System.out.printf("Genero da %da pessoa: ", i + 1);
            genero[i] = sc.next().toUpperCase().charAt(0);

            if (genero[i] == 'M') {
                masc += 1;
            } else {
                mediaAltF += altura[i];
                fem += 1;
            }


            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }

            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }

        mediaAltF = mediaAltF / fem;

        System.out.println("Menor altura foi: " + menorAltura);
        System.out.println("Maior altura foi: " + maiorAltura);
        System.out.printf("Média das alturas das mulheres: %.2f\n", mediaAltF);
        System.out.println("Numero de homens: " + masc);


        sc.close();
    }
}
