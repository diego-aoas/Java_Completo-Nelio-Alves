package Video30;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio, area;

		System.out.print("Insira o valor do raio: ");
		raio = sc.nextDouble();

		area = Math.PI * Math.pow(raio, 2);

		System.out.printf("A = %.4f", area);

		sc.close();

	}

}
