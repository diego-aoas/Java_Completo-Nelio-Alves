package Video091.Exercicio09.application;

import Video091.Exercicio09.entities.Pessoas;

import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, idade, maiorIdade = Byte.MIN_VALUE, auxN = 0;
        String nome;

        System.out.print("Quantas pessoas voce vai digitar?: ");
        n = sc.nextInt();

        Pessoas[] ps = new Pessoas[n];

        for (int i = 0; i < ps.length; i++) {
            System.out.println("### Dados da " + (i + 1) + "a pessoa ###");
            System.out.print("Nome: ");
            nome = sc.next();

            System.out.print("Idade: ");
            idade = sc.nextInt();

            ps[i] = new Pessoas(nome, idade);

            if (maiorIdade < idade) {
                maiorIdade = idade;
                auxN = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + ps[auxN].getNome());

        sc.close();
    }
}
