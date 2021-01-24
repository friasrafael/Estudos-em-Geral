import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {

		/*Nesse exemplo o usu�rio digita o valor da sua compra e o
		 programa informa se h� desconto ou n�o no valor total*/
		
		Scanner sc = new Scanner(System.in);
		double preco = sc.nextInt(); //Usu�rio digitar� o valor gasto
		
		/* Caso o indiv�duo gaste 100 reais ou mais ter� 20% de desconto
		 caso contr�rio pagar� o valor integral, n�o ter� desconto algum */
		double desconto = (preco >= 100) ? preco * 0.8 : preco; 
		/* Caso a express�o entre parenteses seja verdadeira,
		 o primeiro comando ser� executado (preco * 0.8), caso seja falsa,
		 o programa ir� executar o segundo comando (preco) */
		
		System.out.println(desconto); //Mostra o valor da vari�vel desconto

		sc.close();
	}
}
