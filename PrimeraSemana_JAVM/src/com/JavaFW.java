package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Vamos a intentar escribir o pasarle el varlor de un texto a nuestroa archivo de prueba
		String texto ="\nHOla mundo";
		
		try {
			File archivo = new File ("C:\\Users\\jorge\\Desktop\\fichero.txt");
			//Clase FIleWriter - escribir o pasarle el valor de caracters o un string a mi archivo
			FileWriter line = new FileWriter(archivo,true);
			//agreagamos el valor booleano true como argumento en FileWriter para que se respete el contenido del archivo y 
			//se anada la nueva informacion
			
			//scribimos el string en el documento
			line.write(texto);
			//y guardamos los cambios o confirmamos
			line.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("no se encontro el archivo");
			// TODO: handle exception
		}
	}

}
