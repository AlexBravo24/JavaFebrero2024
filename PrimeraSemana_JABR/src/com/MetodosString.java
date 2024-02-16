package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//Métodos o funcionalidades de la clase
		//String
		
		//Declarar una cadena de texto
		String nombre = "Eduardo Argote";
		
		//.length() - devuelve el tamaño en valor entero
		//de nuestra cadena de texto
//		int longitud = fecha.length(); //27
//		System.out.println(longitud);
		
//		//.charAt() - Nos devuelve el caracter
//		//que se encuentra en una determinada posicion
//		System.out.println(nombre.charAt(nombre.length()-1));
//		System.out.println(nombre.length());
		
//		//.substring() - nos devuelve una subcadena
//		//a partir del indice especificado
//		System.out.println(nombre.substring(3));
//		System.out.println(nombre.substring(3, 13));
//		
//		//.toLowerCase()/.toUpperCase()
//		//Convierte a minusculas/mayusculas la cadena de texto
//		System.out.println(nombre.toUpperCase());
//		System.out.println(nombre.toLowerCase());
//		
		//.equals() - compara el valor de un objeto contra
		//otro - este metodo es sensible a mayusculas y minusculas
		//System.out.println(nombre.equals("Eduardo Argote"));
		
		//.equalsIgnoreCase - ignora el uso de mayusculas/minusculas
//		System.out.println(nombre.equalsIgnoreCase("EdUaRdO aRgOtE"));

		//boolean compara = nombre.equalsIgnoreCase("hoy es 7 de febrero de 2024");
//		
//		int longitud = fecha.length(); //27
//		
		//.replace() - reemplazar las apariciones de un texto o caracter
		//con otro que indiquemos
		System.out.println(nombre.replace("Argote", "Chavez"));
		System.out.println(nombre.replace("o", "$"));
		System.out.println(nombre.replace(" ", "?"));
	}

}
