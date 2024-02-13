package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		// Array de dos dimensiones - matriz
		//Es una estructura que nos permite almacenar mas 
		//datos de un mismo tipo, pero ahora pasamos 
		//de una estructura lineal, a una especie de "tabla"
		//con filas y columnas
		
		//Ejemplo de declarar un array de enteros con su
		//tamaño delcrado
		
		int [][] matriz = new int [3][3];
		
		//Asignar valores a cada posision 
		//ahora especificamos la dimension de las "filas"
		// y la de las "coolumnas"
		matriz [0][0]=1;
		matriz [0][1]=2;
		matriz [0][2]=3;     //[1][2][3]
		
		matriz [1][0]=4;
		matriz [1][1]=5;
		matriz [1][2]=6;     //[4][5][6]
		
		matriz [2][0]=7;
		matriz [2][1]=8;
		matriz [2][2]=9;     //[7][8][9]
		
		//Declarando un array de dos dimensiones
		// con los valores asignados desde el principio
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//Imprimir un solo valor en consola
		System.out.println(matriz2[0][2]);
		
		//Para imprimir todos los valores de una matriz
		//utilizamos 2 ciclos for, uno anidado dentro de otro
		
		for (int i = 0; i < matriz2.length; i++ ) {
			System.out.println();
			for (int j = 0; j < matriz2.length; j++ ) {
				System.out.print(matriz2[i][j] + " ");
			}
		}
		System.out.println();
		//Ddeclarar una matriz con valores diferentes en sus
		//dimensiones
		int [][] matriz3 = new int[4][9];
		
		//El metodo .length en el caso de los arrays de 2 dimensiones 
		//devuelve el valor de las "filas"
		System.out.println(matriz3.length);
		
		//Puedo almacenar en un array Strings, numeros enteros, 
		//numeros decimales y caracteres?
		//Sin embargo, tiene sus limitantes, porque si quiero
		//que interactuen con otros metodos o si nesesito
		//realizar operaciones con los valores
		//primero debo castearlos al tipo de dato copprespondiente
		
		Object [] objetos = {1, 1.999, 'a', "Alex", true};
		
		int numero = (int) objetos[0];
		double numero2 = (double) objetos[1];
				
				
		}

	}


