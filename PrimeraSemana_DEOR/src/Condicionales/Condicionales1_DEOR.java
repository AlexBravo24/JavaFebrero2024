package Condicionales;

import java.util.Scanner;

public class Condicionales1_DEOR {

	public static void main(String[] args) {
	//1. Descripci�n: Realiza un programa que reciba dos n�meros por teclado e 
	//	indique cu�l es mayor o si son iguales.

	int x, y;
	System.out.println("Teclea un numero");
	Scanner input = new Scanner(System.in);
	x = input.nextInt();
	System.out.println("Teclea un segundo numero");
	y = input.nextInt();
	
	if (x>y) {
		System.out.println("El primer numero es mayor al segundo");
	}
	else if (y>x) {
		System.out.println("El segundo numero es mayor al primero");
	}
	else if (x==y){
		System.out.println("Ambos numeros son iguales");
	}
	
		
		
}
}
