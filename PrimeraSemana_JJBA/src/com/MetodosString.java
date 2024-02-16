package com;

public class MetodosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//M�todos o funcionalidades de la clase
		//String
		
		//Declarar una cadena de texto
		String fecha = "Hoy es 7 de Febrero de 2024";
		
		//.length() - devuelve el tama�o en valor
		//entero de nuestra cadena de texto
		System.out.println(fecha.length());
		
		//.charAt() - nos devuelve el caracter
		//que se encuentra en una determinada posici�n
		System.out.println(fecha.charAt(26));
		
		//.substring() - nos devuelve una subcadena
		//a partir del �ndice especificado
		System.out.println(fecha.substring(5));
		//Empieza desde el 5 y se salta lo anterior
		System.out.println(fecha.substring(5, 20));
		//Empieza en el 5 y muestra antes del 20, hasta el 19
		
		//.toLowerCase() /.toUpperCase()
		//Convierte a minusculas/mayusculas la cadena de texto
		System.out.println(fecha.toUpperCase());
		System.out.println(fecha.toLowerCase());
		
		//.equals() - Compara el valor de un obeto contra otro
		System.out.println(fecha.equals("Hoy es 7 de febrero de 2024"));
		//Este m�todo es sensible a may�sculas y min�sculas
		
		//.equalsIgnoreCase - ignora el uso de may�sculas y min�sculas
		System.out.println(fecha.equalsIgnoreCase("hoy es 7 de febrero de 2024"));
		
		boolean compara = fecha.equalsIgnoreCase("hoy es 7 de febrero de 2024");
				
		int longitud = fecha.length(); //27
		
		
		//.replace() - reemplazar las apariciones de un texto o caracter
		//con otro que indequemos
		
		System.out.println(fecha.replace("2024", "2025"));
		System.out.println(fecha.replace("o", "$"));
		System.out.println(fecha.replace(" ", "-"));
		
		
		
		
		
		
		
		
		
	}

}
