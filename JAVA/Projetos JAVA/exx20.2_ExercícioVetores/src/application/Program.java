/*INCOMPLETO! Não consegui mostrar a lista de hóspedes
 e nem restringir os quartos alugados a não serem alugados de novo.*/
package application;

import java.util.Scanner;
import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented: ");
		int n = sc.nextInt();
		Client[] vect = new Client[n];
		
		for (int i=0 ; i<vect.length ; i++) {
			
			System.out.println();
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[i] = new Client(name, email, room);
			
			if (vect[i] != null) {
				System.out.println();
				String n1 = vect[i].getName();
				String e = vect[i].getEmail();
				int r = vect[i].getRoom();
				
				System.out.println(n1 + ", " + e + ", " + r);
			}
		}		
		
		sc.close();
		
	}

}
