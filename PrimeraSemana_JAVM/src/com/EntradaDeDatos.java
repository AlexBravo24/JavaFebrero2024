package com;

import java.io.Console;
import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Introducir valor por teclado
		
		//primero declaramos la variable en la cual queremos guardar un valor
		int edad;
		//declarar una variable de la clase scanner
		Scanner input = new Scanner (System.in);
		//lo que tecleamos lo guardaremos en la variable edad
		System.out.println("Introduce tu edad");
		edad = input.nextInt();
		
		//una vez almacenado el valor de la edad puedo utulizarla cuando la necesite
		
		System.out.println("Tu edad es:"+edad);
		//ahora solicitaremos la estatura
		//podemos utilizar el mismo objeto scanner
		System.out.println("Introduce tu estatura");
		double estatura = input.nextDouble();
		System.out.println("Tu estatura es");
	}

}
