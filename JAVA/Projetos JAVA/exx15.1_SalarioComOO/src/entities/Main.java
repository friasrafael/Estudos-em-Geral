package entities;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	Employee x;
	x = new Employee();
	System.out.println("Digite o nome do funcionário: ");
	x.nome = sc.nextLine();
	System.out.println("Digite o salário do funcionário: ");
	x.bruto = sc.nextDouble();
	System.out.println("Digite os impostos pagos: ");
	x.imposto = sc.nextDouble();
	x.NetSalary();
	
	System.out.println("Employee: " + x.nome + ", " + x.NetSalary());

	System.out.println("Which percentage to increase salary?");
	double porcento = sc.nextDouble();
	x.IncreaseSalary(porcento);
	
	System.out.println("Updated Data: " + x.nome + ", " + x.IncreaseSalary(porcento));
	
	sc.close();
	}
}
