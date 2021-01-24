import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		
		int gasolina = 0;
		int diesel = 0;
		int alcool = 0;
		int litrosD = 0;
		int litrosA = 0;
		int litrosG = 0;
		double precoAlcool = 3.12;
		double precoDiesel = 2.53;
		double precoGasolina = 4.25;
		double lucroAlcool = 0;
		double lucroDiesel = 0;
		double lucroGasolina = 0;
		double lucroTotal = 0;

		System.out.println("Tipo de combust�vel:");
		int combustivel = sc.nextInt();

		while (combustivel != 4) {
			if (combustivel == 0) {
				diesel += 1;
				System.out.println("Litros Abastecidos:");
				litrosD = sc.nextInt();
				lucroDiesel += litrosD * precoDiesel;
			} else if (combustivel == 1) {
				alcool += 1;
				System.out.println("Litros Abastecidos:");
				litrosA = sc.nextInt();
				lucroAlcool += litrosA * precoAlcool;
			} else if (combustivel == 2) {
				gasolina += 1;
				System.out.println("Litros Abastecidos:");
				litrosG = sc.nextInt();
				lucroGasolina = litrosG * precoGasolina;
			}
			
			System.out.println("Tipo de combust�vel:");
			combustivel = sc.nextInt();
			
		}
		
		if (combustivel == 4) {
			System.out.println("Muito Obrigado!");
			System.out.println("Tabela de vendas por tipo de combust�vel:");
			System.out.println("�lcool: " + alcool);
			System.out.println("Diesel: " + diesel);
			System.out.println("Gasolina: " + gasolina);

			lucroTotal = lucroAlcool + lucroDiesel + lucroGasolina;

			System.out.printf(
					"%nLucro Bruto das vendas:%nLucro do �lcool: R$ %.2f %nLucro do Diesel: R$ %.2f %nLucro da Gasolina: R$ %.2f %nLucro Total: R$ %.2f %n",
					lucroAlcool, lucroDiesel, lucroGasolina, lucroTotal);
		}

		sc.close();
	}

}
