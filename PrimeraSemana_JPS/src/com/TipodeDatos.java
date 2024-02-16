package com;

public class TipodeDatos {
     // Comentario una linea
	 //Hossh
	
	public static void main(String[] args) {
		//  Para crear el metod main
		//El atajo es main + ctrl+espacio
		//El metodo main o principal es un punto 
		//de entrada para ejecutar la logica de una clase 
		/* comentario que cierra 
		 * con multiples lineas de 
		 * mensaje
		 */
	/*TIPOS DE DATOS PRIMITIVOS 
	 * NUMERICOS ENTEROS 
	 * 
	 */
	//Declarar variables de este tipo de datos
		//pero sin asignarile valor
		
		byte numero1;
		
		//Ejemplo, puedo asignar posteriormente
		// un valor a la variable numero1 
		
		numero1 = 127;
		
		//Declarar las variables con su valor 
		//asignando desde un inicio
		byte b = 110; // 1 byte de memoria  -128 a 127
		short sh = 32767; // 2 bytes de memoria 
		
		int i = b+sh; // 4 bytes de memoria de int i = 32877
		int numero2 = 2147483647;
		long numero3 = 2147483649L; //8 bytes
		// y necesita del sufijo 'L' para almacenar los valores
		//La variable comodin m[as utilizada es la de tipo int
		
		/*
		 *TIPOS DE DATOS PRIMITIVOS
		 *numericos en punto o coma flotante
		 *(decimales) 
		 */
		float f = 3.1416F; // 4 BYTES y necesitan en
		//el sufijo F para almacenar los valores
		
		double d = 3.1416; // 8 BYTES  
		
		//El tipo de dato mas utilizado para decimales 
		// es el tipo double.
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * Booleanos 
		 * Caracter
		 * 
		 */
		
		boolean evalua = false; // Solo podemos almacenar true or false. 
		//Son utiles
		//para evaluar condiciones o expresiones 
		
		char caracter = 'a' ; //Podemos almacenar
		//solo un caracter entre comilla simple
		//pueden ser simbolos, espacios, letras, numeros, espacios.
		//etc.
		
		// Una forma de declarar varias variables, del mismo
		//tipo de dato 
		int y, z, w;
		
		y=10;
		z=20;
		w=30;
		
		//Los nombres de las variables no pueden repetirse
		//aunque contengan un tipo de dato distinto 
		//char y;
		
		/*TIPO DE DATO NO PRIMITIVO
		 * TIPOS DE DATOS ESTRUCTURADOS/OBJETO 
		 *Los reconocemos porque su nombre inicia con
		 *letra mayuscula, es decir, es una "Clase"
		 *variable
		 *Clase variable;
		 * 		
		 */
		
		//Cadena de Texto - nos permiten almacenar 
		//cadenas de texto o secuencias de caracteres
		String saludo = "Hola mundo";
		String nombre = "Joshua Perez Sanchez";
		
		//Tipo de dato envoltorio o Wrapper
		//Son tipos de datos que envuelven a los 
		//primitivos para otorgarles ciertos
		//comportamientos
		Byte b1 = 127;
		b1.toString();
		
		//Tambien estan aparte de Byte
		/*Short
		 * Integer
		 * Long
		 * Float
		 * Double
		 * Character
		 * Boolean
		 * 
		 */
		//Darle salida a mis datos en la consola a mis datos
		//Presentarlos 
		
		//Ejemplo de imprimir en consola una frase "Hola mundo"
		System.out.println("Hola mundo");
		
		//Ejemplo de imprimir alguna variable declarada
		//previamente
		System.out.println(nombre);
		
		//Dos formas de escribir la linea System.out.println
		//rapidamente 
		//syso+ctrl+espacio
		//sout+control+espacio
		System.out.println(saludo);
		
		//Ejemplo de sumar o imprimir suma de dos numeros 
		System.out.println(y+z);
		
		//Ejemplo de imprimir la suma de dos numeros 
		System.out.println("resultado = " + (y+z));
		
	 
		
	} //cierre de main 
	
	
	
	//DIA 1 Y 2 SEMANA 1 
	
	
}
