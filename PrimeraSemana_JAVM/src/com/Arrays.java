package com;

import java.util.Stack;

public class Arrays {

	public static void main(String[] args) {
		// Arrays o arreglos ,tambien conocidos como vectores son una estructura que nos perminte almacenar
		//varios elementos de un tipo
		//de datos en comun,su desventaha es que estas estructuras no pueden crecer en tiempo de ejecucion
		
		//Ejemplo de declarar array de numero enteros si valores asignados ni tamano declarado
		int numero; //esta variable solo almacena un numero a la vez
		int[] numeros; //
		
		//ejemplo de declarar un array con su tama~o declarado (longitud)
		int[] numeros2= new int[5];
		
		char [] caracteres= new char [20];
		String [] cadenas= new String[10];
		
		//A~adir elementos a un array con su tama;o declarado
		//[0][1][2][3][4]
		
		numeros2 [0]= 100;
		numeros2 [1]= 200;
		numeros2 [2]= 300;
		numeros2 [3]= 400;
		numeros2 [4]= 500;
		
		//si quiero imprimir un determinado valor en consola de mi arreglo , debo llamar a esa posicion
		
		System.out.println(numeros2[3]);
		
		int suma = numeros2[2]+ numeros2[3];
		System.out.println(suma);
		//a~adir elementos al array strings
		
		cadenas [0]= "hola mundo x 1000";
		cadenas [1]= "a";
		
		//Ejemplo de declarar un array ya con valore asignados desde un inicio
		
		int [] enteros = {100,200,300,400,500};
		System.out.println(enteros[1]);
		
		for (int i = 0; i < enteros.length; i++) {
			System.out.println("as"+ enteros[i]);
			
		}
	//para recorrer o imprimir todas la posiciones del array ,existe otro ciclo llamado for each
		for(int i:enteros) {
			System.out.println(i);
		}
		

	}

}
