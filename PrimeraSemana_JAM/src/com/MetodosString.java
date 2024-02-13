package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//M�todos o funcionalidades de la clase String
		
		//Declaramos una cadena de texto
		String fecha = "Hoy es 7 de Febrero de 2024";
		
		//M�todo .leng() - Nos devuelve el tama�o en valor entero del String
		System.out.println("La cadena tiene: "+(fecha.length())+" caracteres"); //El metodo me devuelve el tama�o del String
		
		//M�todo .chartAt() - Nos devuelve el caracter que se encuentra en determinada posici�n, hay que marcar el �ndice (posici�n del caracter)
		// Si ponemos .chartAt(0) nos regresa el PRIMER caracter
		
		System.out.println(fecha.charAt(1)); //Me va a devolver la letra "O" de la cadena porque est� en la POSICI�N 1
		System.out.println(fecha.charAt(fecha.length()-1)); //Nos devolvera la �ltima posici�n de la cadena, �til cuando no conocemos la longitud

		//M�todo .subString() - Nos devuelve una sub cadena del �ndice espec�ficado
		System.out.println(fecha.substring(5)); //Nos muestra la cadena a partir del �ndice 5
		System.out.println(fecha.substring(5, 20)); //Nos muestra la cadena a partir del �ndice 5 y hasta el �ndice 20, no muestra el caracter 20 sino el 19, uno antes
		
		//M�todo .lowerCase(); Convierte a min�sculas
		//M�todo .upperCase(); Convierte a may�sculas
		System.out.println(fecha.toUpperCase());
		System.out.println(fecha.toLowerCase());
		
		//M�todo .equals(); Nos compara el valor de un objeto contra otro, es sensible a may�sculas y min�sculas
		System.out.println(fecha.equals("hoy es 7 de febrero de 2024"));
		
		//M�todo - equalsIgnoreCase(); Nos compara el valor de un objeto contra otro ignorando el uso de may�suclas o min�sculas, nos importa el contenido
		System.out.println(fecha.equalsIgnoreCase("hoy es 7 de febrero de 2024"));
		
		//M�todo - .replace(); - Reemplaza las apariciones de un texto o caracter con otro que indiquemos
		System.out.println(fecha.replace("2024", "2025"));
		System.out.println(fecha.replace("e", "&"));
		System.out.println(fecha.replace(" ", "."));
	}

}
