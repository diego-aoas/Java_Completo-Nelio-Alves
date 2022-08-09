package Video91.Exercicio02.application;

import Video91.Exercicio02.entities.VetorOperacoes;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtd = 0;

        System.out.print("Quantos numeros voce vai digitar?: ");
        qtd = sc.nextInt();

        VetorOperacoes[] vetOp = new VetorOperacoes[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite um numero: ");
            double valor = sc.nextDouble();

            vetOp[i] = new VetorOperacoes(valor);
        }

        System.out.print("VALORES = ");

        for (int i = 0; i < vetOp.length; i++) {
            System.out.print(vetOp[i].getValor() + "    ");
        }

        double soma = 0;
        for (int i = 0; i < vetOp.length; i++) {
            soma += vetOp[i].getValor();
        }
        System.out.println("\nSOMA = " + soma);

        double media = soma / qtd;

        System.out.println("MEDIA  " + media);

        sc.close();
    }
}
