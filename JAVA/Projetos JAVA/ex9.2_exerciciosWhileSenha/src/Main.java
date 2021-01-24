import java.util.Scanner;

public class Main {

	public static void main(String[]arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a senha:");
		int senha = sc.nextInt();
		
		
		while (senha != 2002) {
			
			System.out.println("Senha Incorreta");
			senha = sc.nextInt();
		}
		
			System.out.println("Acesso Permitido");
			
		sc.close();
	}
	
}
