package com;

public class arraybidimencional {

	public static void main(String[] args) {
		//array de dos dimensiones o matriz
		//es una estructura que nos permite almacenar mas datos de un mismo tipo, pero ahora pasamos de una estructura 
		//lineal pasamos a una estrucctura en matriz con filas y columnas
		
		//ejemplo de declarar array de enteros con su tama;o declarado
		
		int[][] matriz= new int [3][3];
		//asignar valores a cada posicion 
		//ahora especificamos la posicion de filas y columnas
		
		matriz [0][0]=1;
		matriz [0][1]=2;
		matriz [0][2]=3;

		matriz [1][0]=4;
		matriz [1][1]=5;
		matriz [1][2]=6;
		
		matriz [2][0]=7;
		matriz [2][1]=8;
		matriz [2][2]=9;
		
		//declarando un array de dos dimensiones con los valores asignados desde el principio
		
		int[][] matriz2= {{1,2,3},{4,5,6},{7,8,9}};
		//imprimir un solo valor en consola
		System.out.println(matriz2[1][2]);
		
		//imprimir todo el array bidimensional utilizamos 2 ciclos for, uno anidado dentro de otro
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz2[i][j]+" ");
				
				// puedo almacenar en un array string,numeros enteros ,numeros decimales ?
				// si se puede pero tiene sus limitantes
			}
		}
	}

}
