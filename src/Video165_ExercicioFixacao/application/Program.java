package Video165_ExercicioFixacao.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.printf("Individual or company (i/c)?  ");
            char ch = sc.next().charAt(0);

            System.out.printf("Name: ");
            String name = sc.nextLine();
            System.out.printf("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (ch == 'i'){
                print
            }

        }





        sc.close();

    }
}
