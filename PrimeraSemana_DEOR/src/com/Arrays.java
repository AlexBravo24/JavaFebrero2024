package com;

public class Arrays {

	public static void main(String[] args) {
		
		//Arrays tambien conocido como vectores, son una estructura que nos
		//permite almacenar varios elementos de un tipo de datos en comun
		
		//Su desventaja es que estas estructuras no pueden crecer en tiempo de 
		//ejecucion
		
		//Ejemplo de declarar un array de numeros enteros
		//int [] numeros; 
		
		//Ejemplo de declarar un array con tamaño declarado
		//int [] numeros2 = new int [5];
		
		//char [] caracteres = new char[5];
		
		//String [] cadenas = new String[10];
		
		//Añadir elementos a un array con tamaño declarado
		//[0][1][2][3][4]
		//numeros 2[0]=100;
		//numeros 2[1]=200;
		//numeros 2[2]=300;
		//numeros 2[3]=400;
		//numeros 2[4]=500;
		
		int [] enteros = {100, 200, 300, 400, 500};
//		
//		enteros[2]=1000;
		
		//imprimir un array 
//		System.out.println(enteros[2]);
		
//		for (int i = 0; i < enteros.length; i++) {
//			System.out.println(enteros[i]);
//		}
		
		for (int i:enteros) {
			System.out.println(i);
			
//		for (int i = 4; i >= 0; i--) {
//		System.out.println(enteros[i]);
//		}
		}
		
		
		//System.out.println(numeros2[3]);
		//int suma = numeros2[2]+numeros2[3];
		//System.out.println(suma);
		
	}
}
