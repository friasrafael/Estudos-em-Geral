import java.util.Scanner;

public class Main {

	public static void main(String[]arg) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Qual número você quer saber os divisores? ");
			
			int N = sc.nextInt();
			
			for (int x = 1; x <= N; x++) {
				if (N % x == 0) {
					System.out.println(x);
				}
			}
						
			sc.close();	
		}
}
