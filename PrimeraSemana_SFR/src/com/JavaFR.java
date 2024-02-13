package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		
		// Uso de las Clases File,FileReader
		//Y BuffereReader 
		
		//Vamos a leer la linea de nuestro docuemento
		//de prueba y necesitamos una variable 
		//donde guardamos dicha info
		String linea;
		
		//Try and Catch
		//Es una estructura que nos va ayudar 
		//a intentar ejecutar un bloque de codigo 
		//y si algo fallara, se atrapa el error
		//en un excepcion
		/*
		 * intenta{
		 * este bloque de codigo
		 * }si no funciona atrapa(en esta excepcion){
		 * y ejecuta esto
		 * }
		 */

		try {//intentamos ejecutar el siguiente bloque de codigo
			//Clase File -Representar el archivo en memoria
			File archivo = new File("C:\\Users\\moshc\\OneDrive\\Escritorio\\fichero.txt");
			//Clase FileReader - Permite abrir el archivo en modo
			//lectura
			FileReader fr =  new FileReader(archivo);
			//BufferedReader - Puede leer el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			//Almacenar en nuestro String Linea el contenido del archivo
			while ((linea = buffer.readLine()) != null){
				System.out.println(linea);
			}
			
			//Mandamos Imprimir nuestra variable linea para ver 
			//si se guardo y pademos ya utilizarla aqui en java
			//System.out.println(linea);
		} catch (Exception e) {
			//Si necesitara ver la traza de error que se esta generando
			//Utilizamos el metodo .printStackTrace();
			e.printStackTrace();
			System.out.println("No encontre el archivo");
		}
		
		
	}

}
