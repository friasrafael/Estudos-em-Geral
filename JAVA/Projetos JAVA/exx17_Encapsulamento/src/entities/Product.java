package entities;

public class Product {
	
	/*Alterando a variável de PUBLIC para PRIVATE ela não pode ser alterada no processo,
	 com a excessão da utilização de métodos como GETTERS e SETTERS*/
	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) { 
		this.name = name;
		this.price = price;
		this.quantity = quantity;	
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	/*Criando um método SETTER para alterar o NAME de uma variável PRIVATE*/
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	/*Retorna o valor de uma variável PRIVATE através do método GETTER*/
	public String getName() {
		return name;
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
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	// Retorna uma String utilizando o método toString(), sobrepondo a operação
	// padrão do Object
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
		// O String.format está sendo utilizado para mudar a quantidade de casas
		// decimais do double
	}

}
