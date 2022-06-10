package Video37;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x, y;

		System.out.print("Digite 2 valores separados por espaço: ");
		x = sc.nextDouble();
		y = sc.nextDouble();

		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else {
			System.out.println("Origem");
		}
		sc.close();
	}

}
