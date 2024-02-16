package Condicionales;

import java.util.Scanner;

public class Condicionales8_JPS {

	public static void main(String[] args) {
		
		//
		/*
		 * 8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de
		 * seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado 
		 * obtenido.
		 * Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		 * Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
		 * “ERROR: número incorrecto”.
		 */
		//declaramos nuestras variables para almacenar datos
		int nlado;
		
		//introducimos valores en teclado con scaner
		Scanner input= new Scanner(System.in);
		System.out.println("Introduce el numero de lado del dado");
		nlado = input.nextInt();
		
		int L=(nlado);
		
		switch (L) { 
		case 1:
			System.out.println("El numero del lado contrario a tu numero es el 6");
			break;
		case 2:
			System.out.println("El numero del lado contrario a tu numero es el 5");
			break;
		case 3:
			System.out.println("El numero del lado contrario a tu numero es el 4");
			break;
		case 4:
			System.out.println("El numero del lado contrario a tu numero es el 3");
			break;
		case 5:
			System.out.println("El numero del lado contrario a tu numero es el 2");
			break;
		case 6:
			System.out.println("El numero del lado contrario a tu numero es el 1");
			break;
		default:
			System.out.println("Error");
			break;
		}
	}

}
