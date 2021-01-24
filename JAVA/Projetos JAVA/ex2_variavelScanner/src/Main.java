import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Aciona o teclado como mecanismo de entrada de dados
		
		String x; //Cria uma variável 
		x = sc.next(); //Armazena o valor digitado na aba Console como o valor de X
		System.out.println("Você digitou a String: "+ x); //Imprime o resultado na aba console após o enter ser pressionado
		
		int y; //Cria uma variável de número inteiro
		y = sc.nextInt(); //Armazena o inteiro digitado na variável Y
		System.out.println("Você digitou o número inteiro: " + y); //Imprime o valor digitado
		
		double z; //Cria uma variável de ponto flutuante
		z = sc.nextDouble(); //Armazena o valor digitado na variável
		System.out.println("Você digitou o número flutuante: " + z); //Imprime o resultado
		
		//Para digitar todos os resultados das variáveis na mesma linha faça como o exemplo a seguir:
		
		String xx;
		int yy;
		double zz;
		xx = sc.next();
		yy = sc.nextInt();
		zz = sc.nextDouble();
		System.out.println("Você digitou: ");
		System.out.println(xx);
		System.out.println(yy);
		System.out.println(zz);
		
		sc.close(); //Encerra a utilização da variável do tipo Scanner no programa
	}
}
