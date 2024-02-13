package com;

public class TiposDeDatos {

	//Comentarios de una sola linea
	
	public static void main(String[] args) {
		// para crear el método main
		//El atajo es main + ctrl + espacio
		//El método main o principal es un punto
		//de entrada para ejecutar la lógica de una
		//clase
		
		/*Comentarios
		 * de
		 * múltiples
		 * líneas
		 * 
		 * 
		 * ctrl + s para guardar cambios
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
			byte b = 110;  //1 byte de memoria -128 a 127
			short sh = 32767;
			
			int i = b+sh;  //4 bytes de memoria inte i= 32877
			int numero2= 2147483647;
			long numero3 = 2147483649L; //8 bytes 
			// y necesita del sufijo "L" para almacenar los valores
			
			//La variable comodín más utilizada es la de tipo int
			
			/*TIPOS DE DATOS PRIMITIVOS
			 * Númericos en punto o coma flotante
			 * (Decimales)
			 */
			
			float f = 3.1416F; //Ocupan 4 bytes y necesitan el sufijo F
			// para almacenar los valores
			
			double d = 3.1416; //Tienen 8 bytes de memoria
			
			//El tipo de dato más utilizado para decimales es el tipo double
			
			/*TIPOS DE DATOS PRIMITIVOS
			 * Booleanos
			 * Caracter
			 * 
			 */
			
			boolean evalua = true; //Solo podemos almacenar valores true
			// or false. Son utiles para evalauar condiciones o expresiones
			
			char caracter = 'a'; //Puede ser una letra, numero, simbolo o espacio
			
			//Una forma de declarar varias variables del mismo tipo de dato
			int y, z, w;
			y=10;
			z=20;
			w=30;
			
			//Los nombres de las variables no pueden repetirse aunque 
			//contengan un tipo de dato distinto char y; 
			
			/*TIPOS DE DATOS NO PRIMITIVO
			 * TIPOS DE DATOS ESTRUCTURADOS/OBJETO
			 * Los reconocemos porque su nombre inicia con letra mayuscula,
			 * es decir, es una "clase" y posteriormente declaramos el nombre
			 * de la variable
			 * Clase variable;
			 * 
			 */
			
			//Cadena de texto - nos permite almacenar cadenas de texto
			//o secuencias de caracteres
			String saludo = "Hola, mundo";
			String nombre = "José de Jesús Bravo Aguilar";
			
			//Tipos de dato envoltorio o Wrapper
			//Son tipos de datos que envuelven a los primitivos 
			//para otorgarles ciertos comportamientos
			
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
			
			//Ejemplo de imprimir en consola una frase "Hola, mundo"
System.out.println("Hola, mundo");

			//Ejemplo de imprimir una variable declarada previamente
System.out.println(nombre);

			//Dos formas de escribir la linea system.out.println rapidamente
			// syso + ctrl + espacio
			// sout + ctrl + espacio
System.out.println(saludo);

			//Ejemplo de imprimir la suma de dos números
System.out.println(y+z);
			//también sirve para otras operaciones
System.out.println(y*z);

			//Ejemplo de imprimir un mensaje y una operación
System.out.println("Resultado = " + y+z);
			//Concatenación - añade los valores en la misma línea
			// ponemos entre parentesis para mostrar la suma
System.out.println("resultado = " + (y+z));








			
			
		
	}//cierre del main
		
	}//Cierre de la clase

