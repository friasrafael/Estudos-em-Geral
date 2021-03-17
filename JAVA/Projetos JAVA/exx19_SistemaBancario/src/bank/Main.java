package bank;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ClientData clientData;

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			clientData = new ClientData(name, accountNumber, initialDeposit);
		} else {
		
			clientData = new ClientData(name, accountNumber);
		}

		clientData.setName(name);
		
		System.out.println(clientData);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		clientData.addMoney(deposit);
		System.out.println("Updated account data:");
		System.out.println(clientData);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double withdraw = sc.nextDouble();
		clientData.subMoney(withdraw);
		System.out.println("Updated account data:");
		System.out.println(clientData);
		

		sc.close();
	}
}
