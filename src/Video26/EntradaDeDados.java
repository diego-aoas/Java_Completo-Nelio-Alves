package Video26;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// EXEMPLO 1
		/*
		 * String x; x = sc.next();
		 * 
		 * System.out.println("Voce digitou: " + x);
		 */

		// EXEMPLO 2
		/*
		 * int x; x = sc.nextInt();
		 * 
		 * System.out.println("Voce digitou: " + x);
		 */

		// EXEMPLO 3
		/*
		 * double x; x = sc.nextDouble();
		 * 
		 * System.out.printf("Você digitou: %.2f ", x);
		 */

		// EXEMPLO 4
		/*
		 * char x; x = sc.next().charAt(0);
		 * 
		 * System.out.printf("Você digitou: %s ", x);
		 */

		// EXEMPLO 5

		String x;
		int y;
		double z;

		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();

		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();

	}

}
