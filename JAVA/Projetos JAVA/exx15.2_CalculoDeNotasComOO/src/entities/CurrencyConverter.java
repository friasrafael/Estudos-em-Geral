package entities;

public class CurrencyConverter {
	
	double valorDolar;
	double quantReal;
	double iof;
	
	public double conversor() {
		return valorDolar*quantReal;
	}
	
	public double imposto() {
		return ((valorDolar*quantReal) / 100 * 6) + (valorDolar * quantReal);
	}
	
}
