package condicionales;

import java.util.Scanner;

public class Condicionales3_LMDRA {

	public static void main(String[] args) {
		//Realiza la division de 2 numeros dados por el usuario
		int num1, num2, num3;
		Scanner input = new Scanner(System.in);
		
		System.out.println("A continuación realizaremos la división de los 2 números que tienes");
		System.out.println("Ingresa el dividendo");
		num1 = input.nextInt();
		System.out.println("Ingresa el número divisor");
		num2 = input.nextInt();
		//Usaremos un switch case para verificar que el divisor no sea 0
		switch (num2) {
		case 0:
			System.out.println("ERROR");
			System.out.println("No se puede ralizar la operación con un divisor 0");
			break;

		default:
			num3=num1/num2;
			System.out.println("El resultado de la división es: "+ num3); 
			break;
			
		}
	}

}
