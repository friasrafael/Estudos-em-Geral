import java.util.Scanner;

public class Main {

		public static void main(String[]arg) {
			
			Scanner sc = new Scanner(System.in);
			int n1;
			int n2;
			int multiplo;
			
			System.out.println("Digite um n�mero inteiro:");
			n1 = sc.nextInt();
			
			System.out.println("Digite outro n�mero inteiro:");
			n2 = sc.nextInt();
			
			if (n1 == 0 || n2 ==0) {
				System.out.println("Digite um valor diferente de 0");
			} else if (n1 == n2) {
				System.out.println("Os valores s�o iguais, informe valores diferentes");
			} else if (n1 % n2 == 0 || n2 % n1 == 0) {
				System.out.println("Os n�meros informados s�o m�ltiplos um do outro");
			}
			else {
				System.out.println("Os n�meros informados n�o s�o m�ltiplos um do outro");
			}
			
			sc.close();
		}
}
