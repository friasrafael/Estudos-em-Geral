package entities; //Determinei que o nome do pacote será entities (entidade)

//Criei uma nova classe pública chamada Triangle para representar um triângulo 
public class Triangle {
	//Criei três variáveis double com acesso público representando os lados do triângulo
		public double a;
		public double b;
		public double c;
	//Criei uma função chamada área, que retorna um double e é pública
		public double area() {
			double p = (a + b + c) / 2; //Double p receberá parte do cálculo
			return Math.sqrt(p* (p - a) * (p - b) * (p - c)); //Double area retornará a área do triângulo
		}
}
