package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//METODOS O FUNCIONALIDADES DE LA CLASE String
		//DECLARA UNA CADENA DE TEXTO
		String fecha = "Hoy es 7 de febrero de 2024";
		//metodo 
		/*
		 * .length() - devuelve el tamaño en valor entero de nuestra cadena de texto
		 */
		System.out.println(fecha.length());
		int logitud = fecha.length();
		
		//.charAt() - NOs devuelve el caracter que se encuentra
		//en una determinada posicion.
		System.out.println(fecha.charAt(1));
		
		/*
		 * .substring() - Nos devuelve una sebcadena a partir
		 * del indice especifico
		 * 
		 */
		System.out.println(fecha.substring(6));
		System.out.println(fecha.substring(6, 20));
		
		/*
		 * .toLowerCase() /.toUpperCase()
		 * Converte a minuscula/mayuscula la cadea de texto
		 * 
		 */
		System.out.println(fecha.toUpperCase());
		System.out.println(fecha.toLowerCase());
		
		/*
		 * .equals() compara el valor de n objetos contra otro
		 * este metodo es sensible a mayuscula y minusculas
		 */
		System.out.println(fecha.equals("hoy es 7 de febrero de 2024"));
		
		/*
		 * .equalIgnoreCase - ignora el uso de mayusculas/minusculas
		 */
		System.out.println(fecha.equalsIgnoreCase("hoy es 7 de febrero de 2024"));
		boolean compara = fecha.equalsIgnoreCase("hoy es 7 de febrero de 2024");
		//el valor que devuelve el metodo se almacena en la variable booleana "compara"
		
		/*
		 * .replace() - reemplaza las apariciones de un texto o caracter
		 * con otro que indiquemos
		 * 
		 */
		System.out.println(fecha.replace("2024", "2025"));
		System.out.println(fecha.replace("o", "$"));
		System.out.println(fecha.replace(" ", "_"));
	}
}
