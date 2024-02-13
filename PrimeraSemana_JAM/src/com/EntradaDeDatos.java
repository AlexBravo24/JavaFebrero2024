package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		
		//Introducir valores por teclado
		
		//Declaramos la variable que queremos guardar
		int edad;
		
		//Declaramos la variable de entrada con Scanner
		Scanner input = new Scanner(System.in); //Necesitamos un nuevo paquete para utilizar Scanner
		
		System.out.print("Introduzca su edad: ");
		edad = input.nextInt();//Nos permite teclear un valor de tipo entero y guardarlo en la variable edad
		
		System.out.println("La edad es: "+edad);
		
		//Podemos utilizar el objeto Scanner para almacenar otro valor
		System.out.println("Introduce tu estatura: ");
		float estatura = input.nextFloat();
		System.out.println("Tu estatura es: "+estatura);
		
		

	}

}
