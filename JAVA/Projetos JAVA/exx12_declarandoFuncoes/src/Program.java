
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe 3 valores inteiros: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		//Cria variável HIGHER, com uma função dentro e três parâmetros
		int higher = max(a, b, c);

		showResult(higher);

		sc.close();
	}
// public = fica disponível em outras classe
// static = função pode ser chamada independentemente de se criar um objeto
// int = tipo de dado que a função retorna, nesse caso, um número inteiro
// A função se chama MAX e cria três valores de números inteiros dentro dos parâmetros
	public static int max(int x, int y, int z) { 
		int aux; //Variável local, existe apenas dentro da função max

		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux; //Retorna o resultado da variável AUX
	}
// void = retorna "vazio"
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
