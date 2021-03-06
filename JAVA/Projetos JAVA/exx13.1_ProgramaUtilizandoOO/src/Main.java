import java.util.Locale;
import java.util.Scanner;
import entities.Triangle; //Importei o pacote com a classe Triangle

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y; //Solicitei dois objetos da classe Triangle
		x = new Triangle(); //Criei um Triangle de nome x
		y = new Triangle(); //Criei um Triangle de nome y
		//Triangle tem 3 vari�veis internas, cada um � uma PUBLIC DOUBLE (a, b e c)
		System.out.println("Digite a medida dos lados do tri�ngulo X: ");
		x.a = sc.nextDouble(); //Pe�o para digitar o valor de public double a, b e c do Triangle x
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("digite a medida dos lados do tri�ngulo Y: ");
		y.a = sc.nextDouble(); //Pe�o para digitar o valor de public double a, b e c do Triangle y
		y.b= sc.nextDouble();
		y.c = sc.nextDouble();

		double pX = (x.a + x.b + x.c) / 2;
		double pY = (y.a + y.b + y.c) / 2;
		double areaX = Math.sqrt(pX * (pX - x.a) * (pX - x.b) * (pX - x.c));
		double areaY = Math.sqrt(pY * (pY - y.a) * (pY - y.b) * (pY - y.c));
		System.out.printf("%nA �rea do tri�ngulo X � de: %.2f %nA �rea do tri�ngulo Y � de: %.2f %n", areaX, areaY);

		if (areaX > areaY) {
			System.out.println("A �rea do tri�ngulo X � maior");
		} else if (areaY > areaX) {
			System.out.println("A �rea do tri�ngulo Y � maior");
		} else {
			System.out.println("As �reas dos dois tri�ngulos s�o iguais");
		}

	}
}