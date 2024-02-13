package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		
		//Esta clase es escribir una String y pasarle el valor a un texto de prueba
		
		String texto = "\nDiego Eduardo Orozco Rios";
		
		//ESTE CODIGO REMPLAZA EL TEXTO EN EL ARCHIVO
//		try {
//			File archivo = new File ("C:\\Users\\diego\\OneDrive\\Escritorio\\Fichero1.txt");
//			
//			// Clase FileWriter - Escribir un valor de caracteres o un String a un archivo
//			FileWriter line = new FileWriter (archivo);
//			
//			//Escribimos el String en el documento
//			line.write(texto);
//			
//			//Guarda los cambios
//			line.close();
//			
//		} catch (Exception e) {
//			System.out.println("No se encontro el archivo");
//			e.printStackTrace();
//			
//		}
		
		try {
			File archivo = new File ("C:\\Users\\diego\\OneDrive\\Escritorio\\Fichero1.txt");
			
			//Agregamos el valor booleano true como argumento en FileWriter para que se respete
			//el contenido del archivo y se añada la nueva informacion
			FileWriter line = new FileWriter (archivo, true);

			line.write(texto);

			line.close();
			
		} catch (Exception e) {
			System.out.println("No se encontro el archivo");
			e.printStackTrace();
			
		}
	}
}
