package com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDeDatos {

	public static void main(String[] args) {
	
		//Introducir valores por teclado
		//Declarar variable donde guardaremos un valor
		
		int edad; 
		
		//pedimos por texto una edad
		System.out.println("Teclea una edad");
		
		//solicita mediante escanner el valor por teclado
		Scanner input = new Scanner(System.in);
		
		edad = input.nextInt();
		
		//muestra en pantalla la edad tecleada
		System.out.println("La edad tecleada es: "+edad);
		
		System.out.println("Teclea estatura");
		
		double estatura = input.nextDouble();
				
		System.out.println("La estatura es: " + estatura +" cm");
		
}
}
