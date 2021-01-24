import java.util.Scanner;

public class Main {
	
	public static void main(String[]arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um valor numérico: ");
		
		int n = sc.nextInt();
		int in = 0;
		int out = 0;
		
		System.out.printf("Digite %d valores numéricos: %n", n);
		for (int x = 0; n > x ; x++) {
			int inteiro = sc.nextInt();
			if (inteiro >=10 && inteiro <=20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.println(in + " in " + out + " out ");
		
		sc.close();
	}
		
}
