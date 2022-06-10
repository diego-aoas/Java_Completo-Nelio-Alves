package Video24;

import java.util.Locale;

public class Video24 {

	public static void main(String[] args) {

		int y = 32;
		double x = 10.35784;
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;


		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x); // f é de formatado
		System.out.printf("%.4f%n", x); // f é de formatado
		System.out.println("Bom dia!");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);

		System.out.println("RESULTADO = " + x + " METROS");

		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);

	}

}
