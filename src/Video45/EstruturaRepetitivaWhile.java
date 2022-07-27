package Video45;

import java.util.Scanner;

public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o valor: ");
		int x = sc.nextInt();

		int soma = 0;

		while (x != 0) {
			soma += x;

			System.out.print("Entre com o valor: ");
			x = sc.nextInt();

		}

		System.out.print("A soma dos números foram: " + soma);

		sc.close();

	}

}
