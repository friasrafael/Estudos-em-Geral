import java.util.Scanner;

public class Main {
	
	public static void main(String[]arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que horas s�o?");
		int hora = sc.nextInt();
		System.out.printf("Agora s�o %d horas%n", hora);
		
		if (hora >= 6 && hora <= 12) {
			System.out.println("Bom dia");
		} else if (hora > 12 && hora <= 18) {
			System.out.printf("Boa tarde");
		} else if (hora > 24) {
			System.out.println("Imposs�vel!");
		} else  if (hora > 18 || hora <=5 ) { // Poderia colocar apenas "else" e n�o adicionar uma condi��o, funcionaria do mesmo jeito.
			System.out.println("Boa noite");
		}
	}
}
