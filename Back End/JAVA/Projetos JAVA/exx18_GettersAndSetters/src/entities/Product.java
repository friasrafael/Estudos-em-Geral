package entities;

public class Product {
	
	/*CONSTRUTORES podem ser gerados automaticamente, utilizando:
	 BOT�O DIREITO > SOURCE > GENERATE CONSTRUCTOR USING FIELDS*/
	
	/*GETTERS e SETTERS podem ser gerados automaticamente, utilizando:
	 BOT�O DIREITO > SOURCE > GENERATE GETTERS AND SETTERS*/
	private String name;
	private double price;
	private int quantity;

	public Product() {
	}
	
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
		// O String.format est� sendo utilizado para mudar a quantidade de casas
		// decimais do double
	}

}
