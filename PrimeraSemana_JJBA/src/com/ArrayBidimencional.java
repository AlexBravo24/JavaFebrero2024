package com;

public class ArrayBidimencional {

	public static void main(String[] args) {
		
		//El Array de dos dimensiones - matriz 
		//Es una estructura que nos permite almacenar más datos
		//de un mismo tipo, pero ahora pasamos de una estructura
		//lineal, a una especie de "tabla" con filas y columnas.
		
		//Ejemplo de declarar un array de enteros con su
		//tamaño declarado
		
		int [][] matriz = new int [3][3];
		
		//Asignar valores a cada posición
		//ahoar especificamos la dimensión de las "filas" 
		//y de las "columnas"
		matriz [0][0]=1;
		matriz [0][1]=2;
		matriz [0][2]=3;	//[1][2][3]
		
		matriz [1][0]=4;
		matriz [1][1]=5;	//[4][5][6]
		matriz [1][2]=6;
		
		matriz [2][0]=7;	//[7][8][9]
		matriz [2][1]=8;
		matriz [2][2]=9;
		
		//Declarando un array de dos dimensiones
		//con los valores asignados desde el principio.
		
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//Imprimir un solo valor de consola
		System.out.println(matriz[0][2]);
		
		//Para imprimir todos los valores de una matriz utilizamos
		//2 ciclos for, uno anidado dentro de otro
		
		for (int i = 0; i < matriz2.length; i++) { //En lugar de matriz2.lenght podemos poner
			System.out.println();
			for (int j = 0; j < matriz2.length; j++) { //la cantidad de columnas y filas. (CUando son diferentes las cantidades)
				System.out.print(matriz2[i][j]+" "); //cambio println por print y pone todo en una fila.
			}
		}
		System.out.println();
		
		//¡Puedo almacenar en un array: Strings, numeros enteros, numeros decimales

		//Declarar una matriz con valores diferentes a sus dimensiones
		
		
		int [][] matriz3 = new int [4][9];
				System.out.println(matriz3.length);
		//El metodo .length en el caso de arrays de 2 dimensiones
				//devuelve el valor de las "filas"
	}

}
