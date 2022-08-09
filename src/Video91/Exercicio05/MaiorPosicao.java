package Video91.Exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0, pos = Byte.MIN_VALUE;

        System.out.print("Quantos numeros voce vai digitar?: ");
        n = sc.nextInt();

        double[] vetMaior = new double[n];

        for (int i = 0; i < vetMaior.length; i++) {
            System.out.print("Digite um numero: ");
            vetMaior[i] = sc.nextDouble();
        }

        double auxMaior = Byte.MIN_VALUE;

        for (int i = 0; i < vetMaior.length; i++) {
            if (vetMaior[i] > auxMaior) {
                auxMaior = vetMaior[i];
                pos = i;
            }
        }

        System.out.println("MAIOR VALOR = " + auxMaior);
        System.out.println("POSICAO DO MAIOR VALOR = " + pos);

        sc.close();
    }
}
