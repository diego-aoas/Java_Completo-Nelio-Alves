package Video70.Exercicio01.entities;

public class Rectangle {

	public double widtht;
	public double height;

	public double area() {
		return widtht * height;
	}

	public double perimeter() {
		return (widtht + height) * 2;
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(widtht, 2) + Math.pow(height, 2));
	}

}
