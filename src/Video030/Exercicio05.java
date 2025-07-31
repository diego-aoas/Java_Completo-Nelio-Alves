package Video030;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int peca1, nroPeca1, peca2, nroPeca2;
        double valorUnitario1, valorUnitario2, totalGeral;

        System.out.print("Entre com o código, número de peças e valor unitário da Peça 1: ");
        peca1 = sc.nextInt();
        nroPeca1 = sc.nextInt();
        valorUnitario1 = sc.nextDouble();

        System.out.print("Entre com o código, número de peças e valor unitário da Peça 2: ");
        peca2 = sc.nextInt();
        nroPeca2 = sc.nextInt();
        valorUnitario2 = sc.nextDouble();

        totalGeral = nroPeca1 * valorUnitario1 + nroPeca2 * valorUnitario2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", totalGeral);

        sc.close();

    }

}
