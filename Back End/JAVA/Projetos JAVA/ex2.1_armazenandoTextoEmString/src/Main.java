import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Chama o teclado como variável de entrada
		//Permite digitar dados na aba console após a execução do programa		
		String s1, s2, s3; //Cria 3 variáveis do tipo String
		
		s1 = sc.nextLine(); //sc.nextLine(); indica que um texto será digitado e armazenado como uma variável
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Você digitou: " + s1 + " " + s2 + " " + s3); //Imprime o resultado na tela concatenando as 3 variáveis com textos
		
		sc.close(); //Encerra a utilização do teclado como dispositivo de entrada na aba Console
	}
}
