package condicionales;

import java.util.Scanner;

public class Condicionales3_JAM {

	public static void main(String[] args) {
		
	/*
	 * Crea un programa que pida al usuario dos n�meros y muestre el resultado 
	 * de su divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error.
	 * 
	 */
	Scanner input = new Scanner(System.in);
	float x,y,z;
	
	System.out.print("Introduzca el primer n�mero: ");
	x = input.nextFloat();
	System.out.print("Introduzca el segundo n�mero: ");
	y = input.nextFloat();
	
	z = x/y;
	
	if (y == 0) {
		System.out.println("Error");
	}
	else {
		System.out.println("El resultado es: "+z);
	}
	
	}
}
