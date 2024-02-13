package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// Introducir valores por teclado
		
		//Primero de claramos la variable en la cual queremos 
		//guardar un valor
		int edad;
		
		//Declarar una variable de la clase Scanner
		Scanner input = new Scanner(System.in);
		
		//Lo que tecleamos lo guardamos en la variabe edad
		System.out.println("Introduce tu edad");
		edad = input.nextInt();
		
		//Una vez almacenado la edad, puedo hacer con
		//ella lo que nesesite, una operacion, etc.
		System.out.println("Tu edad es: " + edad);
		
		//Ahora quiero solicitar la estatura
		//Podemos utilizar el mismo objeto Scanner
		System.out.println("Introduce tu estatura");
		double estatura = input.nextDouble();
		
		System.out.println("Tu estatura es: " + estatura);

	}

}
