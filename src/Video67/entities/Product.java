package Video67.entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity; // this = referência para o atributo da classe;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity; // novamente this referenciando o atributo da classe;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", (quantity * price));
	}
}
