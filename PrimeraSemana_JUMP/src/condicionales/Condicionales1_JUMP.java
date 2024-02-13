package condicionales;

import java.util.Scanner;

public class Condicionales1_JUMP {

	public static void main(String[] args) {
		
		// 1.Realiza un programa que reciba dos números por 
		//teclado e indique cuál es mayor o si son iguales.

int num1, num2;
		
		
		Scanner input = new Scanner(System.in);
		
	
		System.out.println("Introduce primer numero: ");
		num1 = input.nextInt();
		
		System.out.println("Introduce segundo numero: ");
		num2 = input.nextInt();
		
		
		if (num1>num2) {
			System.out.println("El primer numero es mayor");
		}else if (num1<num2) { 
			System.out.println("El segundo numero es mayor");
		} else {
			System.out.println("El primer y segundo numero son iguales");
			
		}
		


	}

}
