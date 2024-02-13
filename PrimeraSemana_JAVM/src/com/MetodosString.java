package com;

public class MetodosString {

	public static void main(String[] args) {
		// MEtodos o funcionalidades de la clase String
		//declarar una cadena de texto
		String fecha = "Hoy es 7 de febrero de 2024";
		
		//.length()   devuelve el tama~o en valor entero de  nuestra cadena de texto
		System.out.println(fecha.length());
		
		//.charAt () - nos devuelve el caracter que se encuentre en una determinada posicion
		System.out.println(fecha.charAt(26));
		
		// .substring()  nos devuelve una subcadena a partir del indice especificado
		System.out.println(fecha.substring(5));
		System.out.println(fecha.substring(5,20));
		
		//.toLowerCase()/. toUpperCase()
		//convierte a minuscilas/mayusculas la cadena de texto
		
		System.out.println(fecha.toUpperCase());
		System.out.println(fecha.toLowerCase());
		
		//.equals()  compara el valor de un objero contra otro, este metodo es sensible a mayusculas y minisculas
		System.out.println(fecha.equals("Hoy es 7 de febrero de 2024"));
		//equalsIgnoreCase  - ignora el uso de mayusculas y minusculas
		
		System.out.println(fecha.equalsIgnoreCase("hoy es 7 de febrero de 2024"));
		
		//.replace/() - remplazar las apariciones de un textp o caracter con otro que indiquemos
		System.out.println(fecha.replace("2024", "2025"));
		System.out.println(fecha.replace(" ","$"));
	}

}
