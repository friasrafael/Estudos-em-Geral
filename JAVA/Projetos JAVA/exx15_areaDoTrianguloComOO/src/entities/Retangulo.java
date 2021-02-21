package entities;

public class Retangulo {
	
	public double altura;
	public double largura;
	
	public double area() {
		return altura * largura;
		
	}
	
	public double perimeter() {
		return 4 * Math.sqrt(altura * largura);
	}
	
}
