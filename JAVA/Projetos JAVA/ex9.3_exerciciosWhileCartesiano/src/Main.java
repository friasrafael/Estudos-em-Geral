import java.util.Scanner;

public class Main {

		public static void main(String[]arg) {
			
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			while (x != 0 && y != 0) {
				
				if (x > 0 && y > 0) {
					System.out.println("Quadrante 1");
				} else if (x < 0 && y > 0) {
					System.out.println("Quadrante 2");
				} else if (x < 0 && y < 0) {
					System.out.println("Quadrante 3");
				} else if (x > 0 && y < 0) {
					System.out.println("Quadrante 4");
				}
				
				x = sc.nextInt();
				y = sc.nextInt();
			}
			
				System.out.println("Coordenadas Inválidas");
			
			sc.close();
		}
	
}
