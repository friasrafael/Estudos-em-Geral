import java.util.Scanner;

public class Main {

	public static void main(String[]arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro:");
		int x = sc.nextInt();
		int soma = 0;
		

		while (x != 0) {
			System.out.println("Digite outro n�mero inteiro:");
			soma += x;
			x = sc.nextInt();
		}
		System.out.println("O valor de soma �: "+ soma);
		
		sc.close();
		
		int xx = 0;
		int yy = 4;
	
		while (xx < 3) {
			xx += 1;
			yy += 2;
			System.out.println(xx + "-" + yy);
		}
	}
	
}
