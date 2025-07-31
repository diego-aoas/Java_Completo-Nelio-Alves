package Video082.application;

import java.util.Locale;
import java.util.Scanner;

import Video082.entities.Account;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Is threre na initial deposit (y/n)? ");
        char initialDeposit = Character.toUpperCase(sc.next().charAt(0));

        Account acc;

        if (initialDeposit == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double initalDepositValue = sc.nextDouble();
            acc = new Account(accountNumber, name, initalDepositValue);
        } else {
            acc = new Account(accountNumber, name);
        }

        System.out.println("\nAccount data:");
        System.out.println(acc);

        System.out.print("\nEnter a deposit value: ");
        double newDeposit = sc.nextDouble();
        acc.depositValue(newDeposit);

        System.out.println("\nUpdated account data:");
        System.out.println(acc);

        System.out.print("\nEnter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        acc.withdrawValue(withdrawValue);

        System.out.println("\nUpdated account data:");
        System.out.println(acc);

        sc.close();

    }

}
