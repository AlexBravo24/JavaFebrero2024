package arrays;

import java.util.Scanner;

public class arrays1_JAVM {

	public static void main(String[] args) {
		// 1. Crea un array de 10 posiciones de n�meros con valores pedidos 
		//por teclado. Muestra por consola el �ndice y el valor al que corresponde.
		
		Scanner input = new Scanner (System.in);
        int[] numeros = new int[10];

      
        System.out.println("Ingresa 10 n�meros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("N�mero " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

      
        System.out.println("�ndice  "+"  Valor");

        for (int i = 0; i < 10; i++) {
            System.out.println(i  +"            "+ numeros[i]);
        }
    }
	
}


	


