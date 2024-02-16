package condicionales;

import java.util.Scanner;

public class Condicionales1_AJG {

	public static void main(String[] args) {
		/*
		 * 1.Realiza un programa que reciba dos números por teclado e indique cuál es 
			mayor o si son iguales
			<>
		 */
		int valor1;
		int valor2;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el Valor 1");
		valor1 = input.nextInt();
		System.out.println("Introduce el Valor 2");
		valor2 = input.nextInt();
		
		if (valor1 > valor2) {
			System.out.println("Valor 1 Es mayor");
		}else if(valor2 > valor1){
			System.out.println("Valor 2 es mayor");
		}else {
			System.out.println("Los Valores son Iguales");
		}


	}

}
