package condicionales;

import java.util.Scanner;

public class Condicionales8_JAM {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida por teclado el resultado (dato entero) 
		 * obtenido al lanzar un dado de seis caras y muestre por pantalla el número en
		 * letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
		 * caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		 * 
		 * Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se
		 * mostrará el mensaje: “ERROR: número incorrecto”.
		 */

		Scanner input = new Scanner(System.in);
		int valor;
		String numero;
		
		System.out.println("Ingrese un número del dado: ");
		valor = input.nextInt();
		
		if (valor ==1) {
			System.out.println("Seis");
		}else if (valor ==2) {
			System.out.println("Cinco");
		}else if (valor ==3) {
			System.out.println("Cuatro");
		}else if (valor == 4) {
			System.out.println("Tres");
		}else if (valor == 5) {
			System.out.println("Dos");
		}else if (valor ==6) {
			System.out.println("Uno");
		} else if (valor<1 || valor>6) {
			System.out.println("ERROR: Número incorrecto");
		}
	}

}
