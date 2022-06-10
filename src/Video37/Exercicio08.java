package Video37;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o seu salário: ");
		double salario = sc.nextDouble();

		double salarioFinal;

		if (salario <= 2000) {
			System.out.printf("O imposto é isento");
		} else if (salario <= 3000) {
			salarioFinal = (salario - 2000.0) * 0.08;
			System.out.println("R$ " + salarioFinal);
		} else if (salario <= 4500) {
			salarioFinal = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
			System.out.println("R$ " + salarioFinal);
		} else {
			salarioFinal = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;

			System.out.println("R$ " + salarioFinal);
		}

		sc.close();

	}

}
