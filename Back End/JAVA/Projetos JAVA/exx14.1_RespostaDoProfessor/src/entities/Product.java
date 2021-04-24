package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;	
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	//Retorna uma String utilizando o m�todo toString(), sobrepondo a opera��o padr�o do Object
	public String toString() {
		return name + ", $ " + String.format("%.2f" , price) + ", " + quantity + " units, Total: $ " + String.format("%.2f" , totalValueInStock());
	//O String.format est� sendo utilizado para mudar a quantidade de casas decimais do double
	}
	
}
