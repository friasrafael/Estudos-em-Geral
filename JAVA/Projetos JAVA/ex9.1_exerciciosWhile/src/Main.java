import java.util.Scanner;

public class Main {
		
	public static void main(String[]arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros inteiros:");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != y) {
			if (x < y) {
				System.out.println("Crescente");
			} else {
				System.out.println("Decrescente");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}
}
