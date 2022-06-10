package Video37;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("Entre com um número: ");
		num = sc.nextInt();

		if (num < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.print("NÃO NEGATIVO");
		}

		sc.close();
	}

}
