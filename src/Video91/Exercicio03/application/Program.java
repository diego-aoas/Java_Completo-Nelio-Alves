package Video91.Exercicio03.application;

import Video91.Exercicio03.entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtdPessoas = 0;

        System.out.print("Quantas pessoas serão digitadas? ");
        qtdPessoas = sc.nextInt();

        Pessoas[] p = new Pessoas[qtdPessoas];

        for (int i = 0; i < p.length; i++) {
            System.out.print("### Dados da " + (i + 1) + "a pessoa ###");
            System.out.print("\nNome: ");
            String nome = sc.next();
            sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            p[i] = new Pessoas(nome, idade, altura);
        }

        double mediaAlt = 0;
        for (int i = 0; i < p.length; i++) {
            mediaAlt += p[i].getAltura();
        }

        mediaAlt = mediaAlt / qtdPessoas;

        System.out.printf("\nAltura média: %.2f%n", mediaAlt);

        double menor16 = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i].getIdade() < 16) {
                menor16 += 1;
            }
        }

        menor16 = (menor16 / qtdPessoas) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%", menor16);
//
        System.out.print("\nPessoas menores de 16: ");

        for (int i = 0; i < p.length; i++) {
            String menor="";
            if (p[i].getIdade() < 16) {
                menor = p[i].getNome();

            }
            System.out.printf(menor + "    ");
        }

        sc.close();

    }
}