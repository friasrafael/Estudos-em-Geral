package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

		public static void main(String[]args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			Student s;
			s = new Student();
			
			System.out.print("Digite o nome do estudante: ");
			s.nome = sc.nextLine();
			System.out.printf("Digite as 3 notas do estudante. %nNOTA 1: ");
			s.n1 = sc.nextDouble();
			System.out.print("NOTA 2: ");
			s.n2 = sc.nextDouble();
			System.out.print("NOTA 3: ");
			s.n3 = sc.nextDouble();
			
			s.FinalGrade();
			
			double condition = s.FinalGrade();
			s.Condition(condition);
			
			sc.close();
		}
}
