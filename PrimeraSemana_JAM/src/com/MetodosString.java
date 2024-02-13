package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//Métodos o funcionalidades de la clase String
		
		//Declaramos una cadena de texto
		String fecha = "Hoy es 7 de Febrero de 2024";
		
		//Método .leng() - Nos devuelve el tamaño en valor entero del String
		System.out.println("La cadena tiene: "+(fecha.length())+" caracteres"); //El metodo me devuelve el tamaño del String
		
		//Método .chartAt() - Nos devuelve el caracter que se encuentra en determinada posición, hay que marcar el índice (posición del caracter)
		// Si ponemos .chartAt(0) nos regresa el PRIMER caracter
		
		System.out.println(fecha.charAt(1)); //Me va a devolver la letra "O" de la cadena porque está en la POSICIÓN 1
		System.out.println(fecha.charAt(fecha.length()-1)); //Nos devolvera la última posición de la cadena, útil cuando no conocemos la longitud

		//Método .subString() - Nos devuelve una sub cadena del índice específicado
		System.out.println(fecha.substring(5)); //Nos muestra la cadena a partir del índice 5
		System.out.println(fecha.substring(5, 20)); //Nos muestra la cadena a partir del índice 5 y hasta el índice 20, no muestra el caracter 20 sino el 19, uno antes
		
		//Método .lowerCase(); Convierte a minúsculas
		//Método .upperCase(); Convierte a mayúsculas
		System.out.println(fecha.toUpperCase());
		System.out.println(fecha.toLowerCase());
		
		//Método .equals(); Nos compara el valor de un objeto contra otro, es sensible a mayúsculas y minúsculas
		System.out.println(fecha.equals("hoy es 7 de febrero de 2024"));
		
		//Método - equalsIgnoreCase(); Nos compara el valor de un objeto contra otro ignorando el uso de mayúsuclas o minúsculas, nos importa el contenido
		System.out.println(fecha.equalsIgnoreCase("hoy es 7 de febrero de 2024"));
		
		//Método - .replace(); - Reemplaza las apariciones de un texto o caracter con otro que indiquemos
		System.out.println(fecha.replace("2024", "2025"));
		System.out.println(fecha.replace("e", "&"));
		System.out.println(fecha.replace(" ", "."));
	}

}
