package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		// Ejemplo de declarar un array de enteros 
		//con su tamañano declarado
		
		int [][] matriz = new int [3][3];
		
		//ASIGNARLE VALOR A LOS ELEMENTOS
		matriz [0][0] = 1;
		matriz [0][1] = 1;//Primera fila
		matriz [0][2] = 1;   
		
		matriz [1][0] = 4;
		matriz [1][1] = 5;//segunda fila
		matriz [1][2] = 6; 
		
		matriz [2][0] = 7;
		matriz [2][1] = 8;//tercer fila 
		matriz [2][2] = 9; 
		
		//DECLARAR EL ARRAY CON VALORES ASIGNADOS
		
		int [][] matriz2 = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		//imprimir un  solo valor en consola
		System.out.println(matriz2[0][2]);
		
		//Para imprimir todos los valores de una matriz
		// se utiliza 2 ciclos for
		
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
		}
		
		//declarar una matiz de diferentes dimensiones
		
		int [][] matriz3 = new int [4][9];
		
		//¿puedo almacenar un array String, numero enteros , decimales etc?
		// SI, USANDO EL OBJECT
		
		Object [] objetos = {1, 1.99, 'a', true};
		
		
		
		
		//Object numero = 1; //La clase objet permite almacenar valores int,decimal,string,caracteres
		//String [] valores = new String [5];
		
	}

}
