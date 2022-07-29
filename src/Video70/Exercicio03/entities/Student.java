package Video70.Exercicio03.entities;

public class Student {
	public String name;
	public double n1;
	public double n2;
	public double n3;

	public double totalNotas() {
		return n1 + n2 + n3;
	}

	public String toString() {

		if (totalNotas() >= 60) {
			return "PASS";
		} else {
			return "FAILED \nMissing " + String.format("%.2f", (60.00 - totalNotas())) + " points...";
		}

	}
}
