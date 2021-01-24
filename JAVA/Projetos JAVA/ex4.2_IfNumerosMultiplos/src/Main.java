import java.util.Scanner;

public class Main {

		public static void main(String[]arg) {
			
			Scanner sc = new Scanner(System.in);
			int n1;
			int n2;
			int multiplo;
			
			System.out.println("Digite um número inteiro:");
			n1 = sc.nextInt();
			
			System.out.println("Digite outro número inteiro:");
			n2 = sc.nextInt();
			
			if (n1 == 0 || n2 ==0) {
				System.out.println("Digite um valor diferente de 0");
			} else if (n1 == n2) {
				System.out.println("Os valores são iguais, informe valores diferentes");
			} else if (n1 % n2 == 0 || n2 % n1 == 0) {
				System.out.println("Os números informados são múltiplos um do outro");
			}
			else {
				System.out.println("Os números informados não são múltiplos um do outro");
			}
			
			sc.close();
		}
}
