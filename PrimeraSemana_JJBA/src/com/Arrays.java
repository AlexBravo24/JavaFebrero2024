package com;

public class Arrays {

	public static void main(String[] args) {
		
		//Arrays o arreglos, tabién conocidos en ocasiones como
		//vectores, son una estructura que nos permite almacenar
		//varios elementos de un tipo de datos en común.
		//Su desventaja es que estas estructuras 
		//no pueden crecer en tiempo de ejecución.
		
		//Ejemplo de declarar un array de números enteros
		//sin valores asignados, ni tamaño declarado
		int [] numeros;
		
		//Ejemplo de declarar un array con su tamaño declarado (longitud)
		int [] numeros2 = new int [5];
		
		//Se puede hacer con caracteres.
		char [] caracteres = new char [20];
		
		//También con cadenas.
		String [] cadenas = new String[10];
		
		//Añadir elementos a un array con su tamaño declarado
		//[0] [1] [2] [3] [4] 
		
		numeros2 [0]=100;
		numeros2 [1]=200;
		numeros2 [2]=300;
		numeros2 [3]=400;
		numeros2 [4]=500;
		
		//Si quiero imprimir un determinado valor en consola
		//de mi arreglo, debo llamar a esa posición
		System.out.println(numeros2[3]);
		int suma = numeros2[2]+numeros2[3];
		System.out.println(suma);
		
		//Añadir elementos al array de String
		cadenas [0]="Hola mundo x 1000000";
		cadenas [1]="A";
		
		System.out.println(cadenas[0]);
		//Reemplazar el valor de cadenas
		cadenas[0]= "Alumnos";
		System.out.println(cadenas[0]);
		
		//Declarar otro array de números enteros
		int [] numeros3 = new int[3];
		
		int [] arrayDeArrays = new int[2];
//		arrayDeArrays [0] = numeros2[0]; //no se puede
		arrayDeArrays [0] = suma;
		
		//Ejemplo de declarar un array ya con valores asignados
		//desde un inicio
		
		int [] enteros = {100, 200, 300, 400, 500};
		//Podemos reemplazar valores de este nuevo array
		//pero no podemos seguir añadiendo elementos
		enteros [2] = 1000;
		System.out.println(enteros[2]);
		//Con for podemos imprimir todas las posiciones del array
		for (int i = 0; i < enteros.length; i++) {
			//podemos cambiar el 0 por 4, poner >= 0 y la i--, lo 
			//recorre en reversa
			System.out.println(enteros[i]);
		}
		
		//Para recorrer o imprimir todas las posiciones del array,
		//existe otro ciclo llamado for each
		
		for (int i:enteros) { //Puedo cambiar int por Strings y enteros por 
								//cadenas
			System.out.println(i); //Este recorre todos los elementos, el 
									//anterior podemos elegir donde empezar a recorrer.
		}

	}

}
