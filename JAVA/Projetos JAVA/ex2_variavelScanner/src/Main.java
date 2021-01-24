import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Aciona o teclado como mecanismo de entrada de dados
		
		String x; //Cria uma vari�vel 
		x = sc.next(); //Armazena o valor digitado na aba Console como o valor de X
		System.out.println("Voc� digitou a String: "+ x); //Imprime o resultado na aba console ap�s o enter ser pressionado
		
		int y; //Cria uma vari�vel de n�mero inteiro
		y = sc.nextInt(); //Armazena o inteiro digitado na vari�vel Y
		System.out.println("Voc� digitou o n�mero inteiro: " + y); //Imprime o valor digitado
		
		double z; //Cria uma vari�vel de ponto flutuante
		z = sc.nextDouble(); //Armazena o valor digitado na vari�vel
		System.out.println("Voc� digitou o n�mero flutuante: " + z); //Imprime o resultado
		
		//Para digitar todos os resultados das vari�veis na mesma linha fa�a como o exemplo a seguir:
		
		String xx;
		int yy;
		double zz;
		xx = sc.next();
		yy = sc.nextInt();
		zz = sc.nextDouble();
		System.out.println("Voc� digitou: ");
		System.out.println(xx);
		System.out.println(yy);
		System.out.println(zz);
		
		sc.close(); //Encerra a utiliza��o da vari�vel do tipo Scanner no programa
	}
}
