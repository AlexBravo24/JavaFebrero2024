package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		
		
		//Vamos a intentar escribir o pasarle el valor de un texto
		//a nuestro archivo de prueba
		String texto  ="\nHola, mundo";
		
		try {
			File archivo = new File("C:\\Users\\Asus\\Desktop\\Fichero2.txt");
			//Clase FileWriter - escribir o pasarle el valor de caracteres
			//o un string a mi archivo
			FileWriter line = new FileWriter(archivo, true);
			//Agregamos el valor booleano true como argumento en FileWriter
			//para que se respete el contenido del archivo y se añada
			//la nueva información
			
			//Escribimos el String en el documento
			line.write(texto);
			//Y guardamos los cambios o confirmamos
			line.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se encontró el archivo");
			// TODO: handle exception
		}

	}

}
