package com;

public class Arrays {

	public static void main(String[] args) {
		
		// Arrays o arreglos, tambien conocidos en ocasiones
		//como vectores, son una estructura que nos permite 
		//almacenar varios elementos
		//de un tipo de datos en comun
		//Su desventaja es qe estas estructuras no pueden
		//crecer en tiempo de ejcucion 
		
		//Ejemplo de declarar un Array de numeros enteros
		//sin valores asignados ni tamano declarado
		int [] numeros;
		
		//Ejemplo de declarar un array con su tama;o 
		//declarado(longitud)
		int [] numeros2 = new int[6];
		
		char [] caracteres = new char[20];
		
		String [] cadenas = new String[10]; 
		
		//anadir elementos a un array con su tamano declarado
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
		
		//Anadirelementos al array de Strings
		cadenas[0]="Holamundo x 1000000";
		cadenas[1]="A";
		
		System.out.println(cadenas[0]);
		//remprazar el valor en cadenas[0]
		cadenas[0]="Alumnos";
		System.out.println(cadenas[0]);
		
		//Delcarar otro array de numeros enteros 
		int [] numeros3 = new int[3];
		
		int[] arrayDeArrays = new int[2];
		arrayDeArrays[0]=suma;
		
		//Ejemplo de declarar un array ya con valores
		//asignados desde un inicio
		int[] enteros = {100,200,300,400,500};
		
		//Podemos remplazar valores de este nuevo array
		//pero no podemos seguir anadiendo elementos
		enteros[2]=1000;
		System.out.println(enteros[2]);
		
		for (int i = 0; i >0 ; i--) {
			System.out.println(enteros[i]);
			
			
		}
		
		//para recorrer o imprimir todas las posiciones 
		//del array, existe otro ciclo llamado for each
		
		for (int i:enteros) {
			System.out.println(i);
		}

	}

}
