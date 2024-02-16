package com;

public class Arrays {

	public static void main(String[] args) {
		
		// Los Arrays
		
		int [] numero;//declaramos la variable sin valores asignados ni tamaño
        
		int [] numero2 = new int[5];//declaramos la longitud, no el valor
		
		String [] cadenas = new String[10];
		
		//añadir elementos a un array con su tamaño declarado
		//[0] [1] [2] [3] [4]
		
		numero2 [0] = 100;
		numero2 [1] = 200;
		numero2 [2] = 300;
		numero2 [3] = 400;
		numero2 [4] = 500;
		
		System.out.println(numero2[0]);
		
		//añadir elementos al array de Strings
		
		cadenas[0] = "Hola mundo";
		cadenas[1] = "D";
		
		int [] enteros = {100, 200, 300, 400, 500};
		
		for (int X = 0; X < enteros.length; X++) {
		System.out.println(enteros[X]);
		}
		
		for (int X:enteros) {
			System.out.println(X);
		}
	}

}
