import java.util.Scanner;

public class Main {

	public static void main(String[]arg) {
		
		// Estrutura for: for (in�cio; condi��o; incremento) {}
		//In�cio: Ser� lido somente na primeira vez.
		//Condi��o: Enquanto V ele volta e l� de novo, quando for F ele pula a execu��o do programa.
		//Incremento: Executa toda vez depois de voltar
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos n�meros voc� quer somar?");
		int n = sc.nextInt();
		int soma = 0;
		
		System.out.printf("Digite %d n�meros: %n", n);
		for (int i = 1; i <= n; i++ ) {
			int x = sc.nextInt();
			soma += x;
			
		}
		
		System.out.println("Os valores somados deram: " + soma);
		
		sc.close();
	}
	
}
