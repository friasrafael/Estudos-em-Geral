import java.util.Scanner;

public class Main {

		public static void main(String[]arg) {
			
			Scanner sc = new Scanner(System.in);
			
			int minutos;
			double valorConta = 50;
			
			System.out.println("Digite a quantidade de minutos totais utilizados no m�s");
			minutos = sc.nextInt();
			
			if (minutos <= 100) {
				System.out.printf("Voc� utilizou %d minutos. O valor da conta � de %.2f", minutos, valorConta);
			} else {
				valorConta += (minutos - 100)*2; //Atribui��o cumulativa, valorConta recebeu o valor de valorConta + o resultado de (minutos - 100)*2
				System.out.printf("Voc� utilizou %d minutos. O valor da conta � de %.2f", minutos, valorConta);
			}
		}
}
