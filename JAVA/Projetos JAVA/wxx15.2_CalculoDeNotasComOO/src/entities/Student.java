package entities;

public class Student {

	public String nome;
	public double n1; //3 notas do aluno
	public double n2;
	public double n3;
	
		public double FinalGrade() {
			double finalGrade = n1 + n2 + n3;
			return finalGrade;		
		}
		
		public void Condition(double condition) {
			
		if (condition > 100) {
			System.out.printf("FINAL GRADE = %.2f %nPASS", FinalGrade());			
		} else {
			double points = 100 - FinalGrade();
			System.out.printf("FINAL GRADE = %.2f %nFAILED %nMISSING %.2f POINTS", FinalGrade(), points);
		}
		
		}
			

}
