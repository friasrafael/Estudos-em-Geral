package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos produtos v�o ser lidos? ");
		int n = sc.nextInt();
		
		/*Cria um vetor atrav�s de uma classe, o tamanho do vetor est� sendo determinado pela vari�vel N*/
		Product[] vect = new Product[n];
		
		/*vect.length � utilizado para identificar o tamanho do vetor. Assim, ao inv�s de ficar
		 dependende da vari�vel N para saber seu tamanho,
		 o pr�prio vetor fica respons�vel por essa fun��o evitando erros.*/
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
		/* vect[i].getPrice() acessa o valor espec�fico de price que est� dentro do vetor*/
		}
		
		double media = soma / vect.length;
		
		System.out.printf("Average Price: %.2f%n", media);
		
		sc.close();
	}

}
