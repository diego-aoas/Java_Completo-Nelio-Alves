package Video25;

public class ProcessamentoDadosJavaCasting {

	public static void main(String[] args) {

		// EXEMPLO 1
		/*
		 * int x, y; x = 5; y = 2 * x; System.out.println(x); System.out.println(y);
		 */

		// EXEMPLO 2
		/*
		 * int x; double y; x = 5; y = 2 * x; System.out.println(x);
		 * System.out.println(y);
		 */

		// EXEMPLO 3
		/*
		 * double b, B, h, area; b = 6.0; B = 8.0; h = 5.0; area = (b + B) / 2.0 * h;
		 * System.out.println(area);
		 */

		// EXEMPLO 4
		/*
		 * int a, b; double resultado; a = 5; b = 2; resultado = (double) a / b;
		 * System.out.println(resultado);
		 */

		// EXEMPLO 5
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		resultado = (double) a / b; // Sem o cast double o resultado seria 2.0
		System.out.println(resultado);
	}

}
