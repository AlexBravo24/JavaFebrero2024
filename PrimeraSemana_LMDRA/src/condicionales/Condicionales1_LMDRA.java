package condicionales;

import java.util.Scanner;

public class Condicionales1_LMDRA {

	public static void main(String[] args) {
		/* programa que reciba dos n�meros por teclado e indique cu�l es 
		mayor o si son iguales*/
		
		//Se declaran las variables necesarias para usarlas posteriormente
		int num1, num2;
		Scanner input = new Scanner(System.in);
		//Se solicitan al usuario los 2 numeros, se envia previamente un mensaje
		//que se refiere a lo que se va a realizar 
		System.out.println("A continuaci�n evaluaremos los 2 n�meros que tienes");
		System.out.println("Ingresa el n�mero 1");
		num1 = input.nextInt();
		System.out.println("Ingresa el n�mero 2");
		num2 = input.nextInt();
		System.out.println("La evaluacion es la siguiente: ");
		//En una estructura if-else se realiza la evaluacion
		if (num1 == num2 ) {
			System.out.println("Los n�meros son iguales");
		}else if (num1<num2) {
			System.out.println("El n�mero "+num2+" es el mayor");
		}else if (num2<num1) {
			System.out.println("El n�mero "+num1+" es el mayor");
		}
	}

}
