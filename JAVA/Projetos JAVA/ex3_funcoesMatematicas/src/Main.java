
public class Main {
	
	public static void main(String[]arg) {
		
		double x = 9.0; //Criei 6 vari�veis de ponto flutuante, 3 com valores e 3 vazias
		double y = 5.6;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x); //double A recebe o valor da raiz quadrada de double x 
		B = Math.pow(x, y); //double B recebe o valor de double x elevado a double y
		C = Math.abs(z); //double C recebe o valor absoluto de double Z
		
		System.out.println("A raiz quadrada de "+ x +" � " + A); //imprime os resultados na aba console
		System.out.println(x + " elevado a " + y + " � igual a " + B);
		System.out.printf("%.2f elevado a %.2f � igual a %.2f %n", x, y, B);
		System.out.printf("O valor de Y � %.2f %n", y);
		System.out.printf("O valor absoluto de %.2f � %.2f", z, C);
		
		//Procurando na web por java.lang.Math � poss�vel encontrar a lista de todas as express�es matem�ticas em Java
		
	}
}
