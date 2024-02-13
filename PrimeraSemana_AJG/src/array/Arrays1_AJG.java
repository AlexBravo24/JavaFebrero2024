package array;

import java.util.Scanner;

public class Arrays1_AJG {

    public static void main(String[] args) {
//    	1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
//    	Muestra por consola el índice y el valor al que corresponde.
//    	
    	
    	
        // Crear un array de 10 posiciones de números con valores pedidos por teclado.
        int[] numeros = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa 10 valores:");

        // Leer los valores ingresados por el usuario y almacenarlos en el array.
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Mostrar por consola el índice y el valor al que corresponde.
        System.out.println("Los valores ingresados son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("[" + i + "] = " + numeros[i]);
        }
    }
}

