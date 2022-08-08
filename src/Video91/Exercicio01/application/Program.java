package Video91.Exercicio01.application;

import Video91.Exercicio01.entities.Vetor;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nElementos = 0;

		System.out.print("Quantos numeros você vai digitar ?: ");
		nElementos = sc.nextInt();

		while (nElementos > 10) {
			System.out.println("O máximo de elementos permitido são 10...");
			System.out.print("Quantos numeros você vai digitar ?: ");
			nElementos = sc.nextInt();
		}

		Vetor[] vet = new Vetor[nElementos];

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um número: ");
			int valor = sc.nextInt();
			vet[i] = new Vetor(valor);

		}

		System.out.println("NUMEROS NEGATIVOS: ");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i].getValor() < 0) {
				System.out.println(vet[i].getValor());
			}
		}

		sc.close();
	}
}
