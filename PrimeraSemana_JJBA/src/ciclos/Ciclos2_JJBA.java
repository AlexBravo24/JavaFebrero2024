package ciclos;

import java.util.Scanner;

public class Ciclos2_JJBA {

	public static void main(String[] args) {
		
		//Ejercicio2 - - Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteración deseada por el usuario. 
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese un número:");
		
		int numero;
		
		numero = input.nextInt();
		
		System.out.println("Ingrese el número de iteraciones:");
		
		int iteracion;
		
		iteracion = input.nextInt();
		
		
		for (int i = 1; i <= iteracion; i++) {
			int resultado;
			resultado = numero * i;
			System.out.println(numero + "x" + i + "=" + resultado);
		}

	}

}
