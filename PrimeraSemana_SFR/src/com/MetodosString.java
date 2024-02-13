package com;

public class MetodosString {

	public static void main(String[] args) {
	
		//Metodos o funcionalidades de la clase 
		//String
		
		//Declarar una cadena de texto
		String fecha = "Hoy es 7 de Febrero de 2024";
		
		//.length() - devuelve el tamaño en valor entero
		// de muestra cadena de texto
		System.out.println(fecha.length());

		//.charAT() - Nos Devuelve el caracter
		//que se encuentra en una determinada posicion
		System.out.println(fecha.charAt(1));
		
		
	//.substring() - nos devuelve una subcadena 
	//a partir del indice especificado
		System.out.println(fecha.substring(5));
		System.out.println(fecha.substring(5, 20));
		
		//.toLOwerCase()/.toUpperCasa()
		//Convierte a minuscula/mayusculas la cadena de texto
		System.out.println(fecha.toUpperCase());
		System.out.println(fecha.toLowerCase());
		
		//.equals() -compara el valor de un objeto contra
		//otro
      System.out.println(fecha.equals("hoy es 7 de febrero de 2024"));
      
    //.equalsIgnoreCase - Ignora el uso de mayuscula/minusculas
  	
  	System.out.println(fecha.equalsIgnoreCase("hoy es 7 de febrero de 2024"));
	
	boolean compara = fecha.equalsIgnoreCase("hoy es 7 de febrero de 2024");
  	
  	int longitud = fecha.length(); //27
  	
  	//.replace() -remplazar las apariciones de un texto o caradter
  	//con otro que indiquemos
  	System.out.println(fecha.replace("2024", "2025"));
  	System.out.println(fecha.replace("o", "$"));
  	System.out.println(fecha.replace(" ", ""));
  	
  	
  	
	}
       
	


}
