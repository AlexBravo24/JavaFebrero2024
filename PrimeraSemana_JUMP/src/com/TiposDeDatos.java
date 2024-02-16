package com;

public class TiposDeDatos {

	//Comentarios de una olo linea
	//uziel
	
	public static void main(String[] args) {
		//Para crear el metodo main
		//El atajo es main + ctrl + espacio
		//El metodo main o principal es un  punto
		//de entrada para ejecutarla logica de una
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
		// un valor a la variable numero1
		
		numero1=127;
		
		//Declarar las variables con su valor 
		//asignado desde un inicio
		byte b = 110; //1 byte de memoria -127 a 128
		short sh = 32767; //2 bytes de memoria
		
		int i = b+sh; //4 bytes de memoria int i = 32877;
		int numero2=214783647;
		long numero3 = 2147483649L; //8 bytes
		// y nesesita del subfijo "L" para almacenar
		//los valores
		
		//La variable comodin mas utilizada es
		//la de tipo int
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS EN PUNTO O COMA FLOTANTE
		 * (DECIMALES)
		 */
		
		float f = 3.1416867865659F; // 4 BYTES y nesesitan el
		//subfijo para alamacenar los  valores
		
		double d = 3.141612843073; // 8 BYTES
		
		//El tipo de dato mas utilizado para decimales 
		//es el tipo double
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * Booleanos
		 * Caracter
		 * 
		 */
		
		boolean evalua = true; //Solo podemos almacenar 
		//valores true or false. Son utiles para
		//evaluar condiciones o expresiones
		
		char caracter = 'a';//Podemos almacenar 
		//solo un caracter entre comilla simple 
		//Pueden ser simbolos, letras, numeros, espacios
		//etc.
		
		//Una forma de declarar varias variables, del mismo
		//tipo de datos
		int y, z, w;
		y=10;
		z=20;
		w=30;
		
		//Los nombres de las variables no pueden repetirse
		//aunque contengan un tipo de dato distinto
		//char y;
		
		/*TIPOS DE DATOS NO PRIMITIVO
		 * TIPOS DE DATOS ESTRUCTURADOS/OBJETO
		 * Los reconocemos porque su nombre inicia 
		 * con letra mayuscula, es decir, es una "clase"
		 * y posteriormente declaramos el nombre de la
		 * variable
		 * Clase variable;
		 * 
		 */
		
		//Cadena de texto - nos permiten almacenar
		//cadenas de texto o secuencias de caracteres
		String saludo = "Hola mundo";
		String nombre = "Juan Uziel Maya Porcayo";
		
		//Tipos de dato envoltorio o Wrapper
		//Son tipos de datos que envuelven a los
		//primitivos para ototgarles ciertos
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
		
		//Dos formas de escribir la linea Sysrem.out.println
		//rapidamente
		//syso + ctrl + espacio
		//sout + ctrl + espacio
		System.out.println(saludo);
		
		//Ejemplo de imprimir la suma de dos numeros
		System.out.println(y+z);
		
		//Ejemplo de imprimr un mensaje y una operacion
		//Concatenacion
		System.out.println("Resultado = "+ (y+z));
		
	}//Cierre del main
	
}//Cierre de la clase
