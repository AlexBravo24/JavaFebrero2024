package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		// Array de dos dimensiones - matrix
		//Es una estructura que nos permite almacenar más datos de un mismo tipo
		//pero ahora pasamos de una estructrua lineal, a una especie de "tabla"
		//con filas y columnas
		
		//Ejemplo de declarar un array de enteros con su tamaño declarado
		
		int[][] matrix = new int [3][3]; //3 filas y 3 columnas
		
		//Asignar valores a cada posicion
		//Especificamos la dimension de las "filas" y de las "columnas"
		
		matrix [0][0] = 1;
		matrix [0][1] = 2;
		matrix [0][2] = 3; //[1][2][3]
		
		matrix [1][0] = 4;
		matrix [1][1] = 5;
		matrix [1][2] = 6; //[4][5][6]
		
		matrix [2][0] = 7;
		matrix [2][1] = 8;
		matrix [2][2] = 9; //[7][8][9]
		
		//Declarando un array de dos dimensiones con los valores asignados desde el inicio
		
		int [][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}}; //Es lo mismo que está escrito en la parte de arriba
		
		//Imprimir un solo valor en consoloa
		System.out.println(matrix2[0][2]);
		
		//For anidado para imprimir todos los valores de una matriz
		// Utilizamos 2 ciclos for, uno anidado dentro de otro
		
		//Lo que hace este ciclo es que primero evalua en j=0 e i=0 y escribe el valor 1
		//despues evalua en j=1 e i=0 e imprime el valor de dos
		//despues evalua en j=2 e i=0 e imprime el valor de 3
		//despues como j= 3, ya no se cumple la condicion y hace que i ahora valga 1, por lo tanto la siguiente instruccion seria
		
		//evaluar de j=0 e i=1 dando el valor de 4 y así sucesivamente
		for (int i = 0; i < 3; i++) {
			System.out.println(); //Nos agrega el salto de línea después de haber escrito todos los valores de las filas, o sea estas son las filas
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j]+" "); //Escribe el valor de las columnas
			}
		}
		
		//Matriz de diferentes dimensiones
		int [][] matrix3 = new int [4][6];
		
		//El método .length en el caso de arrays de 2 dimensiones
		//devuelve el valor de las "filas"
		
		//¿Podemos almacenar en un array Strings, enteros, decimales, caracteres?
		//En teoria un array debe contener valores de un mismo tipo
		//Pero tenemos la clase Object que nos guarda todos esos tipos de valores
		//Sin embargo tiene sus limitantes ya que si necesito que interactuen con otros métodos o valores
		//Primero debo castear los valores al tipo de dato correspondiente
		
		Object []objetos = {1,1.98,"Alex",'c'};
		
		int numero = (int) objetos[0];
		double numero2 = (double) objetos[1]; //Esto es el casteo de los valores, convertirlos a un tipo de dato con el que
		//se pueda trabajar
	}

}
