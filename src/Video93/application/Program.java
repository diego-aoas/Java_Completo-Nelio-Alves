package Video93.application;


import Video93.entities.Rent;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.printf("How many rooms will be rented? ");
        int qtyRent = sc.nextInt();

        for (int i = 0; i < qtyRent; i++) {
            System.out.printf("\nRent #%d\n", i + 1);
            System.out.printf("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.printf("Email: ");
            String email = sc.next();

            System.out.printf("Room: ");
            int room = sc.nextInt();

            vect[room] = new Rent(name, email);
        }

        System.out.printf("\nBusy rooms: \n");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();

    }
}
