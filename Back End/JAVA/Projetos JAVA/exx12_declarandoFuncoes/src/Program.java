
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe 3 valores inteiros: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		//Cria vari�vel HIGHER, com uma fun��o dentro e tr�s par�metros
		int higher = max(a, b, c);

		showResult(higher);

		sc.close();
	}
// public = fica dispon�vel em outras classe
// static = fun��o pode ser chamada independentemente de se criar um objeto
// int = tipo de dado que a fun��o retorna, nesse caso, um n�mero inteiro
// A fun��o se chama MAX e cria tr�s valores de n�meros inteiros dentro dos par�metros
	public static int max(int x, int y, int z) { 
		int aux; //Vari�vel local, existe apenas dentro da fun��o max

		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux; //Retorna o resultado da vari�vel AUX
	}
// void = retorna "vazio"
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
