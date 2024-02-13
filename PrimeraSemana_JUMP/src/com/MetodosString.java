package com;

public class MetodosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Metodos o funcionalidades de la clase 
		//String
		
		//Declarar una cadena de texto 
		String fecha = "Hoy es 7 de febrero de 2024";
		
		//.leng() - devuelve el tamaño en valor entero
		//de nuestra cadena de texto
		System.out.println(fecha.length());
		
		//.charAt() - Nos de devuelve el caracter
		//que se encuentra en una determinada posicion
		System.out.println(fecha.charAt(26));
		
		//.substring() - nos devuelve una subcadena 
		// a partir del indice especificado
		System.out.println(fecha.substring(5));
		System.out.println(fecha.substring(5, 20));
		
		//.toLowerCase()/.toUpperCase()
		//Convierte a minusculas/mayusculas la cadena de texto
		System.out.println(fecha.toUpperCase());
		System.out.println(fecha.toLowerCase());
		
		//.equals() - compara el valor de un objeto contra
		//otro - este metodo es sensible a mayusculas y minusculas
		System.out.println(fecha.equals("hoy es 7 de febrero de 2024"));
		
		//.equalsIgnoreCase - Ignora el uso de mayusculas/minusculas
		System.out.println(fecha.equalsIgnoreCase("hoy es 7 de febrero de 2024"));
		
		boolean compara = fecha.equalsIgnoreCase("hoy es 7 de febrero de 2024"); 
		
		int longitud = fecha.length();
		
		//.replace () - reemplazar las apariciones de un texto o caracter 
		//con otro que indiquemos
		System.out.println(fecha.replace("2024", "2025"));
		System.out.println(fecha.replace("o", "$"));
		System.out.println(fecha.replace(" ", ""));
		

	}

}
