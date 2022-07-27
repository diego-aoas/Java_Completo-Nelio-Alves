package Video50;

import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de números a serem somados: ");
		int N = sc.nextInt();

		int soma = 0;

		for (int i = 0; i < N; i++) {
			System.out.print("Entre com o valor a ser somado: ");
			int x = sc.nextInt();
			soma += x;

		}

		System.out.printf("O valor da soma dos números foi %d!", soma);
		sc.close();

	}

}
