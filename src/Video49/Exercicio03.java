package Video49;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0;

		System.out.println("### OPÇÕES ### \n1.Álcool \n2.Gasolina \n3.Diesel \n4.Fim");
		System.out.print("Digite a opção do combustível desejado: ");
		int opcao = sc.nextInt();

		while (opcao != 4) {

			if (opcao == 1) {
				alcool += 1;
			} else if (opcao == 2) {
				gasolina += 1;
			} else if (opcao == 3) {
				diesel += 1;
			} else {
				System.out.println("Opção inválida...");
			}

			System.out.print("Digite a opção do combustível desejado: ");
			opcao = sc.nextInt();

		}

		System.out.println("MUITO OBRIGADO");
		System.out.printf("Álcool: %d \nGasolina: %d \nDiesel: %d", alcool, gasolina, diesel);

		sc.close();

	}
}