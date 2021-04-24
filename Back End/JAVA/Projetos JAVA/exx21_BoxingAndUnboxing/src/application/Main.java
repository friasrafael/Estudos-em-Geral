/*Boxing = Conversão de um objeto tipo valor (primitivo), para um objeto referencial (classe) compatível.
 Unboxing = Conversão de um referencial para um objeto do tipo valor compatível.  */

package application;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	/*Para fazer o Boxing basta atribuir o valor da variável primitiva para a variável classe.*/
	int x = sc.nextInt();
	Object obj = x;
	
	/*Para fazer o Unboxing é necessário colocar um Casting, nesse caso, (int) para não dar erro.
	 Ele indica o tipo de variável que o objeto pertence.*/
	int y = (int) obj;
							
	System.out.println(y);
	sc.close();	
	}
}
