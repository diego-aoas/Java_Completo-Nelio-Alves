package Video039;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o número do dia: ");
        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
            case 5:
                dia = "Quinta";
            case 6:
                dia = "Sexta";
            case 7:
                dia = "Sábado";
            default:
                dia = "Valor Inválido";
                break;
        }

        System.out.println("Dia da semana: " + dia);

        sc.close();
    }

}
