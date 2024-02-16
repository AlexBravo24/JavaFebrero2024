package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Vamos a intentar escribir o pasarle el valor de un texto 
		//a nuestro archivo de prueba
		String texto = "\nHola mundo";
		
		try {
			File archivo = new File("C:\\Users\\LENOVO\\Desktop\\fichero.txt");
			//Clase FileWrite -Escribir o pasarle el valor de caracteres
			//o un String a mi archivo
			FileWriter line = new FileWriter(archivo, true);
			//Agregamos el valor booleano true como argumento en FileWriter
			//para que se respete el contenido del archivo y se sume la 
			//nueva informacion
			
			//Escribimos el String en el documento 
			line.write(texto);
			//Y guardamos el cambio
			line.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se encontro el archivo");
			}
	}

}
