package Video30;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		int A, B, C, D, diferenca;

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o valor de A: ");
		A = sc.nextInt();
		System.out.print("Entre com o valor de B: ");
		B = sc.nextInt();
		System.out.print("Entre com o valor de C: ");
		C = sc.nextInt();
		System.out.print("Entre com o valor de D: ");
		D = sc.nextInt();

		diferenca = A * B - C * D;

		System.out.println("DIFERENÇA: " + diferenca);

		sc.close();
	}

}
