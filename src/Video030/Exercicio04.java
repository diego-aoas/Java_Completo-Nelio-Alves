package Video030;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horasTrabalhadas;
        double valorHora, salario;

        System.out.print("Entre com o número do trabalhador: ");
        numero = sc.nextInt();

        System.out.print("Entre com as horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.print("Entre com as salário hora: ");
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f", salario);

        sc.close();

    }

}
