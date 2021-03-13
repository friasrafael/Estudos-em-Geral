package entities;

public class Employee {
	
	public String nome;
	public double bruto;
	public double imposto;
	
	public double NetSalary() {
		return bruto - imposto;
	}
	
	public double IncreaseSalary(double porcento) {
		return (bruto / 100) * (100 + porcento);
	}
}
