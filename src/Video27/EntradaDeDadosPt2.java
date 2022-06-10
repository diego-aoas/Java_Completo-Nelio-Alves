package Video27;

import java.util.Scanner;

public class EntradaDeDadosPt2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		x = sc.nextInt();
		sc.nextLine(); // Ao utilizar um número, o "Enter" consome uma linha, então é necessário inserir um nextLine vazio para seguir o fluxo
		s1 = sc.nextLine(); // nextLine lê até a próxima quebra de linha.
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
