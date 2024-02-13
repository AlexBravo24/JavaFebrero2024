package com;

public class MetodosString {

	public static void main(String[] args) {
	
		//Metodos de la clase String
		//Declaramos una cadena de texto
		
		String fecha = "Hoy es 7 de febrero de 2024";
		
		//.length () --- devuelve el tamaño en valor entero de nuestra cadena de texto,
		//cuenta los espacios tambien
	
		System.out.println(fecha.length());
		
		//.charAt --- guarda la posicion del caracter -1 (el conteo comienza en 0)
		
		System.out.println(fecha.charAt(12));
		
		//.substring() --- no devuelve una subcadena a partir del indice especificado, para el de 
		//entrada es donde comienza
		//fin corta antes de llegar al solicitado
		
		System.out.println(fecha.substring(6, 27));
		
		//.toLowerCase() / .toUpperCase()
		//Convierte todo a minusculas o mayusculas
		
		System.out.println(fecha.toLowerCase());
		
		System.out.println(fecha.toUpperCase());
		
		//.equals() --- compara el valor de un objeto contra otro
		
		System.out.println(fecha.equals("hoy es 7 de febrero de 2024"));
		
		//.equalsIgnoreCase - compara ignorando uso de mayusculas y minusculas
		
		System.out.println(fecha.equalsIgnoreCase("hoy es 7 de febrero de 2024"));
		
		boolean compara = fecha.equalsIgnoreCase("hoy es 7 de febrero de 2024");
		
		//.repalce () --- remplaza un texto con otro que indiquemos
		System.out.println(fecha.replace("2024", "2025"));
		System.out.println(fecha.replace("o", "&"));
		System.out.println(fecha.replace(" ", "_"));
	}
	
}
