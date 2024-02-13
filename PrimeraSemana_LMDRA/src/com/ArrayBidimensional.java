package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// el array de dos dimensiones 
		/*
		 *es una estructura que nos permite almacenar mas datos de un mismo tipo
		 *pero ahora ennuna especie de tabla
		 *con filas y columnas
		 *
		 * 
		 * ejemplo de declarar un array 
		 *
		 */
		int [][] matriz=new int[3][3];
		//asignar valores a cad aposicion
		//ahora especificamos la dimension de las filas
		//y la de las columna
		
		matriz[0][0]=1;
		matriz[0][1]=2;
		matriz[0][2]=3; //[1][2][3]
		
		matriz[1][0]=4;
		matriz[1][1]=5;
		matriz[1][2]=6; //[4][5][6]
		
		matriz[2][0]=7;
		matriz[2][1]=8;
		matriz[2][2]=9;//[7][8][9]
		
		int [][] matriz2= {{1,2,3},{4,5,6},{7,8,9}};
		//System.out.println(matriz2[0][2]);
		
		//para imprimirnlos valores de una matriz 
		//utilizamos 2 ciclos for anidados
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				System.out.print(matriz2[i][j]+" ");
			}
			System.out.println();
		}
		//puedo almacenar en un array diferentes tipos de datos?
		/*
		 * Si utilizando un array de tipo object, 
		 * sin embargo tiene sus limitantes
		 * si quiero que interactue con otros metodos, se necesita
		 * castearl el dato al tipo de dato correspondiente con el que
		 * quiero que interactuen*/
		
		Object [] objetos;
		
	}

}
