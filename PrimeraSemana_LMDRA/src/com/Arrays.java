package com;

public class Arrays {

	public static void main(String[] args) {
		//Arrays o arreglos, tambien conocidos en ocasiones como vectores
		// son una estructura que nos permite almacenar varios elementos
		//de un tipo de datos en común
		//Su desventaja es que estas estructuras no pueden crecer en tiempo de ejecución
		
		//Ejemplo de declarar un arra de numeros enteros
		int [] numeros;
		//se declaro sin valores asignados ni tamaño declarado
		
		//Ejemplo de declarar un array con su tamño declarado(longitud)
		//declarado(longitud)
		int [] numeros2=new int[5];
		
		//Ejemplo array de caracteres y string
		char [] carcteres=new char[20];
		String [] cadenas=new String[10];
		
		//Añadir elementos a un array con su tamaño declarado
		//[0][][2][3][4]
		numeros2[0]=100;
		numeros2[1]=200;
		numeros2[2]=300;
		numeros2[3]=400;
		numeros2[4]=500;
		System.out.println(numeros2[2]);
		int suma = numeros2[2]+numeros2[3];
		System.out.println(suma);
		//para reemplazar un valor en el arreglo se debe sobreescribir
		
		//Declarar a otro array de numeros enteros
		int [] numeros3=new int[3];
		
		int [] arrayDeArrays= new int [2];
		
		arrayDeArrays[0]=suma;
		
		//Declarar un array con los valores asignados desde un inicio	
		int [] enteros= {100,200,300,400,500};
		//podemos reemplazar valores de este array 
		//pero no podemos seguir añadiendo valores
		enteros[2]=1000;
		System.out.println(enteros[2]);
		for (int i=0;i<enteros.length;i++) {
			System.out.println("La posición "+(i+1)+" tiene almacenado el valor "+enteros[i]);
		}
		
		//para recorrer o imprimir todas las posiciones del array 
		//existe otro ciclo llamado for each
		for (int i :enteros) {
			System.out.println(i);
		}
	}

}
