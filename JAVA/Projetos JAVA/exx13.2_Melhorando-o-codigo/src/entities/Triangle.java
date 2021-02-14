package entities; //Determinei que o nome do pacote ser� entities (entidade)

//Criei uma nova classe p�blica chamada Triangle para representar um tri�ngulo 
public class Triangle {
	//Criei tr�s vari�veis double com acesso p�blico representando os lados do tri�ngulo
		public double a;
		public double b;
		public double c;
	//Criei uma fun��o chamada �rea, que retorna um double e � p�blica
		public double area() {
			double p = (a + b + c) / 2; //Double p receber� parte do c�lculo
			return Math.sqrt(p* (p - a) * (p - b) * (p - c)); //Double area retornar� a �rea do tri�ngulo
		}
}
