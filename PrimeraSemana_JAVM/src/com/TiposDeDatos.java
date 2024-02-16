package com;

public class TiposDeDatos {

	public static void main (String[] args) {
		//Para crear el metodo main
		//atajo main+ ctrl+espacio
		//main o principal es un punto de entrada para ejecutar la logica de unas clase
		/*
		 * Tipos de datos primitivos
		 * numericos enteros
		 */
		
		//declarar variables de este tipo de datos sin asignarles valor
		byte numero1; 
		
		//Ejemplo puedo asignar una variable a la variable 1
		numero1= 127; 
		//declarar las variables con su valor desde un inicio
		
		byte b =110; 
		short sh = 32767;  
		int i = b+sh;
		int numero2= 2147483647;
		long numero3= 2147483649L ; 
		// la variable comodin mas utilizada es la tipo int
		/*tipos de datos primitivos
		 * nujmericos en punto y coma flotante
		 */
			float f = 3.1416F; //4bytes y necesitan el subfijo F para almacenar valores
			double d=3.1416; 
			// el tipo de dato mas utilizado en decimales es el tipo double
			
			/* tipos de datos primitivos
			 * booleanos
			 * caracter
			 */
			boolean evalua = true;//solo almacena valor true o false . Son utiles para evaluar condiciones o expreciones
			
		char caracter = 'a'; // podemos almacenar solo un caracter entre comilla simple ,pueden ser numeros letras espacios etc.
		//una formas de declarar varias variables , del mismo tipo de dato
		int y ,z ,w ; 
		z= 1;
		w= 2;
		//los nombres de las variables no se pueden repertir
		/*tipos de dato no primitivo
		 * TIpos de dato estructurado/objeto
		 * Los reconocemos porque su nombre inicia con letra mayuscula , es decir es una "clase"  y posteriormente declaramos el nombre de la variable 
		 * Clase variable
		 */
		
		//cadena de texto - nos permite almacenar cadenas de texto  o secuencias de texto o secuencias de caracteres
		
		String saludo = "Hola mundo";
		String nombre = " Jorge Vargas";
		
		// tipos de dato envoltorio o wrapper
		//son tipos de datos que envuelven a los primitivos para otorgales ciertos comportamientos
		
		Byte b1;
		//b1.toString();
		/* short
		 * integer
		 * Long
		 * float 
		 * double
		 * Character
		 * Boolean
		 */
		
		// darle salida en la consolo a mis datos
		
		//ejemplo de imprimir en consola 'hola mundo'
		System.out.println("hola mundo");
		
		//ejemplo de escrubir alguna variable declarada previamente
		System.out.println(nombre);
		
		// dos formas de escribir la linea System.out.println rapidamente escribiendo syso + ctrl+ espacio o sout + ctrl+ espacio
		System.out.println(saludo);
		
		//Ejemplo de imprimir la suma de dos numeros
		System.out.println(z+w);
		
		//ejemplo de imprimir un msj y una operacion 
		System.out.println("Resultado = "+ (z+w));
	}
	
}
