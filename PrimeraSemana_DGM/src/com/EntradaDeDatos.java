package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
 //Introducir valores por teclado
int edad;

Scanner Input = new Scanner(System.in);//declaramos 

System.out.print("Digite su Edad");
edad = Input.nextInt();//Guarda lo que teclemos en edad

System.out.println("Tu edad es: " +edad);

		

	}

}
