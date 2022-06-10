package Video37;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod, qtd;
		double total;

		System.out.print("Entre com o código do pedido e a quantidade: ");
		cod = sc.nextInt();
		qtd = sc.nextInt();

		if (cod == 1) {
			total = 4.00 * qtd;
		} else if (cod == 2) {
			total = 4.50 * qtd;
		} else if (cod == 3) {
			total = 5.00 * qtd;
		} else if (cod == 4) {
			total = 2.00 * qtd;
		} else {
			total = 1.50 * qtd;
		}

		System.out.printf("Total: R$ %.2f", total);

		sc.close();

	}

}
