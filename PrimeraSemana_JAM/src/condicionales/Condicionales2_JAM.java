package condicionales;

import java.util.Scanner;

public class Condicionales2_JAM {
	
	public static void main(String[] args) {
		
		/*
		 * Realiza un programa que pida un n�mero por teclado 
		 * y nos indique si es par o impar
		 */
		
		Scanner input = new Scanner (System.in);
		int x;
		System.out.println("Introduzca cualquier n�mero entero: ");
		x = input.nextInt();
		
		if (x%2 == 0) { //Aqui hago la operaci�n donde, si el residuo de el n�mero ingresado por el usuario entre 2 es igual a 0 
			System.out.println("El numero es par"); //nos cumple la condici�n de que sea par, 
		}                                             //esto con el operador % que nos da el resulato del residuo
		else {
			System.out.println("El numero no es impar");
		}
	}

}
