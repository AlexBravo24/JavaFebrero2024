package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		
		// Vamos a intentar escribir el valor de un texto 
		// a nustro archivo
		
		String texto = "\nHola mundo";
		
		try {
			File archivo = new File ("C:\\Users\\garmo\\OneDrive\\Desktop\\fichero.txt");
			//ahora necesitamos la clase faileWritter para escribir el valor de la clase file
			// a mi archivo
			FileWriter line = new FileWriter (archivo,true);//Agregamos el true para que se respete el contenido 
			                                                //del archivo y se añada la nueva informacion
			//Escribimos el String en el documento
			line.write(texto);
			//Guardamos los cambios con el line.close
			line.close();

		} catch (Exception e) {
			System.out.println("No se encontró el archivo");
		}
		

		
	}

}
