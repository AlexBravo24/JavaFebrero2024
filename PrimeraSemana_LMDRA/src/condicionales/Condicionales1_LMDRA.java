package condicionales;

import java.util.Scanner;

public class Condicionales1_LMDRA {

	public static void main(String[] args) {
		/* programa que reciba dos números por teclado e indique cuál es 
		mayor o si son iguales*/
		
		//Se declaran las variables necesarias para usarlas posteriormente
		int num1, num2;
		Scanner input = new Scanner(System.in);
		//Se solicitan al usuario los 2 numeros, se envia previamente un mensaje
		//que se refiere a lo que se va a realizar 
		System.out.println("A continuación evaluaremos los 2 números que tienes");
		System.out.println("Ingresa el número 1");
		num1 = input.nextInt();
		System.out.println("Ingresa el número 2");
		num2 = input.nextInt();
		System.out.println("La evaluacion es la siguiente: ");
		//En una estructura if-else se realiza la evaluacion
		if (num1 == num2 ) {
			System.out.println("Los números son iguales");
		}else if (num1<num2) {
			System.out.println("El número "+num2+" es el mayor");
		}else if (num2<num1) {
			System.out.println("El número "+num1+" es el mayor");
		}
	}

}
