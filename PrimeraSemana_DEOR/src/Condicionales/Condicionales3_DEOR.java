package Condicionales;

import java.util.Scanner;

public class Condicionales3_DEOR {

	public static void main(String[] args) {
		//3.Crea un programa que pida al usuario dos números y muestre el resultado de 
		//su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		double n1, n2, resultado;
		System.out.println("Teclea un numero");
		Scanner input = new Scanner(System.in);
		n1 = input.nextDouble();
		System.out.println("Teclea otro numero");
		n2 = input.nextDouble();
		
		if (n2!=0) {
			resultado = n1/n2;
			System.out.println("El resultado de la division es:" +resultado);
		}
		else if (n2 == 0) {
			System.out.println("Error");
		}
		
	}
}
