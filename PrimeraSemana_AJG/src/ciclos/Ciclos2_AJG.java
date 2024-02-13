package ciclos;

import java.util.Scanner;

public class Ciclos2_AJG {
	public static void main(String[] args) {
//		2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
//		introducido desde teclado, hasta la iteración deseada por el usuario. 
//		Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		   // Solicitar al usuario el número y la iteración deseada
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un número para la tabla de multiplicar: ");
        int numero = input.nextInt();
        System.out.print("Ingresa la iteración deseada: ");
        int iteracionDeseada = input.nextInt();

        // Realizar la tabla de multiplicar del número hasta la iteración deseada
        System.out.println("Tabla de multiplicar del " + numero + " hasta la iteración " + iteracionDeseada + ":");
        for (int i = 1; i <= iteracionDeseada; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
	}
}
