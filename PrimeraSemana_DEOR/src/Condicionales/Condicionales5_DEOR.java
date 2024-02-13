package Condicionales;

import java.util.Scanner;

public class Condicionales5_DEOR {

	public static void main(String[] args) {
		//5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		//parámetros: edad, nota y sexo.
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//* Otros casos -> NO ACEPTADA
		
		int edad, nota;
		char sexo;
		System.out.println("Ingresa una nota");
		Scanner input = new Scanner(System.in);
		nota = input.nextInt();
		System.out.println("Ingresa una edad");
		edad = input.nextInt();
		System.out.println("Ingresa un sexo");
		sexo = input.next().toUpperCase().charAt(0);
		
		if (nota>4) {
			if (edad>17) {
				if (sexo == ('M')) { //equalsIgnoreCase
					System.out.println("Posible");
				}
				else if (sexo == ('F')){
					System.out.println("Aceptada");
				}
				else if (sexo != ('M') || sexo != ('F')) {
					System.out.println("Error al digitar un sexo");
				}
			}
			else {
				System.out.println("No aceptada");
			}
		}
		else {
			System.out.println("No aceptada");
		}
	}
}
