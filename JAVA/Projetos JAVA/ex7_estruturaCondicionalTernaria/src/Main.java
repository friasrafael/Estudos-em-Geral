import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {

		/*Nesse exemplo o usuário digita o valor da sua compra e o
		 programa informa se há desconto ou não no valor total*/
		
		Scanner sc = new Scanner(System.in);
		double preco = sc.nextInt(); //Usuário digitará o valor gasto
		
		/* Caso o indivíduo gaste 100 reais ou mais terá 20% de desconto
		 caso contrário pagará o valor integral, não terá desconto algum */
		double desconto = (preco >= 100) ? preco * 0.8 : preco; 
		/* Caso a expressão entre parenteses seja verdadeira,
		 o primeiro comando será executado (preco * 0.8), caso seja falsa,
		 o programa irá executar o segundo comando (preco) */
		
		System.out.println(desconto); //Mostra o valor da variável desconto

		sc.close();
	}
}
