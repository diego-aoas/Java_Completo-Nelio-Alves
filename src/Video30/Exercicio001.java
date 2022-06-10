package Video30;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double larg, compr, valor, area, preco;

		System.out.print("Entre com a largura do terreno: ");
		larg = sc.nextDouble();
		System.out.print("Entre com a comprimento do terreno: ");
		compr = sc.nextDouble();
		System.out.print("Entre com a valor do m² do terreno: ");
		valor = sc.nextDouble();

		area = larg * compr;
		preco = area * valor;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f", preco);

		sc.close();

	}

}