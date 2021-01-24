import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas divis�es voc� quer fazer?");
		int N = sc.nextInt();

		for (int x = 1; x <= N; x++) {
			System.out.printf("Digite o numerador e o denominador da %d� divis�o: %n", x);
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();

			if (n2 == 0) {
				System.out.println("Denominador inv�lido");
			} else {
				int div = n1 / n2;
				System.out.println(n1 + "/" + n2 + " = " + div);
			}

		}
		sc.close();
	}
}
