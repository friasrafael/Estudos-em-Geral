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
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.println("Enter the number of the product to be added in stock: ");
		quantity = sc.nextInt();
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
