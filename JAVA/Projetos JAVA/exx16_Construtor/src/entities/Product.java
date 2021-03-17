package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	/*Criei um CONSTRUTOR que obrigar� o usu�rio a inserir um valor para os par�metros
	Isso far� com que seja imposs�vel colocar um nome de produto sem um pre�o ou quantidade*/
	public Product(String name, double price, int quantity) { 
		this.name = name;
		this.price = price;
		this.quantity = quantity;	
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

	// Retorna uma String utilizando o m�todo toString(), sobrepondo a opera��o
	// padr�o do Object
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
		// O String.format est� sendo utilizado para mudar a quantidade de casas
		// decimais do double
	}

}
