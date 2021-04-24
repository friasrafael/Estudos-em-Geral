package entities;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y; //Solicitei dois objetos da classe Triangle
		x = new Triangle(); //Criei um Triangle de nome x
		y = new Triangle(); //Criei um Triangle de nome y
		//Triangle tem 3 variáveis internas, cada um é uma PUBLIC DOUBLE (a, b e c)
		System.out.println("Digite a medida dos lados do triângulo X: ");
		x.a = sc.nextDouble(); //Peço para digitar o valor de public double a, b e c do Triangle x
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("digite a medida dos lados do triângulo Y: ");
		y.a = sc.nextDouble(); //Peço para digitar o valor de public double a, b e c do Triangle y
		y.b= sc.nextDouble();
		y.c = sc.nextDouble();


		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("%nA área do triângulo X é de: %.2f %nA área do triângulo Y é de: %.2f %n", areaX, areaY);

		if (areaX > areaY) {
			System.out.println("A área do triângulo X é maior");
		} else if (areaY > areaX) {
			System.out.println("A área do triângulo Y é maior");
		} else {
			System.out.println("As áreas dos dois triângulos são iguais");
		}
	}
}