package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// VAmos a intentar escribir a pasarleel valoro de un texto
		//a nuestro archivo de pruebla
		String texto = "\nHola Mundo";
		try {
			File archivo = new File("C:\\Users\\AJG\\Desktop\\fichero.txt");
			//Clase FileWriter - Escribir o pasarle el valor de caracteres 
			//o un string a mi archivo
			FileWriter line = new FileWriter(archivo, true);
			//Agregamos el valor bolleano true como argumento en FileWritr
			//para que se respete el contenido del archivo y se añada
			//la nueva informacion.
			
			//Escribimos el string en el documento
			line.write(texto);
			//yguardamos los cambios
			line.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se encontro el archivo ");
			// TODO: handle exception
		}

	}

}
