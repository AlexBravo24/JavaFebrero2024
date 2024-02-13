package com; //Paquete al cual pertenece la clase

public class TiposDeDatos {
	
	public static void main(String[] args) { //Para crear método main = main + ctrl + space
		
		//El método main es un punto de entrada para ejecutar la lógica de una clase
		
		System.out.println("Hola mundo :)");
		
		/*
		 * Tipo de datos primitivos - Numericos enteros
		 */
		
		byte numero1; //Declaramos la variable pero aun no tiene ningún valor
		numero1 = 12; //Le hemos asignado un valor a nuestra variable
		
		int numero2 = 23456; //De manera directa hemos asignado el valor a nuestra variable
		long numero3 = 12345678901234L; //La variable de tipo long requiere del sufijo L para reconocerlo
		
		//El tipo de datos por excelencia para guardar valores es la de tipo int
		
		
		/*
		 * Valores numéricos con decimales
		 * Tenemos dos tipos de datos numérios con decimales
		 * 	
		 * 	Float, la sintaxis es la siguiente: float x = 3.1416f, ocupan 4 bytes ;
		 * 	Double, almacena aún más decimales que el float, la sintaxis es: double y = 3.1416;, 8 bytes
		 */
		
		float x = 3.1416f;
		double y = 3.1416;
		
		//El tipo de dato por excelencia para guardar valores decimales es el double
		
		/*
		 * Tipos de datos booleanos y caracter
		 * 
		 * Boolean nos reserva únicamente valores verdaderos o falsos
		 * Caracter nos permite almacenar solamente 1 caracter, puede ser cualquiera del código ASCII
		 * 
		 */
		
		boolean evalua = true; //Son útiles para evaluar condiciones o expresiones
		char caracter = 'v'; //Se almacena entre comillas simples
		
		/*Tipos de datos NO primitivo - Estructurados/Objeto
		 * 
		 * Los reconocemos porque su nombre inicia con letra mayúscula, es decir, es una clase
		 * y posteriormente declaramos el nombre de la variable
		 * 
		 * Clase variable;
		 */
		
		//Cadenas de caracteres 
		
		String saludo = "Hola, cómo estás?"; //Guardamos nuestra cadena entre comillas dobles
		System.out.println(saludo);
		
		String nombre = "Jesús Avila";
		System.out.println("Mi nombre es: "+nombre);
		
		//Tipos de datos envoltorio o Wrapper
		//Envuelven a los primitivos para otorgarles ciertos comportamientos
		
		Byte b1 = 120;
		b1.toString(); //Nos regresa el valor numerico en caracter
		
		/*
		 * Short    Float     Boolean
		 * Integer  Double
		 * Long     Character
		 */
		
		//Dar salida a los datos en la consola
		//Tenemos la clase System.out.println(); //Regresar a la línea 9, 59 y 62
		
		//Para concatenar valores de operaciones hay que englobarlos entre paréntesis porque de lo contrario
		//solo estariamos imprimiento el valor númerico de las variables y no las operaciones como tal
		System.out.println("El resultado es: "+(numero1+numero2));
		
	} //Cierre de main
	

} //Cierre de la clase
