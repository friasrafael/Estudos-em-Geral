import java.util.Scanner;

public class Main {
	
		public static void main(String[]arg) {
			
			Scanner sc = new Scanner(System.in);
			
			int numero;
			int resto;
			
			System.out.println("Informe um n�mero inteiro");
			numero = sc.nextInt();
			
			resto = numero % 2;
			System.out.println(resto);
			
			if (resto == 0) {
				System.out.printf("O n�mero %d � par", numero);
			} else {
				System.out.printf("O n�mero %d � impar", numero);
			}
			
			sc.close();
		}
		
}
