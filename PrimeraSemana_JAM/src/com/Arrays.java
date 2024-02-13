package com;

public class Arrays {

	public static void main(String[] args) {


		/*
		 * Arrays, tambi�n conocidos como vectores
		 * 
		 * Son una estructura que nos permite almacenar varios elementos de 
		 * un tipo de datos en com�n
		 * 
		 * Su desventaja es que estas estructuras no pueden crecer en tiempo de ejecuci�n
		 * 
		 */
		
		//Ejemplo para declarar un array de n�meros enteros
		int [] numeros; //Array declarado sin valores asignados ni tama�o
		
		//Ejemplo de declarar un array con su tama�o declarado, es decir, su longitud
		int [] numeros2 = new int[5]; //Capaz de almacenar 5 n�meros distintos
		
		char[] caracteres = new char[8];
		
		String [] cadenas = new String[10]; 
		
		//A�adir elementos a un array con su tama�o declarado
		//[0][1][2][3][4] as� se ver�a para n�meros2
		numeros2[0] = 100;
		numeros2[1] = 200;
		numeros2[2] = 300;
		numeros2[3] = 400;
		numeros2[4] = 500;
		
		//Si quiero imprimir un determinado valor en consola de mi arreglo
		//debo llamarlo a esa posici�n
		System.out.println(numeros2[3]);
		int suma = numeros2[2]+numeros2[3];
		System.out.println(suma);
				
		//A�adir elementos al array string
		cadenas[0] = "Hoola a todos";
		cadenas[1] = " bonita ma�ana";
		System.out.println(cadenas[0]+cadenas[1]);
		
		//Se puede reemplazar el valor de una cadena
		cadenas[0] = "Buena tarde";
		System.out.println(cadenas[0]);
		
		//Declaramos un nuevo arrays de numero para comprobar si se puede crear un array a base de otros
		int[] numeros3 = new int[3];
		
		int[] arrayDeArrays = new int[2];
		arrayDeArrays [0] = numeros2[3]; //NO podemos guardar  un array completo pero s� posiciones de otros arrays
		arrayDeArrays [1] = suma; //Tambien podemos guardar otras variables
		
		//Ejemplo para declarar arrays con valores ya asignados desde un inicio
		
		int[] enteros = {100, 200, 300, 400, 500};//Array declarado con longitud de 5 y valores asignados
		
		//Para imprimir todos los valores dentro de un arreglo podemos utilizar un ciclo
		for (int i = 0; i < enteros.length; i++) {
			System.out.println(enteros[i]);
		}
		
		//Para recorrer o imprimir todas las posiciones del array
		//existe tambi�n el ciclo for each
		for (int i:enteros) { //Importante declarar la variable i seg�n el tipo de variable a recorrer, es decir
			System.out.println(i); //si es de tipo string tendr�a que ser String i:"nombre del string"
		}
	}

}
