package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vamos a intentar escribir o pasarle un texto a nuestro archivo de prueba
		String texto="\nHola mundo";
		try {
			File archivo= new File("C:\\Users\\LuisManuel\\Desktop\\fichero.txt");
			//Clase FileWriter= Escribir o pasarle el
			// valor de caracteres o un string a mi archivo
			FileWriter line = new FileWriter(archivo,true);
			//agregamos el valor booleano true como argumento en FileWriter
			//para que se respete el contenido del archivo y se añada la nueva informacion
			
			
			
			//Escribimos el string en el documento
			line.write(texto);
			line.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("No se encontro el archivo");
		}

	}

}
