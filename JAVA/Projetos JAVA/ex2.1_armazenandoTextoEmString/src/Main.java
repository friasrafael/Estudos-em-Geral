import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Chama o teclado como vari�vel de entrada
		//Permite digitar dados na aba console ap�s a execu��o do programa		
		String s1, s2, s3; //Cria 3 vari�veis do tipo String
		
		s1 = sc.nextLine(); //sc.nextLine(); indica que um texto ser� digitado e armazenado como uma vari�vel
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Voc� digitou: " + s1 + " " + s2 + " " + s3); //Imprime o resultado na tela concatenando as 3 vari�veis com textos
		
		sc.close(); //Encerra a utiliza��o do teclado como dispositivo de entrada na aba Console
	}
}
