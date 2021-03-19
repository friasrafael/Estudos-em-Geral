/*Boxing = Convers�o de um objeto tipo valor (primitivo), para um objeto referencial (classe) compat�vel.
 Unboxing = Convers�o de um referencial para um objeto do tipo valor compat�vel.  */

package application;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	/*Para fazer o Boxing basta atribuir o valor da vari�vel primitiva para a vari�vel classe.*/
	int x = sc.nextInt();
	Object obj = x;
	
	/*Para fazer o Unboxing � necess�rio colocar um Casting, nesse caso, (int) para n�o dar erro.
	 Ele indica o tipo de vari�vel que o objeto pertence.*/
	int y = (int) obj;
							
	System.out.println(y);
	sc.close();	
	}
}
