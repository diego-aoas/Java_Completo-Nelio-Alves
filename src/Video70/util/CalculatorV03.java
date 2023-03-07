package Video70.util;

public class CalculatorV03 {
	public static final double PI = 3.14159; // final = constante e sempre usar em maiúscula.

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
