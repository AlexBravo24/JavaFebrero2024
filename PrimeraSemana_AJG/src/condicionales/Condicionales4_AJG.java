package condicionales;

import java.util.Scanner;

public class Condicionales4_AJG {
	
	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y 
		// compruebe si contiene letras mayúsculas.
		
		String texto;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce El texto:");
		texto = input.nextLine();
//		método String.contains() 
//		para verificar si la cadena contiene cada letra mayúscula del alfabeto
//		
		if (texto.contains("A") || texto.contains("B") || texto.contains("C") || texto.contains("D") || texto.contains("E") || texto.contains("F") || texto.contains("G") || texto.contains("H") || texto.contains("I") || texto.contains("J") || texto.contains("K") || texto.contains("L") || texto.contains("M") || texto.contains("N") || texto.contains("O") || texto.contains("P") || texto.contains("Q") || texto.contains("R") || texto.contains("S") || texto.contains("T") || texto.contains("U") || texto.contains("V") || texto.contains("W") || texto.contains("X") || texto.contains("Y") || texto.contains("Z")) {
		    System.out.println("El texto contiene letras mayúsculas.");
		} else {
		    System.out.println("El texto no contiene letras mayúsculas.");
		}
	}
}
