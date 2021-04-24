/*Wrappers Classes s�o calsses equivalente aos tipos primitivos.
 Cada tipo primitivo tem um tipo de classe equivalente.
 Ex.: Tipo Primitivo: boolean Wrapper Class: Boolean
 Na maioria dos casos � s� colocar a primeira letra mai�scula para obter a classe equivalente.
 O INT (Integer) e o CHAR (Character) s�o exce��o */
package application;

import java.util.Scanner;

public class Main {
			
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			/*Integer � a classe equivalente dos objetos do tipo int.*/
			int x = sc.nextInt();
			Integer obj = x;
			
			/*N�o � preciso utilizar o Casting, pois o programa j� 
			 entende que est� sendo refenciada uma vari�vel do tipo int.*/
			int y = obj * 2;
									
			System.out.println(y);
			sc.close();	
			
			}
		}

		
