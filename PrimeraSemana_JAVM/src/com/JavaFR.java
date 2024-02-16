package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// Uso de las clases file,FileReader
		//y BufferredReader
		
		//Vamos aleer la linea de nuestro documento de prueba y necesitamos una variable donde guardar dicha info
		String linea; 
		// try and castch es una estructura que nos va a ayudar a in tentar ejecutar un bloque de codigo
		//y si algo fallara , se atrapa el error en una excepcion
		/*
		 * intenta{
		 * este bloque de codigo
		 * }si no funciona atrapa (en esta excepcion){
		 * y ejecuta esto
		 * }
				 */
		try {//intentamos ejecutar el sigiente bloque de codig
			//clase File - representar el archivo en memoria
			File archivo = new File ("C:\\Users\\jorge\\Desktop\\fichero.txt");
			//Clase FileReader - permite abrir el archivo en modo lectura
			FileReader fr = new FileReader(archivo);
			//BufferedReader - Puede leer el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			//Almacenar en nuestro sting linea el contenido del archivo
			while ((linea = buffer.readLine()) !=null){
				System.out.println(linea);
			}
			//mandamos a imprimir nuestra variable linea para ver si se guardo y ya podemos utilizarla en java
			//System.out.println(linea);
		} catch (Exception e) {
			// si necesitara ver la traza de error se esta generando utilizamos el metodo .printStackTrace();
			e.printStackTrace();
			System.out.println("no encontre el archivo");
		}
	}

}
