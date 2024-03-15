package Video162_ExercicioFixacao.application;

import Video162_ExercicioFixacao.entities.ImportedProduct;
import Video162_ExercicioFixacao.entities.Product;
import Video162_ExercicioFixacao.entities.UsedProduct;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int p = sc.nextInt();

        for (int i = 1; i <= p; i++) {
            System.out.print("Product #" + i + " data:");
            System.out.print("\nCommon, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (type == 'c') {
                list.add(new Product(name, price));
            } else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            } else {
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, fee));
            }

        }

        System.out.println();
        System.out.println("PRICE TAGS:");

        for (Product prod : list) {
            System.out.printf(prod.priceTag());
        }
        sc.close();

    }
}
