package arrays;

import java.util.Scanner;

public class Arrays1_LMDRA {

	// Crea un array de 10 posiciones de números con valores pedidos por teclado. 
	//Muestra por consola el índice y el valor al que corresponde.
	public static void main(String[] args) {
		// Se declaran las variables que serán utilizadas
		Scanner input = new Scanner(System.in);
		int [] coleccion=new int[10];
		//Solicitemos al usuario los numeros del array
		System.out.println("Comencemos a almacenar los números de tu colección");
		System.out.println("Debes ingresar "+(coleccion.length)+" números para guardarlos");
		for (int i=0;i<coleccion.length;i++) {
			System.out.println("Introduce el número "+(i+1)+" de la colección: ");
			coleccion[i]=input.nextInt();
		}
		
		for (int i=0;i<coleccion.length;i++) {
			System.out.print((i+1)+".-"+coleccion[i]+"  ");
			
		}
	}

}
