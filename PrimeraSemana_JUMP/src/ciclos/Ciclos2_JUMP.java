package ciclos;

import java.util.Scanner;

public class Ciclos2_JUMP {

	public static void main(String[] args) {
		
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteración deseada por el usuario. 
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
int num1;
int num2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero que deseas multiplicar: ");
		num1 = input.nextInt();
		
		System.out.println("Introduce el segundo numero de hasta donde deseas terminar: ");
		num2 = input.nextInt();
		
		System.out.println("TABLA DE MULTIPLICAR DEL " + num1);
		for (int i = 1; i <= num2; i++) {
			
			
			System.out.println(i + " x " + num1 + " = " + num1*i);
			
			
		}
		


	}

}
