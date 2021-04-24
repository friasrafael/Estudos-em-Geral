import java.util.Scanner;

public class Main {

	public static void main(String[]arg) {

		Scanner sc = new Scanner(System.in);
		
		String nomeFuncionario;
		int horasTrabalhadas;
		double valorHora;
		double salario;

		System.out.println("Infome o nome do funcionário:");
		nomeFuncionario = sc.nextLine();

		System.out.println("Informe a quantidade de horas trabalhadas no mês:");
		horasTrabalhadas = sc.nextInt();

		System.out.println("nforme o valor da hora em reais:");
		valorHora = sc.nextDouble();

		salario = horasTrabalhadas * valorHora;

		System.out.printf("%nO funcionário %s deve receber %.2f de salário mensal", nomeFuncionario, salario);

		sc.close();
	}
}
