import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);

		int gasolina = 0;
		int diesel = 0;
		int alcool = 0;
		double litrosD = 0;
		double litrosA = 0;
		double litrosG = 0;
		double litrosDiesel = 0;
		double litrosAlcool = 0;
		double litrosGasolina = 0;
		double precoAlcool = 3.30;
		double precoDiesel = 3.00;
		double precoGasolina = 4.20;
		double lucroAlcool = 0;
		double lucroDiesel = 0;
		double lucroGasolina = 0;
		double lucroTotal;
		int vendasTotal;
		double lucroMedio;
		double lucroLiquido;
		double estimativaMes;
		int dataDia;
		int dataMes;
		int dataAno;
		double margemLiquida = 0.15;

		System.out.println("Tipo de combust�vel:");
		int combustivel = sc.nextInt();

		while (combustivel != 4) {
			if (combustivel == 0) {
				diesel += 1;
				System.out.println("Litros Abastecidos:");
				litrosD = sc.nextDouble();
				litrosDiesel += litrosD;

			} else if (combustivel == 1) {
				alcool += 1;
				System.out.println("Litros Abastecidos:");
				litrosA = sc.nextDouble();
				litrosAlcool += litrosA;

			} else if (combustivel == 2) {
				gasolina += 1;
				System.out.println("Litros Abastecidos:");
				litrosG = sc.nextDouble();
				litrosGasolina += litrosG;

			} else if (combustivel > 2 || combustivel < 0) {
				System.out.println("Verifique os valores e tente novamente");
			}

			System.out.println("Tipo de combust�vel:");
			combustivel = sc.nextInt();

		}

		lucroDiesel += litrosDiesel * precoDiesel;
		lucroAlcool += litrosAlcool * precoAlcool;
		lucroGasolina += litrosGasolina * precoGasolina;
		vendasTotal = alcool + gasolina + diesel;
		lucroTotal = lucroAlcool + lucroDiesel + lucroGasolina;
		lucroMedio = lucroTotal / vendasTotal;
		lucroLiquido = lucroTotal * margemLiquida;
		estimativaMes = lucroLiquido * 30;

		if (combustivel == 4) {

			System.out.println("Dia de Hoje: ");
			dataDia = sc.nextInt();
			System.out.println("M�s: ");
			dataMes = sc.nextInt();
			System.out.println("Ano: ");
			dataAno = sc.nextInt();

			System.out.println("Hist�rico de vendas do dia " + dataDia + "/" + dataMes + "/" + dataAno);
			System.out.printf("%n");
			System.out.println("Tabela de vendas por tipo de combust�vel:");
			System.out.println("�lcool: " + alcool + " Vendas, Litros: " + litrosAlcool + "L");
			System.out.println("Diesel: " + diesel + " Vendas, Litros: " + litrosDiesel + "L");
			System.out.println("Gasolina: " + gasolina + " Vendas, Litros: " + litrosGasolina + "L");
			System.out.println("Total de Vendas: " + vendasTotal + " Lucro M�dio por Venda: R$" + lucroMedio);

			System.out.printf(
					"%nLucro Bruto das vendas:%nLucro do �lcool: R$ %.2f %nLucro do Diesel: R$ %.2f %nLucro da Gasolina: R$ %.2f %nLucro Total: R$ %.2f %n",
					lucroAlcool, lucroDiesel, lucroGasolina, lucroTotal);
			System.out.printf("%nLucro L�quido do Dia: R$ %.2f %nEstimativa do Lucro L�quido Mensal: R$ %.2f",
					lucroLiquido, estimativaMes);
		}

		sc.close();
	}
}
