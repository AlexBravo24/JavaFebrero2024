package condicionales;

import java.util.Scanner;

public class Condicionales3_IGV {

	public static void main(String[] args) {
		// 3.  Crea un programa que pida al usuario dos números y muestre el resultado 
		// de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		float num1;
		float num2;
		float res;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el primer valor");
		num1 = input.nextInt();
		
		System.out.println("Imprime el segundo numero");
		num2 = input.nextInt();
		
	
		
		if (num2 != 0) {
			res = num1/num2;
			System.out.println("El resultado de la division es: " + res);
		} else {
			System.out.println("Error. El segundo numero es zero");
		}

	}

}
