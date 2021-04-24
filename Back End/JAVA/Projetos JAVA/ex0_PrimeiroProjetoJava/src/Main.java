import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x1, x2, x3, y1, y2, y3;
		
		System.out.println("Digite a medida dos lados do tri�ngulo X: ");
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		x3 = sc.nextDouble();
		System.out.println("digite a medida dos lados do tri�ngulo Y: ");
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();
		y3 = sc.nextDouble();
		
		double pX = (x1 + x2 + x3) / 2;
		double pY = (y1 + y2 + y3) / 2;
		double areaX = Math.sqrt(pX * (pX - x1) * (pX - x2) * (pX - x3));
		double areaY = Math.sqrt(pY * (pY - y1) * (pY - y2) * (pY - x3));
		System.out.printf("%nA �rea do tri�ngulo X � de: %.2f %nA �rea do tri�ngulo Y � de: %.2f", areaX, areaY);
		
		if (areaX > areaY) {
			System.out.println("A �rea do tri�ngulo X � maior");
		} else if (areaY > areaX){
			System.out.println("A �rea do tri�ngulo Y � maior");
		} else {
			System.out.println("As �reas dos dois tri�ngulos s�o iguais");
		}
		
		
		sc.close();
	}
}