package entities;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: R$");
		double price = sc.nextDouble();
		
		/*Como criei uma SOBRECARGA e não declarei QUANTITY nos seus parâmetros, 
		 o valor de QUANTITY iniciará em 0*/
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.println("Enter the number of the product to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated Data: " + product);
		System.out.println("Enter the number of procut to be removed in stock : ");
		
		quantity = sc.nextInt();
		product.removeProducts(quantity); 
		System.out.println();
		System.out.println("Updated Data: " + product);
		
		
		sc.close();
	}
	
}
