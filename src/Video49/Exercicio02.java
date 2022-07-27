package Video49;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o valor de X: ");
		int x = sc.nextInt();

		System.out.print("Entre com o valor de Y: ");
		int y = sc.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo Quadrante");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante");
			} else {
				System.out.println("Quarto Quadrante");
			} 

			System.out.print("Entre com o valor de X: ");
			x = sc.nextInt();

			System.out.print("Entre com o valor de Y: ");
			y = sc.nextInt();
		}

		sc.close();
	}
}
