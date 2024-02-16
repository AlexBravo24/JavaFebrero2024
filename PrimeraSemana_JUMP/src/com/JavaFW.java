package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		
		// 
		
		//Vamos a intentar escribir o pasarla el valor de un texto
		//a nuestro archivo de prueba 
		String texto = "\nHola mundo";
		
		try {
			File archivo = new File("C:\\Users\\arker\\OneDrive\\Escritorio\\fichero.txt");
			//Clase FileWriter - Escribir o pasarle el valor de caracteres 
			//o un String a mi archivo
			FileWriter line = new FileWriter(archivo, true);
			//Agregamos el valor booleano true como argumento en FileWriter
			//para que se respete el contenido del archivo y se añada
			//la nueva informacion
			
			//Escribimos el String en el documento
			line.write(texto);
			//Y guardamos los cambios o confirmamos
			line.close();
		} catch (Exception e) {
			System.out.println("No se encontro el archivo");
		}
		
	}
	
}
