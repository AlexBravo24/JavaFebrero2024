package com;

public class TiposDeDatos {

public static void main(String[] args) {
	//Para crear el metodo main
	//El atajo es main + ctrl + espacio
	//El metodo main o principal es un punto
	// de entrada para ejecutar la logica de una 
	//clase
	
	/*comentarios de 
	 * multiples
	 * lineas
	 * 
	 * ctrl + s para guardar cambios
	 */
	/*TIPOS DE DATOS PRIMITIVOS
	 * NUMERICOS ENTEROS
	 * 
	 */
	//Declarar variable de este tipo de de datos
	//pero sin asignarles valor
	
	byte numero1;
	
	//Ejemplo, puedo asignar posteriormente
	//un valo a la  variable numero1
	
	numero1=127;
	
	//Declarar las variables con su valor
	//asignado dede el inicio
	
	byte b=110; // 1 byte de memoria -127 a 127
	
	short sh= 32767; //2 byte de memoria 
	
	int i = b + sh; // 4 byte de memoria inte i =32877;

	int numero2=2147483647;
	long numero3=214748364732L;// 8 byte 
	// y necesita del sufijo "L" para almacenar
	//los valores
	
	//La variable comodin mas utilizada es
	// la de tipo int
	
	/*TIPOS DE DATOS PRIMITIVOS 
	 * NUMERICOS EN PUNTO O COMA
	 * (DECIMALES)
	 */
	float f = 3.1416f; //4 BYTES y necsitan el
	//sufijo F para almacnar los valores
	
	double d = 3.141612843073; // 8 BYTES
	
	//El tipo de dato mas utilizado para decimales 
	//es el tipo double
	
	/*TIPOS DE DATOS PRIMITIVOS
	 * Boleanos
	 * Cararcter
	 * 
	 */
	boolean evalua = true;//Solo podemos almacenar 
	//valores true or false. son utiles para
	//evaluar condiciones o expresiones
	
	char cararcter = 'a';// Podemos almacenar 
	//Solo un caracter entre comilla simple
	//pueden ser simbolos, letras, numeros, espacios
	//ect.
	
	//Una forma de declarar varias variables, del mismo 
	//tipo de dato
	int y, z, w;
	y=10;
	z=20;
	w=30;
	
	//Los nombres de las variables no pueden repetirse
	//aunque contengan un tipo de dato distinto
	//ejemplo char y;
	
	/*TIPOS DE DATO NO PRIMITIVO
	 * TIPOS DE DATOS ESTRUCTURADOS/OBJETO
	 * Los reconocemos porque su nombre inicia con
	 * Letra mayuscula, es decir, es una "clase"
	 * y posteriormente declaramos el nombre de la 
	 * variable 
	 * clase variable;
	 * 
	 */
	
	// Cadena de Texto - nos permiten almacenar
	//cadenas de texto o secuencia de caracteres
	String saludo ="hola mundo";
	String nombre = "saul Fuentes Rosales";
	
	//Tipos de dato envoltorio o wrapper
	//Son tipos de dato que envuelven a los 
	//primitivos para otorgarles ciertos
	//comportamientos
	Byte b1 = 127;
	b1.toString();
	
	/*Short
	 * Integer
	 * long
	 * Float
	 * Double
	 * Boolean
	 */
	
	//Darle salida en la consola a mis datos
	//presentarlos
	 
	//Ejemplo de imprimir en la consoloa una frase "hola mundo"
	System.out.println("hola mundo");
	
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
	//concatenacion
	System.out.println("resultado = " + (y + z));
}// Cierre del main
	
}//Cierre de la clase
