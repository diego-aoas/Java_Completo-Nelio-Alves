package Video049;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = 0;

        System.out.print("Entre com a senha: ");
        senha = sc.nextInt();

        while (senha != 2002) {

            System.out.println("Senha Inválida");

            System.out.print("Entre com a senha: ");
            senha = sc.nextInt();

        }
        System.out.println("Acesso permitido");

        sc.close();

    }

}
