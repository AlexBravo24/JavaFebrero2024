package arrays;

import java.util.Scanner;

public class Array5_DGM {

	public static void main(String[] args) {
		//5
		
	int [] enteros = new int [5];
	int x;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite los 5 numeros");
	for (x = 0; x < enteros.length; x++) {
	System.out.print("Digite el N°"+(x+1)+ ":");
	enteros [x] = entrada.nextInt();
	}
    
	System.out.println("Los elementos que digitaste son :");
	for (x = 5; x >= 1; x--) {
		System.out.println(enteros[x]);
	}
	
	
	}

}
