package Arrays;

import java.util.Scanner;

public class Arrays1_JPS {

	public static void main(String[] args) {
		
		// 
		/*
		 * Crea un array de 10 posiciones de números con valores pedidos por teclado.
		 * Muestra por consola el índice y el valor al que corresponde.
		 */
		Scanner scanner = new Scanner(System.in);

        // Crear un array de 10 posiciones
        int[] numeros = new int[10];

        // Pedir al usuario que ingrese los valores y almacenarlos en el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar por consola el índice y el valor correspondiente
        System.out.println("Índice \t Valor");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + "\t" + numeros[i]);
        }

        scanner.close();
	}

}
