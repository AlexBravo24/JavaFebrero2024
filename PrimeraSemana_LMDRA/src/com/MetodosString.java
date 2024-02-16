package com;

public class MetodosString {

	public static void main(String[] args) {
		// Métodos o funcionalidades de la clase String
		//Declaramos una cadena de texto 
		String fecha= "Hoy es 7 de Febrero de 2024";
		//.length, devuelve el tamaño en valor entero de nuestra cadena de texto
		System.out.println(fecha.length());
		//.charAt() - Nos devulve el caracter en determinada posición
		System.out.println(fecha.charAt(1));
		/*Metodo .substring() - nos devuelve una subcadena
		 *a partir del indice especificado*/
		System.out.println(fecha.substring(7));
		System.out.println(fecha.substring(7,20));
		
		//.tolowerCase()/toUpperCase()
		//Convierte a minusculas/mayusculas la cadena de texto
		System.out.println(fecha.toLowerCase());
		System.out.println(fecha.toUpperCase());
		
		//.equals()- compara el valor de un objeto contra otro
		//este metodo es sensible a mayusculas y minusculas
		System.out.println(fecha.equals("hoy es 7 de febrero de 2024"));
		//.equalsIgnoreCase - ignora el uso de mayusculas y minusculas
		System.out.println(fecha.equalsIgnoreCase("hoy es 7 de febrero de 2024"));
		
		//.replace - reemplaza un texto o caracter por otro que se indique
		System.out.println(fecha.replace("2024", "2025"));
		System.out.println(fecha.replace("o", "$"));
		System.out.println(fecha.replace(" ", "/"));
	}

}
