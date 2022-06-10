package Video37;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;

		System.out.print("Entre com 2 números: ");
		a = sc.nextInt();
		b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("São Múltiplos");
		} else {
			System.out.println("Não são Múltiplos");
		}

		sc.close();
	}

}
