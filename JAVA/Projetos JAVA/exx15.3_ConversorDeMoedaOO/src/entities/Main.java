package entities;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter x;
		
		x = new CurrencyConverter();
		
		System.out.print("COTAÇÃO DO DOLAR TURÍSTICO:");
		x.valorDolar = sc.nextDouble();
		System.out.print("VALOR PAGO EM DÓLARES: U$");
		x.quantReal = sc.nextDouble();
		System.out.print("IMPOSTO IOF SOBRE A COMPRA:");
		x.iof = sc.nextDouble(); 
		
		System.out.printf("O preço do dólar é de: U$ %.2f %nO valor pago em dólares é de: U$ %.2f %nO IOF a ser pago é de: %.2f", x.valorDolar, x.quantReal, x.iof);
		
		double real = x.conversor();
		double iof = x.imposto();
				
		System.out.printf("%nO valor, sem impostos, em reais é de: R$ %.2f %nO valor a receber em reais é de: R$ %.2f", real, iof);
		
		sc.close();
		
	}
	
}
