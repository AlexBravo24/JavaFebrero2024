package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		//Introducir valores por teclado
		
		//Primero declaramos la variable en la que se guardara un valor
		int edad;
		
		//Declarar variable de la clase Scanner
		Scanner input = new Scanner(System.in);
		//Lo que tenemos lo guardadmos en la variable edad
		System.out.println("Introduce tu edad");
		edad= input.nextInt();
		
		//Una vez almacenado el valor de la edad, puedo hacer con ella lo que necesite
		System.out.println("Tu edad es: "+ edad);
		//no es necesario declarar otro objeto scaner para solicitar mas datos
		System.out.println("Introduce tu estatura");
		double estatura = input.nextDouble();
		System.out.println("Tu estatura es: "+ estatura);
	}

}
