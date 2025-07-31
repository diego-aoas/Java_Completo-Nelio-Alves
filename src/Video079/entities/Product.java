package Video079.entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product() {

    }

    public Product(String name, double price, int quantity) { // Construtor
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) { // Construtor
        this.name = name;
        this.price = price;
        // quantity = 0; ===> É opcional declarar ou não. E a variável não precisa
        // do"this".

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

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
