package Ciclos;

import java.util.Scanner;

public class Ciclos2_JPS {

	public static void main(String[] args) {

		
		//
		/*
		 * 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero
		 *introducido desde teclado, hasta la iteración deseada por el usuario.
		 *Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		 */
		//Introducimos nuestras variables que conservaran nuestros valores
		double multiplo1;
		double numero1;
		double tabla;
		//pedimos la entrada de datos 
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el numero que desea crear tabla de multiplicar ");
		numero1=input.nextDouble();
		
		System.out.println("Introduce hasta que numero terminar");
		multiplo1=input.nextDouble();
			
		
	        for (int i = 1; i <= multiplo1; i++) {
	            double resultado = numero1 * i;
	            System.out.println(numero1 + " x " + i + " = " + resultado);
	        }  
    
	}//main open 
}

