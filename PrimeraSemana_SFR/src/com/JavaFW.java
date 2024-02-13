package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vamos a intentar  escribir o pasale el valor de un texto
		//a nuestro archivo de prueba
		String texto = "\nHola mundo";
		try {
		File archivo = new File("C:\\Users\\moshc\\OneDrive\\Escritorio\\fichero.txt");
		//Clase FileWriter - Escribir o pasarle el valor de caracteres 
		//o un String a mi archivp
		FileWriter line = new FileWriter(archivo,true);
		//Agregamos el vaor booleano true como argumento en FileWriter
		//o un String a mi archivo
		
		//Escribimos el String en el documento 
		line.write(texto);
		//y guardamso los cambios o confirmalo
		line.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se encontro el archivo");
		}
	}

}
