import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para elevar: ");
		int x = sc.nextInt();
		
		for (int y = 1; y <= x; y++) {

			int quadrado = y*y;
			int cubo = y*y*y;
			System.out.println(y + " " + quadrado + " " + cubo);
		}
			
		sc.close();
	}
}
