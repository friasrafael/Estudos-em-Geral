import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um n�mero inteiro entre 1 e 1000: ");
		int x = sc.nextInt();
	
		if (x > 0 && x <= 1000) {
			System.out.printf("%nOs n�meros impares entre 1 e %d s�o: %n", x);
			for (int i = 0; i <= x; i++) {
				if (i % 2 == 1) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Valor inv�lido!");
		}

		sc.close();
	}

}
