package Video69.Exercicio03.application;

import java.util.Locale;
import java.util.Scanner;
import Video69.Exercicio03.entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student std = new Student();

		System.out.println("Entre com o nome do aluno:");
		std.name = sc.nextLine();

		System.out.println("Entre com as notas do aluno:");
		std.n1 = sc.nextDouble();
		std.n2 = sc.nextDouble();
		std.n3 = sc.nextDouble();

		System.out.printf("Final Grade = %.2f", std.totalNotas());
		System.out.println("\n" + std);

		sc.close();

	}

}
