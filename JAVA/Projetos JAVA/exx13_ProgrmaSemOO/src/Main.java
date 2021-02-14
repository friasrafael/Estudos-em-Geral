import java.util.Scanner;

public class Main {

	public static void(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x1, x2, x3, y1, y2, y3;
		System.out.println("Informe a medida dos 3 lados do triângulo X: ");
		System.out.println("Lado 1: "); x1 = sc.nextDouble();
		System.out.println("Lado 2: "); x2 = sc.nextDouble();
		System.out.println("Lado 3: "); x3 = sc.nextDouble();
		System.out.println("Informe a medida dos 3 lados do triângulo Y: ");
		System.out.println("Lado 1: "); y1 = sc.nextDouble();
		System.out.println("Lado 2: "); y2 = sc.nextDouble();
		System.out.println("Lado 3: "); y3 = sc.nextDouble();
		
		double pX = (x1 + x2 + x3) / 2;
		double areaX = Math.sqrt(pX * (pX - x1) * (pX - x2) * (pX - x3));
		
		double pY = (y1 + y2 + y3) / 2;
		double areaY = Math.sqrt(pY * (pY - y1) * (pY - y2) * (pY - y3));
		
		System.out.printf("%nA área do triângulo X é: %.2f %nA área do triângulo Y é: %.2f", areaX, areaY);
		
		sc.close();	
	}
	
}
