package Video037;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, hFinal;

        System.out.print("Entre com a hora inicial e com a hora final: ");
        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            hFinal = horaFinal - horaInicial;
        } else {
            hFinal = 24 - horaFinal + horaInicial;
        }

        System.out.println("O jogo durou " + hFinal + " hora(s)");

        sc.close();
    }

}
