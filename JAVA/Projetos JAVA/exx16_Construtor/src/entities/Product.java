package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	/*Criei um CONSTRUTOR que obrigará o usuário a inserir um valor para os parãmetros
	Isso fará com que seja impossível colocar um nome de produto sem um preço ou quantidade*/
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

	// Retorna uma String utilizando o método toString(), sobrepondo a operação
	// padrão do Object
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
		// O String.format está sendo utilizado para mudar a quantidade de casas
		// decimais do double
	}

}
