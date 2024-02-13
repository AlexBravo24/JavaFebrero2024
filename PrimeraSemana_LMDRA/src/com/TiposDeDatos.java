package com;

public class TiposDeDatos {
	//comentario
	public static void main(String[] args) {
		// Para crear el metodo main 
		//El atajo es main + ctrl + espacio
		/*El metodo main o principal es un punto 
		 * ctrl + S para guardar cambios
		de entrada para ejecutar la logica de una clase*/
		
	/*Tipos de datos primitivos
	 * NUMERICOS ENTEROS	
	 */
	//Declarar variables de este tipo de datos
		//pero sin asignarles valor
		//ocupa un byte de memoria
		byte numero1;
		byte b=110;
		
		//Ejemplo, puedo asignar posteriormente 
		//un valor a la variable numero1
		numero1=127;//dato maximo
		short numero2;
		numero2=32767;//valor maximo
		//utiliza 2 bytes de memoria
		int i = numero1 + numero2;//utiliza 4 bytes de memoria 
		int numero3 = 2147483647;//valor maximo 2147483647
		long numero4 = 214783649L;//8 bytes
		// necesita del sufijo "L" para almacenar los valores
		
		//La variable comodin más utiolizada es la de tipo int
		
		/*Tipos de datos primitivos
		 * Numericos en punto o coma flotante
		 * (decimales)
		 * */
		float f = 3.1416F;//Los tipo float ocupan 4 bytes y necesita el sufijo f
		
		double d = 3.11416; //8 bytes de memoria
		
		//El tipo de dato mas utilizado para decimales es el tipo double
		
		/*
		 * Tipos de datos primitivos
		 * booleanos 
		 * caracter
		 * */
		
		boolean evalua = true;//solo almacena true or false
		//Evalua condiciones o expresiones
		
		char caracter = 'a';//solo almacena un solo caracter
		//Pueden ser simbolos, letrar, numeros, espacios, etc.
		
		
		/*una forma de declarar varias variables 
		 * del mismo tipo de dato*/
		int y, z, w;
		y=10;
		z=20;
		w=30;
		
		//los nombres de las variables no pueden repetirse
		
		
		/*Tipos de datos No primitivos ó
		 * Tipos de dato estructurados ó
		 * Tipos de dato objeto
		 * los reconocemos porque su nombre inicia con letra mayuscula 
		 * es decir, es una clase y posteriormente declaramos 
		 * el nombre de la variable 
		 * Clase variable;
		 * 
		 */
		// cadena de texto, nos permite almacenar
		// cadenas de texto o secuencia de caracteres
		String saludo = "Hola mundo";
		String nombre ="Luis Manuel";
		
		/*Tipos de dcato envoltorio o wrapper
		 * son tipos de datos que envuelven a los primitivos para otorgarles
		 * ciertos comportamientos*/
		Byte b1 = 10;
		b1.toString();
		
		/* Short
		 * Integer
		 * Long
		 * Float
		 * Double
		 * Boolean*/
		
		//Darle salida en la consola a los datos 
		
		//Ejemplo de imprimir en consola una frase "Hola mundo
		
		System.out.println("Hola mundo");
		//Ejemplo imprimir una variable declarada previamente 
		
		System.out.println(nombre);//ln significa salto de linea
		//Dos formas de imprimir System.out.println rapidamente
		//syso ó sout seguido de ctrl + espacio
		System.out.println(saludo);
		
		//Ejemplo de imprimir operaciones
		System.out.println(y+z);
		
		//Ejemplo de imprimir un mensaje y una operacion
		System.out.println("Resultado = "+ (y+z));
		
		
		
		
	}//Cierre del main
	
}//Cierre de la clase
