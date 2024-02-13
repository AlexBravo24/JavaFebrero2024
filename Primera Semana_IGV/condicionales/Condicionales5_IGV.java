package condicionales;

import java.util.Scanner;

public class Condicionales5_IGV {


	public static void main(String[] args) {
		/*5. Realiza un programa que calcule la aceptaci�n de una solicitud en base a los siguientes 
		  par�metros: edad, nota y sexo.
		* M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
		* M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
		* Otros casos -> NO ACEPTADA
		*/
		
		int nota;
		int edad;
		String sex;

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce tu nota:");
		nota = input.nextInt();
		
		System.out.println("Introduce tu edad:");
		edad = input.nextInt();
		
		System.out.println("Introduce tu sexo:");
		sex = input.nextLine();
		sex = sex.toUpperCase();
		
		if (nota > 4) {
			if (edad > 17) {
				if (sex.contains("F")) {
					System.out.println("Aceptada");
				} else if (sex.contains("M")) {
					System.out.println("Posible");
				}
			}
		} else {
			System.out.println("No aceptada");
		}
		
	}
}


