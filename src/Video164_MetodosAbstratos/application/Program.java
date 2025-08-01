package Video164_MetodosAbstratos.application;

import Video164_MetodosAbstratos.entities.Circle;
import Video164_MetodosAbstratos.entities.Rectangle;
import Video164_MetodosAbstratos.entities.Shape;
import Video164_MetodosAbstratos.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.printf("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.printf("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.printf("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.printf("Width: ");
                double width = sc.nextDouble();
                System.out.printf("Height: ");
                double height = sc.nextDouble();

                list.add(new Rectangle(color, width, height));

            } else {
                System.out.printf("Radius: ");
                double radius = sc.nextDouble();

                list.add(new Circle(color, radius));
            }
        }
        System.out.println();
        System.out.println("SHAPES AREAS: ");

        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();

    }
}
