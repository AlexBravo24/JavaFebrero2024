package Condicionales;

import java.util.Scanner;

public class Condicionales2_DEOR {

	public static void main(String[] args) {
	//2. Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		int numero;
		System.out.println("Teclea un numero");
		Scanner input = new Scanner(System.in);
		numero = input.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero es impar");
		}
}
}
