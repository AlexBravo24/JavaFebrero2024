package condicionales;

import java.util.Scanner;

public class Condicionales8_JJBA {

	public static void main(String[] args) {
		
		//Ejercicio8 - Realiza un programa que pida por teclado el resultado (dato entero) 
//		obtenido al lanzar un dado de seis caras y muestre por pantalla el n�mero en 
//		letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las 
//		caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4. 
//		Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se 
//		mostrar� el mensaje: �ERROR: n�mero incorrecto�.

Scanner input = new Scanner(System.in);
		
		System.out.println("Escriba el n�mero obtenido al lanzar un dado de se�s caras: ");
		
		int numero;
		
		numero = input.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("El n�mero de la cara contraria es Se�s");
			break;
		case 2:
			System.out.println("El n�mero de la cara contraria es Cinco");
			break;
		case 3:
			System.out.println("El n�mero de la cara contraria es Cuatro");
			break;
		case 4:
			System.out.println("El n�mero de la cara contraria es Tres");
			break;
		case 5:
			System.out.println("El n�mero de la cara contraria es Dos");
			break;
		case 6:
			System.out.println("El n�mero de la cara contraria es Uno");
			break;
			
			default:
			System.out.println("Error: N�mero incorrecto");
			break;
		}
		
		
	}

}
