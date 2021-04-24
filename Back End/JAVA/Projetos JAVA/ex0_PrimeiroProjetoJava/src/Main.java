import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x1, x2, x3, y1, y2, y3;
		
		System.out.println("Digite a medida dos lados do triângulo X: ");
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		x3 = sc.nextDouble();
		System.out.println("digite a medida dos lados do triângulo Y: ");
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();
		y3 = sc.nextDouble();
		
		double pX = (x1 + x2 + x3) / 2;
		double pY = (y1 + y2 + y3) / 2;
		double areaX = Math.sqrt(pX * (pX - x1) * (pX - x2) * (pX - x3));
		double areaY = Math.sqrt(pY * (pY - y1) * (pY - y2) * (pY - x3));
		System.out.printf("%nA área do triângulo X é de: %.2f %nA área do triângulo Y é de: %.2f", areaX, areaY);
		
		if (areaX > areaY) {
			System.out.println("A área do triângulo X é maior");
		} else if (areaY > areaX){
			System.out.println("A área do triângulo Y é maior");
		} else {
			System.out.println("As áreas dos dois triângulos são iguais");
		}
		
		
		sc.close();
	}
}