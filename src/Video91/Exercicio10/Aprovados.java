package Video91.Exercicio10;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos alunos serão digitados? ");
        n = sc.nextInt();

        String[] nome = new String[n];
        Double[] nota1 = new Double[n];
        Double[] nota2 = new Double[n];

        double media;

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            sc.nextLine();
            nome[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < n; i++) {
            media = (nota1[i] + nota2[i]) / 2;

            if (media >= 6.00) {
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
}
