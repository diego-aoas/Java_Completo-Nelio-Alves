package Video165_ExercicioFixacao.application;

import Video165_ExercicioFixacao.entities.Company;
import Video165_ExercicioFixacao.entities.Individual;
import Video165_ExercicioFixacao.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<TaxPayer>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.printf("Individual or company (i/c)?  ");
            char ch = sc.next().charAt(0);

            System.out.printf("Name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.printf("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpend = sc.nextDouble();

                list.add(new Individual(name, anualIncome, healthExpend));

            } else {
                System.out.print("Number of employees: ");
                int nEmploy = sc.nextInt();

                list.add(new Company(name, anualIncome, nEmploy));
            }
        }

        System.out.println("\nTAXES PAID:");

        for (TaxPayer tp : list) {
            System.out.printf("%s: $ %.2f%n", tp.getName(), tp.tax());
        }

        double sum = 0.0;
        for (TaxPayer tp : list) {
            sum += tp.tax();
        }

        System.out.println("\nTOTAL TAXES:");
        System.out.printf("TOTAL TAXES: $ %.2f%n", sum);

        sc.close();
    }
}
