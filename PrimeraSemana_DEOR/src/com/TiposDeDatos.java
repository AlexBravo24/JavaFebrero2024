package com;

public class TiposDeDatos {

	public static void main(String[] args) {
		/*para crear el metodo main
		 * es atajo es main + ctrl + espacio
		 * el metodo main es un punto de entrada para ejecutar la logica de la clase
		 */
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * Numericos enteros
		 */
		
		//Declarar variables de este tipo de datos sin asignar valor
		
		byte numero1;
		numero1=127;
		
		//Declarar variables con valor desde el inicio
		byte numero2=110; //1 byte de memoria
		short sh=32767; //2 bytes de memoria 
		
		int i = numero2+sh; //4 bytes de memoria
		int numero3=2147483647;
		long numero4=2147483649l; //necesita del sufijo "l" para almacenar valores
		
		//la variable mas comun es de tipo entero "int"
		
		/*TIPOS DE DATOS PRIMITIVOS DECIMALES
		 */
		
		float f =3.1416f; //4 bytes de memoria
		 
		double d=3.1416; //8 bytes de memoria
		
		//la variable mas comun es de tipo double "double"
		
		boolean evalua = true; //condiciones o expresiones
		
		char caracter= 'a'; //se coloca con comilla simple puede ser simbolo, letra, numeros y espacios.
		
		
		//Declarar varias variables del mismo dato
		int y=2, z=10, w=50;
		//Las variables no pueden repetirse 
		
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 * Tipos de datos estructurados/objeto
		 * Los reconocemos porque su nombre inicia con letra mayuscula y posteriormente declaramos el 
		 * nombre de la variable
		 * 
		 * Clase variable;
		 */
		
		//CADENA DE TEXTO
		
		String saludo = "Hola mundo";
		String nombre = "Diego Eduardo Orozco Rios";
		
		/*Tipos de dato envoltorio o Wrapper
		 * Otorgar ciertos comportamientos 
		 */
		 
		Byte b1 =127;
		b1.toString();
		
		/*SIEMPRE LA PRIMERA CON MAYUSCULA
		 * Short
		 * Integer
		 * Long
		 * Float
		 * Double
		 */
		
		//Imprimir datos SOUT o SYSO
		System.out.println("Hola mundo");
		System.out.println(saludo);
		System.out.println(nombre);
		
		System.out.println("El resultado de y + z es: "+ (y+z));
	}
}
