package condicionales;

import java.util.Scanner;

public class Condicionales1_JAM {

	public static void main(String[] args) {
		
		/* Ejercicio 1
		 * 
		 * Realiza un programa que reciba dos n�meros por teclado 
		 * e indique cu�l es mayor o si son iguales.
		 */
		
		Scanner input = new Scanner (System.in);// Declaro el objeto Scanner para recibir los datos del usuario
		int x,y; //Declaro dos variables de tipo entero para guardar los datos proporcionados por el usuario
		
		System.out.print("Introduzca el primer valor entero: "); //Pido al usuario que ingrese el primer valor entero
		x = input.nextInt(); //Guardo el primer valor entero dado por el usuario
		System.out.print("Introduzca el segundo valor entero: "); //Pido al usuario que ingrese el segundo valor entero
		y = input.nextInt(); //Guardo el segundo valor entero dado por el usuario
		
		if (x>y) { //Si el primer n�mero es mayor
			System.out.println("El valor "+x+" es mayor que el valor "+y);
		}
		else if (x == y){ //Si los n�meros son iguales
			System.out.println("Los n�meros ingresados son iguales");
		}
		else //Si el segundo n�mero es mayor
		{
			System.out.println("El valor "+y+" es mayor que el valor "+x);
		}
		
	}

}
