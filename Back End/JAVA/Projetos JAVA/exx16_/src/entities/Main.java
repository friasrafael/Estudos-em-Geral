package entities;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Estoque Total: ");

		product e;
		e = new product();
		System.out.println("Deseja adicionar um produto ao estoque:");
		int stop = sc.nextInt();
		
		while (stop != 1 && stop != 0) {
			System.out.printf("%nDigite 1 para SIM e 0 para NÃO%n");
			System.out.printf("%nDeseja adicionar um produto ao estoque: %n");
			stop = sc.nextInt();
		}

		while (stop == 1) {

			
			System.out.printf("%nInforme o nome do produto, preço e quantidade no estoque: %n");
			e.name = sc.next();
			e.pryce = sc.nextDouble();
			e.quantity = sc.nextInt();

			double valor = e.Valor();

			System.out.printf("Produto: %s %nPreço: R$%.2f %nQuantidade: %d %nValor em Estoque: R$%.2f %n", e.name,
					e.pryce, e.quantity, valor);
			
			System.out.println("Deseja adicionar um produto ao estoque:");
			stop = sc.nextInt();
		}
		
		if (stop == 0) {
			System.out.println("Fim do Programa");
		}
		

		sc.close();
	}

}
