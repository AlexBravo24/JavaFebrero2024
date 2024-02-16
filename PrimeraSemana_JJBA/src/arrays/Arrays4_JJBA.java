package arrays;

import java.util.Scanner;

public class Arrays4_JJBA {

	public static void main(String[] args) {
		
		//Ejercicio 4 - Dado un array de números de 5 posiciones con los siguientes valores:
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		//los valores invertidos, es decir, que el segundo array deberá tener los valores 
		//{5,4,3,2,1}

		int [] numeros1 = {1,2,3,4,5};
		int [] numeros2 = new int[5];
		//int numeroso=0;
		//int s=4;
		
		for (int i = 0; i < numeros1.length; i++) {
			System.out.println(numeros1 [i]);
			numeros2 [4] =5;
			numeros2 [3] =4;
			numeros2 [2] =3;
			numeros2 [1] =2;
			numeros2 [0] =1;
		
		}
			for (int j = 4; j >= 0; j--) {
			System.out.println(numeros2[j]);				
			}
			

		
	}

}
