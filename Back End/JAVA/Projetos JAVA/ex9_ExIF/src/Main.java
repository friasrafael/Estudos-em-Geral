import java.util.Scanner;

public class Main {
	
	public static void main(String[]arg) {
	
			Scanner sc = new Scanner(System.in);
			int n1;
			System.out.println("Informe um n�mero inteiro:");
			n1 = sc.nextInt();
			
			if (n1 >=0) {
				System.out.println("O n�mero � positivo");
			} else {
				System.out.println("O n�mero � negativo");
			}
			
			sc.close();
	}
}
