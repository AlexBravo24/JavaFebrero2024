package estructuraciclos;

import java.util.Scanner;

public class Ciclos3_DGM {

	public static void main(String[] args) {
		//Palindromo
		
	String Frase, inv;
	boolean Palabra;
	
   Scanner entrada = new Scanner(System.in);
   
	System.out.println("Digita la Frase :");
	Frase = entrada.nextLine().toLowerCase();
	Frase = Frase.replace(" ","");
	inv = new StringBuilder(Frase).reverse().toString();
	
	Palabra = Frase.equals(inv);
	
	if (Palabra) {
		System.out.println("La palabra es Polimera");
	}
	else {
		System.out.println("La palabra no es Polimera");
	}
	}
}
