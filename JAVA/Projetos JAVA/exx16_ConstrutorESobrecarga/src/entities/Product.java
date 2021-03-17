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

	/*Criei uma SOBRECARGA. Função com o mesmo nome que recebe atributos diferentes
	 Nesse caso, inicio a variável QUANTITY com o valor 0*/
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	/*Não é necessário incluir QUANTITY na função, pq o JAVA inicia todas
	 as variáveis sem valor atribuido com valor zero*/
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
