import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantos fatoriais voc� quer calcular? ");
		int N = sc.nextInt();
		int n1 = 0;
		int sub = 1;

		for (int x = 1; x <= N; x++) {
			System.out.printf("Digite o valor a ser calculado:");
			n1 = sc.nextInt();

			if (n1 != 0) {
				for (int n2 = n1 - 1; n2 != 0; n2--) {
					sub *= (n1 - n2);
				}
			} else {
				System.out.println("1");

			}

			if (n1 != 0) {
				int fatorial = n1 * sub;
				System.out.println(fatorial);
			}

		}

		sc.close();
	}
}
