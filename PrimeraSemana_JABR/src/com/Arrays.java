package com;

public class Arrays {

	public static void main(String[] args) {
		
		// Arrays o arreglos, también conocidos en ocasiones
		//como vectores, son una estructura que nos permite
		//almacenar varios elementos 
		//de un tipo de datos en común
		//Su desventaja es que estas estructuras no pueden
		//crecer en tiempo de ejecución
		
		//Ejemplo de declarar un array de numeros enteros
		//sin valores asignados ni tamaño declarado
		int [] numeros;
		
		//Ejemplo de declarar un array con su tamaño
		//declarado (longitud)
		int [] numeros2 = new int[6];
		
		char [] caracteres = new char[20];
		
		String [] cadenas = new String[10];
		
		//Añadir elementos a un array con su tamaño declarado
		//[0][1][2][3][4]
		numeros2[0]=100;
		numeros2[1]=200;
		numeros2[2]=300;
		numeros2[3]=400;
		numeros2[4]=500;
		numeros2[5]=600;
		
		//Si quiero imprimir un determinado valor en consola
		//de mi arreglo, debo llamar a esa posicion
		System.out.println(numeros2[3]);
		int suma = numeros2[2]+numeros2[3];
		System.out.println(suma);
		
		//Añadir elementos al array de Strings
		cadenas[0]="Hola mundo x 100000";
		cadenas[1]="A";
		
		System.out.println(cadenas[0]);
		//Reemplazar el valor en cadenas[0]
		cadenas[0]="Alumnos";
		System.out.println(cadenas[0]);
		
		//Declarar otro array de numeros enteros
		int [] numeros3 = new int[3];
		
		int [] arrayDeArrays = new int [2];
		arrayDeArrays[0]=suma;
		
		//Ejemplo de declarar un array ya con valores
		//asignados desde un inicio
		int [] enteros = {100, 200, 300, 400, 500};

		//Podemos reemplazar valores de este nuevo array
		//pero no podemos seguir añadiendo elementos
		enteros[2]=1000;
		System.out.println(enteros[2]);
	
		for (int i = 0; i < enteros.length; i++) {
			System.out.println(enteros[i]);
		}
		
		for (int i = 4; i >=0; i--) {
			System.out.println(enteros[i]);
		}
		
		//Para recorrer o imprimir todas las posiciones
		//del array, existe otro ciclo llamado for each
		
		for (int i:enteros) {
			System.out.println(i);
		}
	}

}
