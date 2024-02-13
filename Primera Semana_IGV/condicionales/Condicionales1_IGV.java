package condicionales;

import java.util.Scanner;

public class Condicionales1_IGV {

	public static void main(String[] args) {
		// 1. Realiza un programa que reciba dos números por teclado e
		// indique cuál es mayor o si son iguales
		
		int num1;
		int num2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		num1 = input.nextInt();
		
		System.out.println("Introduce otro numero");
		num2 = input.nextInt();
		
		if (num1 == num2) {
			System.out.println("el numero " + num1 + " y " + num2 + " son iguales");
		} else if (num1 > num2) {
			System.out.println("El numero: " + num1 + " es mayor que " + num2);
		} else if (num1 < num2) {
			System.out.println("El numero: " + num2 + " Es mayor que " + num1);
		}
		
	}

}
