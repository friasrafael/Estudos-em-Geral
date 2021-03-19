package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos produtos vão ser lidos? ");
		int n = sc.nextInt();
		
		/*Cria um vetor através de uma classe, o tamanho do vetor está sendo determinado pela variável N*/
		Product[] vect = new Product[n];
		
		/*vect.length é utilizado para identificar o tamanho do vetor. Assim, ao invés de ficar
		 dependende da variável N para saber seu tamanho,
		 o próprio vetor fica responsável por essa função evitando erros.*/
		for (int i=0 ; i<vect.length ; i++) {
			sc.nextLine();
			System.out.print("Product name: ");
			String name = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double soma = 0;
		for (int i=0 ; i<vect.length ; i++) {
			soma += vect[i].getPrice(); 
		/* vect[i].getPrice() acessa o valor específico de price que está dentro do vetor*/
		}
		
		double media = soma / vect.length;
		
		System.out.printf("Average Price: %.2f%n", media);
		
		sc.close();
	}

}
