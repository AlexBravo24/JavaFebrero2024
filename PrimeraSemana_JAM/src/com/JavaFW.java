package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {

		/*
		 * 
		 */

		//Vamos a intentar escribir o pasarle el valor de un texto
		//a nuestro archivo de prueba
		String texto = "\nSon las 9:29 de la mañana"; //Agregamos el salto de línea
		try {
			File archivo = new File("C:\\Users\\Avila\\Desktop\\fichero.txt");
			//Clase FileWriter - Escribe o pasa el valor de caracteres o un String a mi archivo
			FileWriter line = new FileWriter(archivo, true);
			//Agregamos el valor true como argumento en FileWriter para que respete el 
			//contenido del archivo y se añada la información
			
			//Escribimos el String en el documento
			line.write(texto);
			//Guardamos los cambios o confirmamos los cambios
			line.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se encontró el archivo");
		}
	}

}
