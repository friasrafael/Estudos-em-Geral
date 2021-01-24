import java.util.Scanner;

public class Main {
	
	public static void main(String[]arg) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0; 
		int diesel = 0;
		double precoAlcool = 3.12;
		double precoDiesel = 2.53;
		double precoGasolina = 4.25;
		
		System.out.println("O cliente abasteceu com qual combust�vel?");
		int combustivel = sc.nextInt();
		
		while (combustivel != 4) {
			
			switch (combustivel) {
			case 0:
				diesel += 1;
				break;
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			default:
				System.out.println("C�digo inv�lido! Porf favor, informe um c�digo existente");
				break;
			}
			
			combustivel = sc.nextInt();
			}
			
			if (combustivel == 4) {
				System.out.println("Muito Obrigado!");
				System.out.println("Tabela de vendas por tipo de combust�vel:");
				System.out.println("�lcool: " + alcool);
				System.out.println("Diesel: " + diesel);
				System.out.println("Gasolina: " + gasolina);
				
				double lucroAlcool = alcool * precoAlcool;
				double lucroDiesel = diesel * precoDiesel;
				double lucroGasolina = gasolina * precoGasolina;
				double lucroTotal = lucroAlcool + lucroDiesel + lucroGasolina;
				
				System.out.printf("%nLucro Bruto das vendas:%nLucro do �lcool: R$ %.2f %nLucro do Diesel: R$ %.2f %nLucro da Gasolina: R$ %.2f %nLucro Total: R$ %.2f %n", lucroAlcool, lucroDiesel, lucroGasolina, lucroTotal);
		}

			
		sc.close();
	}
	
}
