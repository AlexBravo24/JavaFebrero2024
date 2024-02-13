package com;

public class TiposDeDatos {
	
	//Comentarios de una sola Linea
	//Para crear el metodo main, el atajo es main + ctrl + espacio
	//El metodo main o principal es un punto de entrada para 
	//ejecutar la logica de una clases
	/* 
	 * 
	 * PARA COMENTARIOS LARGOS 
	 * 
	 * TIPOS DE DATOS PRIMITIVOS
	 * NUMERICOS ENTEROS
	 * 
	 * COMO DECLARA VARIABLES DE ESTE TIPO DE DATOS
	 * PERO SIN ASIGNARLE UN VALOR
	 */
	public static void main (String[] args) {
		byte numero1;
		byte numero2;
		int suma;
		//Asignar un valor a la variable numero 1
		
		numero1=127;
		numero2=127;
		
		suma= numero1 + numero2;
		
		/*
		 * declara las variables con su valor, asignador desde un inicio
		 * 
		 */
		byte b = 110;
		byte a = 120;//1 byte de memoria -128 a 127
		
		short sh = 32767; //2 bytes de memoria


		int i = b + sh; //4 byte de memoria int i= 32877;
		int numero3 = 2147483647;
		long numero4 = 2147483649L; // 8 BYTES y necesita del sufijo "L" para almacenar los valores
		
		//La variable comodin mas utilizada es la de tipo int.
		
		/*
		 * TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS EN PUNTO O COMA FLOTANTE
		 * (DECIMALES)
		 */
		float f = 3.1416f;//SE NECESITO AGREGAR EL SUFIJO F PARA ALMACENAR LOS VALORES
		//, Y SON DE 4 BYTES
		
		double d = 3.1416; //8 BYTES
		
		/*
		 * EL TIPO DE DATOS MAS UTILIZADO PARA DECIMALES ES EL TIPO DOUBLE
		 */
		
		
		/*
		 * TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		boolean evalua = true;// SOLO PODEMOS ALMACENAR VALORES TRUE OR FALSE.
		//SON UTILIES PARA EVALUAR CONDICIONES O EXPRESIONES.
		
		char caracter = 'a';//ALMACENA 1 SOLO CARACTER ENTRE COMILLAS SIMPLES,
		//PUEDEN SER SIMBOLOS, LETRAS, NUMERO, ESPACIO
		
		
		/*
		 * FORMA DE DECLARAR VARIAS VARIABLES, DEL MISMO TIPO DE DATOS 
		 */
		int y, z, w;
		y=10;
		z=20;
		w=30;
		
		//LOS NOMBRES DE LAS VARIABLES NO PUEDEN REPETIRSE AUNQUE 
		//TENGO UN TIPO DE DATO DISTINTO
		
		
		
		/*
		 * TIPO DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATOS ESTRUCTURADOS / OBJETO
		 * LOS RECONOCEMOS PORUQE SU NOMBRE INIVIA CON LETRA MAYUSCULA,
		 * ES DECIR, ES UNA "CLASE", Y POSTERIORMENTE DECLARAMOS EL NOMBRE DE LA VARIABLE
		 * 
		 * CLASE VARIABLE;
		 */
		
		
		//CADENA DE TEXTO - NOS PERMITE ALMECENAR CADENAS DE 
		//TEXTO O SECUENCIAS DE CARACTERES
		
		String saludo = "Hola Mundo";
		String nombre = "Alejandro Jimenez Garcia";
		
		/*
		 * TIPOS DE DATO ENVOLTORIO O WRAPPER
		 * SON TIPOS DE DATOS QUE ENVUALVEN A LOS PRIMITIVOS
		 *  PARA OTORGARLES CIERTOS COMPORTAMIENTOS
		 *  
		 */
		Byte b1 = 10;
		b1.toString();
		
		/*
		 * Short
		 * Integer
		 * Long
		 * Float
		 * Double
		 * Character
		 * Boolean
		 */
		
		/*
		 * COMO DARLE SALIDA EN LA CONSOLAA MIS DATOS
		 * PRESENTACION
		 * 
		 * EJEMPLO, IMPRIMIR EN CONSOLA UNA FRASE
		 * "HOLA MUNDO"
		 * 
		 */
		System.out.println("HOLA MUNDO");
		
		//EJEMPLO IMPRIMR UNA VARIABLE DECLARADA PREVIAMENTE
		System.out.println(nombre);
		
		//DOS FORMAS DE ESCRIBIR LA LINEA System.oout.println, rapidamente
		/*
		 * syso + ctrl + espacio
		 * sout + ctrl + espacio
		 */
		System.out.println(saludo);
		
		//EJEMPLO IMPRIMIR LA SUMA DE DOS NUMERO
		System.out.println(y+z);
		//EJEMPPLO DE IMPRIMIR MENSAJE Y OPERACION
		//CONCATENACION
		System.out.println("Resultado = " + (y+z));
	}//Cierre de main
}//cierre de la clase
