package condicionales;

import java.util.Scanner;

public class Condicionales5_JAM {

	public static void main(String[] args) {
		
		/*
		 * Realiza un programa que calcule la aceptación de una solicitud en base a
		 * los siguientes parámetros: edad, nota y sexo.
		 	* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		 	* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		 	* Otros casos -> NO ACEPTADA
		 * 
		 */
		Scanner input = new Scanner(System.in);
		int edad, nota;
		//Scanner texto = new Scanner(System.in);
		String sexo;
		
		System.out.print("Ingrese su nota: ");
		nota = input.nextInt();
		System.out.print("Ingrese su edad: ");
		edad = input.nextInt();
		System.out.print("Ingrese su sexo (F o M): ");
		sexo = input.next();
		
		System.out.println(sexo);
		
		if (nota == 5 && edad == 18 && sexo.contains("F")) { //Por qué no pude hacerlo con sexo == "F"?? == funciona mejor con valores NUMERICOS
			System.out.println("Aceptada");
		}
		else if (nota == 5 && edad == 18 && sexo.contains("M")) {
			System.out.println("Posible");
		}
		else {
			System.out.println("No aceptada");
		}
		
	}

}
