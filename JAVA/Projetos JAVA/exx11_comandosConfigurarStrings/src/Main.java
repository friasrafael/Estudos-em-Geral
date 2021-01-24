import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Qual ser� a String Original?   ");
		String original = sc.nextLine(); //Aconselhado testar com a String original = " Rafael "
		
		String minuscula = original.toLowerCase();		
		String maiuscula = original.toUpperCase();		
		String semEspacos= original.trim();		
		String subString = original.substring(2);		
		String corte = original.substring(2, 5);		
		String trocaCaracter = original.replace("Rafael", "Renato");
		int i = original.indexOf("Ra");
		int ultima = original.lastIndexOf("el");
		
		System.out.println("A String Original foi definidada como: -" + original + "-");
		System.out.println("String Original em min�sculo: -" + minuscula + "-");
		System.out.println("String Original em mai�sculo: -" + maiuscula + "-");
		System.out.println("String Original em trim: -" + semEspacos + "-");
		System.out.println("String Original cortada com par�metro de in�cio: -" + subString + "-");
		System.out.println("String Original cortada com par�metro de in�cio e fim: -" + corte + "-");
		System.out.println("Substuindo palavras da String Original : -" + trocaCaracter +"-");
		System.out.println("Posi��o de 'Ra' na String Original: -" + i + "-");
		System.out.println("Qual � a �ltima vez que 'el' aparece: -" + ultima + "-");
		
		
		
		
		sc.close();
	}
}
