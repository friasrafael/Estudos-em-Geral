package entities;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo x;
		x = new Retangulo();
		System.out.print("Digite a largura do retângulo: ");
		x.largura = sc.nextDouble();
		System.out.print("Digite a altura do retângulo: ");
		x.altura = sc.nextDouble();
		
		double area = x.area();
		double p = x.perimeter();
		System.out.printf("AREA = %.2f %nPERIMETER = %.2f", area, p);
		
		sc.close();
	}
}
