package Condicionales;

import java.util.Scanner;

public class Condicionales5_DEOR {

	public static void main(String[] args) {
		//5. Realiza un programa que calcule la aceptaci�n de una solicitud en base a los siguientes 
		//par�metros: edad, nota y sexo.
		//* M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
		//* M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
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
