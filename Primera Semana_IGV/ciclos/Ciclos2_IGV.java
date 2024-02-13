package ciclos;

import java.util.Scanner;

public class Ciclos2_IGV {

	public static void main(String[] args) {
		/*
		2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
		introducido desde teclado, hasta la iteración deseada por el usuario. 
		Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		*/
		
		int num;
		int iteracion;
		int i = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dame un numero del cual quieras visualizar su tabla de multiplicar:");
		num = input.nextInt();
		
		System.out.println("Dime hasta que numero quieres que deje de contar:");
		iteracion = input.nextInt();
		
		while (i <= iteracion) {
			
			System.out.println(i + " X "+ num + " = " + i*num);
			i++;
		}

	}

}
