package Video72.util;

public class CurrencyConverter {
	public static double iof = 1.06;

	public static double calculate(double dollar, double qty) {
		return dollar * qty * iof;
	}

}
