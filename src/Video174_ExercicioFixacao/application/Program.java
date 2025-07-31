package Video174_ExercicioFixacao.application;

import Video174_ExercicioFixacao.model.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int num = sc.nextInt();
        System.out.print("Holder: ");
        String hold = sc.nextLine();
        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double wLimit = sc.nextDouble();
        System.out.print("Enter amount for withdraw: 100.00: ");
        Double amount = sc.nextDouble();

        Account acc = new Account(num, hold, balance, wLimit);

        System.out.println("Enter amount for withdraw: " + acc.getBalance());
        //terminar

        sc.close();
    }
}
