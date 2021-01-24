import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número inteiro entre 1 e 1000: ");
		int x = sc.nextInt();
	
		if (x > 0 && x <= 1000) {
			System.out.printf("%nOs números impares entre 1 e %d são: %n", x);
			for (int i = 0; i <= x; i++) {
				if (i % 2 == 1) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Valor inválido!");
		}

		sc.close();
	}

}
