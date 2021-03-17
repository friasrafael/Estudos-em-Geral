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
		Product product = new Product(name, price);
		
		/*Alterei o valor de NAME utilizando o método SETTER*/
		product.setName("Computer");
		product.setPrice(1000);
		System.out.println("Updated Data: " + product.getName() + ", U$" + product.getPrice() + ", " + product.getQuantity());
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.printf("%nEnter the number of the product to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated Data: " + product);
		System.out.printf("%nEnter the number of product to be removed in stock : ");
		
		quantity = sc.nextInt();
		product.removeProducts(quantity); 
		System.out.println();
		System.out.println("Updated Data: " + product);
		
		
		sc.close();
	}
	
}
