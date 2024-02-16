package com;

public class TiposDeDatos {
	
	//Comentarios de una sola linea
	//alex
	
	public static void main(String[] args) {
		// Para crear el métod main
		//El atajo es main + ctrl + espacio
		//El método main o principal es un punto
		//de entrada para ejecutar la lógica de una
		//clase
		
		/*Comentarios
		 * de
		 * multiples
		 * lineas
		 * 
		 * 
		 * Ctrl + s para guardar cambios
		 */
		
	/*TIPOS DE DATOS PRIMITIVOS
	 * NUMERICOS ENTEROS	
	 */
	
	//Declarar variables de este tipo de datos
		//pero sin asignarles valor
		
		byte numero1;
		
		//Ejemplo, puedo asignar posteriormente
		//un valor a la variable numero1
		
		numero1=127;
		
		//Declarar las variables con su valor
		//asignado desde un inicio
		byte b = 110; //1 byte de memoria -128 a 127
		short sh = 32767; //2 bytes de memoria
		
		int i = b+sh; //4 bytes de memoria int i= 32877;
		int numero2= 2147483647;
		long numero3 = 2147483649L; //8 bytes 
		// y necesita del sufijo "L" para almacenar
		//los valores
		
		//La variable comodin más utilizada es
		//la de tipo int
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS EN PUNTO O COMA FLOTANTE
		 * (DECIMALES)
		 */
		
		float f = 3.1416867865659F; //4 BYTES y necesitan el
		//sufijo F para almacenar los valores
		
		double d = 3.141612843073; //8 BYTES
		
		//El tipo de dato más utilizado para decimales
		//es el tipo double
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * Booleanos
		 * Caracter
		 * 
		 */
		
		boolean evalua = true; //Solo podemos almacenar
		//valores true or false. Son utiles para
		//evaluar condiciones o expresiones
		
		char caracter  = 'a'; //Podemos almacenar
		//solo un caracter entre comilla simple
		//Pueden ser simbolos, letras, numeros, espacios
		//etc.
		
		//Una forma de declarar varias variables, del mismo
		//tipo de dato
		int y, z, w;
		y=10;
		z=20;
		w=30;
		
		//Los nombres de las variables no pueden repetirse
		//aunque contengan un tipo de dato distinto
		//char y;
		
		/*TIPOS DE DATO NO PRIMITIVO
		 * TIPOS DE DATOS ESTRUCTURADOS/OBJETO
		 * Los reconocemos porque su nombre inicia con
		 * letra mayúscula, es decir, es una "clase"
		 * y posteriormente declaramos el nombre de la
		 * variable
		 * Clase variable;
		 * 
		 */
		
		//Cadena de Texto - nos permiten almacenar
		//cadenas de texto o secuencias de caracteres
		String saludo = "Hola mundo";
		String nombre = "Jorge Alejandro Bravo Ramirez";
		
		//Tipos de dato envoltorio o Wrapper
		//Son tipos de dato que envuelven a los
		//primitivos para otorgarles ciertos
		//comportamientos
		Byte b1 = 127;
		b1.toString();
		
		/*Short
		 * Integer
		 * Long
		 * Float
		 * Double
		 * Character
		 * Boolean
		 * 
		 */
		
		//Darle salida en la consola a mis datos
		//Presentarlos
		
		//Ejemplo de imprimir en consola una frase "Hola mundo"
		System.out.println("Hola mundo");
		
		//Ejemplo de imprimir alguna variable declarada
		//previamente
		System.out.println(nombre);
		
		//Dos formas de escribir la linea System.out.println
		//rapidamente
		//syso + ctrl + espacio
		//sout + ctrl + espacio
		System.out.println(saludo);
		
		//Ejemplo de imprimir la suma de dos numeros
		System.out.println(y+z);
	
		//Ejemplo de imprimir un msj y una operacion
		//Concatenacion
		System.out.println("Resultado = " + (y+z));
		
	}//Cierre del main
	
}// Cierre de la clase
