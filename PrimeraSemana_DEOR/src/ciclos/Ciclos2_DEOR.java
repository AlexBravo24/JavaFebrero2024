package ciclos;

import java.util.Scanner;

public class Ciclos2_DEOR {

	public static void main(String[] args) {
		//2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteración deseada por el usuario. Ejemplo, 
		//tabla de 23 hasta el 95. 23 x 95 = ???
		
		int iteracion, valor, total;
		System.out.println("Ingresa un valor principal");
		Scanner input = new Scanner (System.in);
		valor = input.nextInt();
		System.out.println("Ingresa el numero de iteraciones");
		iteracion = input.nextInt();
		
		for (int i = 1; i<iteracion+1; i++) { 
			total = valor * i;
			System.out.println(valor + "x" + i + "=" + total);
		}
		
		
		
	}
}
