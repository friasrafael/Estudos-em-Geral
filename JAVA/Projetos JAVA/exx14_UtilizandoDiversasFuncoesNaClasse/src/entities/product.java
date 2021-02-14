package entities;

public class product {
	
			public String name;
			public double pryce;
			public int quantity;
			
			public double Valor() {
				return quantity * pryce;
			}
				
}
