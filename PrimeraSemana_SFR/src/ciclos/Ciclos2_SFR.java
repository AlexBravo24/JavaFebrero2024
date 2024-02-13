package ciclos;

import java.util.Scanner;

public class Ciclos2_SFR {
	public static void main(String[] args) {
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero
		//introducido desde teclado, hasta la iteración deseada por el usuario.
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
	
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el primer numero que desea multiplicar");
		int num1 = input.nextInt();
		System.out.println("Ingrese el segundo numero que desea multiplicar");
		int num2 =input.nextInt();
		 
		
		for ( num1 = num1; num1 <=num2; num1++) {
			int resul = num1*num2;
			System.out.println(num1 + " X "+ num2 + " = " + resul );
			
		}
		
		
		
	}
}
