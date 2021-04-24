package entities;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter x;
		
		x = new CurrencyConverter();
		
		System.out.print("COTA��O DO DOLAR TUR�STICO:");
		x.valorDolar = sc.nextDouble();
		System.out.print("VALOR PAGO EM D�LARES: U$");
		x.quantReal = sc.nextDouble();
		System.out.print("IMPOSTO IOF SOBRE A COMPRA:");
		x.iof = sc.nextDouble(); 
		
		System.out.printf("O pre�o do d�lar � de: U$ %.2f %nO valor pago em d�lares � de: U$ %.2f %nO IOF a ser pago � de: %.2f", x.valorDolar, x.quantReal, x.iof);
		
		double real = x.conversor();
		double iof = x.imposto();
				
		System.out.printf("%nO valor, sem impostos, em reais � de: R$ %.2f %nO valor a receber em reais � de: R$ %.2f", real, iof);
		
		sc.close();
		
	}
	
}
