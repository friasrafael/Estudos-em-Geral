import java.util.Scanner;

public class Main {

	public static void main(String[]arg) {

		Scanner sc = new Scanner(System.in);
		
		String nomeFuncionario;
		int horasTrabalhadas;
		double valorHora;
		double salario;

		System.out.println("Infome o nome do funcion�rio:");
		nomeFuncionario = sc.nextLine();

		System.out.println("Informe a quantidade de horas trabalhadas no m�s:");
		horasTrabalhadas = sc.nextInt();

		System.out.println("nforme o valor da hora em reais:");
		valorHora = sc.nextDouble();

		salario = horasTrabalhadas * valorHora;

		System.out.printf("%nO funcion�rio %s deve receber %.2f de sal�rio mensal", nomeFuncionario, salario);

		sc.close();
	}
}
