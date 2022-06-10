package Video37;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double num;

		System.out.print("Insira um valor: ");
		num = sc.nextDouble();

		if (num >= 0 && num <= 25) {
			System.out.println("Intervalo de [0 - 25]");
		} else if (num > 25 && num <= 50) {
			System.out.println("Intervalo de [25 - 50]");
		} else if (num > 50 && num <= 75) {
			System.out.println("Intervalo de [50 - 75]");
		} else if (num > 75 && num <= 100) {
			System.out.println("Intervalo de [75 - 100]");
		} else {
			System.out.println("Fora do Intervalo");
		}

		sc.close();

	}

}
