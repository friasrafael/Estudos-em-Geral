import java.util.Scanner;

public class Main {
	
		public static void main(String[]arg) {
			
			Scanner sc = new Scanner(System.in);
			
			int numero;
			int resto;
			
			System.out.println("Informe um número inteiro");
			numero = sc.nextInt();
			
			resto = numero % 2;
			System.out.println(resto);
			
			if (resto == 0) {
				System.out.printf("O número %d é par", numero);
			} else {
				System.out.printf("O número %d é impar", numero);
			}
			
			sc.close();
		}
		
}
