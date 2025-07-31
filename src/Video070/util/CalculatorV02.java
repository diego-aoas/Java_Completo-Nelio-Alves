package Video070.util;

public class CalculatorV02 {
    public final double PI = 3.14159; // final = constante e sempre usar em maiúscula.

    public double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
