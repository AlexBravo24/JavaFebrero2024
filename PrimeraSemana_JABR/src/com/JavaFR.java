package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		
		// Uso de las clases File, FileReader
		//Y BufferedReader
		
		//Vamos a leer la linea de nuestro documento
		//de prueba y necesitamos una variable
		//donde guardar dicha info
		String linea;
		
		//try and catch
		//Es una estructura que nos va ayudar
		//a intentar ejecutar un bloque de codigo
		//y si algo fallará, se atrapa el error
		//en una excepción
		
		/*
		 * intenta{
		 * este bloque de codigo
		 * } si no funciona atrapa (en esta excepcion){
		 * y ejecuta esto
		 * }
		 */
		
		try {//intentamos ejecutar el siguiente bloque de codigo
			//Clase File - Representar el archivo en memoria
			File archivo = new File("C:\\Users\\jorge\\OneDrive\\Escritorio\\fichero.txt");
			//Clase FileReader - Permite abrir el archivo en modo
			//lectura
			FileReader fr = new FileReader(archivo);
			//BufferedReader - Puede leer el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			// Almacenar en nuestro String linea el contenido del archivo
			
			while ((linea = buffer.readLine()) != null){
				System.out.println(linea);
			}
			
			//Mandamos a imprimir nuestra variable linea para ver
			//si se guardo y podemos ya utilizarla aqui en Java
			//System.out.println(linea);
		} catch (Exception e) {
			//Si necesitara ver la traza de error que se esta generando
			//utilizamos el método .printStackTrace();
			e.printStackTrace();
			System.out.println("No encontré el archivo");
		}

	}

}
