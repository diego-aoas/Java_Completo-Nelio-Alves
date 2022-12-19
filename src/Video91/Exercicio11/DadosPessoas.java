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
        double[] altura = new double[n];
        String[] genero = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %do pessoa: ", i);
            altura[i] = sc.nextDouble();

            System.out.printf("Genero da %do pessoa: ", i);
            genero[i] = sc.nextLine();

            if (genero[i] == "F") {
                fem += 1;
            else{
                    masc += 1;
                }
            }

        }

        sc.close();
    }
}
