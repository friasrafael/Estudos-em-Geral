import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos testes voc� quer fazer?");
		int N = sc.nextInt();
		double v1 = 0;
		double v2 = 0;
		double v3 = 0;
		double media = 0;

		for (int x = 0; x <= N; x++) {

			System.out.println("Digite 3 valores decimais: ");
			v1 = sc.nextDouble();
			v2 = sc.nextDouble();
			v3 = sc.nextDouble();

			media = ((v1 * 2) + (v2 * 3) + (v3 * 5)) / 10;
			System.out.printf("%.1f %n", media);

		}

		sc.close();
	}
}
