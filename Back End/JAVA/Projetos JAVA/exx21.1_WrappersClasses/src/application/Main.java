/*Wrappers Classes são calsses equivalente aos tipos primitivos.
 Cada tipo primitivo tem um tipo de classe equivalente.
 Ex.: Tipo Primitivo: boolean Wrapper Class: Boolean
 Na maioria dos casos é só colocar a primeira letra maiúscula para obter a classe equivalente.
 O INT (Integer) e o CHAR (Character) são exceção */
package application;

import java.util.Scanner;

public class Main {
			
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			/*Integer é a classe equivalente dos objetos do tipo int.*/
			int x = sc.nextInt();
			Integer obj = x;
			
			/*Não é preciso utilizar o Casting, pois o programa já 
			 entende que está sendo refenciada uma variável do tipo int.*/
			int y = obj * 2;
									
			System.out.println(y);
			sc.close();	
			
			}
		}

		
