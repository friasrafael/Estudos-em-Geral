import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[]arg) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, valor, area, preco;
		
		System.out.println("Informe a largura do terreno em metros:");
		largura = sc.nextDouble();
		
		System.out.println("Informe o comprimento do terreno em metros:");
		comprimento = sc.nextDouble();
		
		System.out.println("Informe o valor do m� do terreno em reais:");
		valor = sc.nextDouble();
		
		System.out.printf("%nDados do terreno: %nLargura: %.1f m %nComprimento: %.1f m %nValor: R$%.2f/m� %n%n", largura, comprimento, valor);
		
		area = largura*comprimento;
		preco = area*valor;
		
		System.out.printf("A �rea do terreno � de %.2f m� %nO pre�o total do terreno � de %.2f", area, preco);
		
		sc.close();
	}
}
