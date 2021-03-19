package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*Criando VETORES e ARRAYS em um programa capaz de ler
		 uma quantidade X de medidas e tirar a média entre elas.*/
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		/*Criando um VETOR, de nome vect, do tipo double, que recebe
		 o valor de espaços referentes ao valor digitado em de int n*/
		double[] vect = new double[n];
		
		/*Laço FOR responsável por atribuir os valores do vetor nos determinados espaços internos.*/
		/*Enquanto int i for menor do que o valor de n (espaços de memória),
		 o programa pede pra adicionar um valor a uma posição do vetor.*/
		for (int i=0; i<n; i++) { 
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum/n;
		
		System.out.printf("MÉDIA DOS VALORES: %.4f%n", avg);
		
		sc.close();
	}
}
