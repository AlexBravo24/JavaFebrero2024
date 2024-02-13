package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		
		//uso de las clases File, FileReader y BufferedReader
		
		//vamos a leer la linea de nuestro documento de prueba y necesitamos guardaar una variable
		//donde guardar la informacion
		
		String linea;
		
		//try and catch
		//es una estructura que nos va a ayudar a ejecutar un bloque de codigo 
		//y si existiera un fallo, mandara el error a una excepcion
		
		/* intenta {
		 * este bloque de codigo
		 * } 
		 * si no funciona atrapa (en esta excepcion){
		 * y ejecuta esto
		 * }
		 */
		
//		try {//intentamos ejecutar el siguiente bloque de codigo
//			//Clase File - Representa el archivo en memoria
//			File archivo = new File ("C:\\Users\\diego\\OneDrive\\Escritorio\\Fichero1.txt");
//		
//			//Clase FileReader - Permite abrir el archivo en modo lectura
//			FileReader fr = new FileReader(archivo);
//		
//			//Para leer el archivo, leyendo el contenido del archivo
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			//Almacenar en nuestro String linea el contenido del archivo
//			linea = buffer.readLine();
//			System.out.println(linea);
//			
//		} catch (Exception e) {
//			System.out.println("No se encotro el archivo");
//			//Si necesito ver el error que se genera, se usa el metodo .printStrackTrace()
//			e.printStackTrace();
			
		//LEER VARIAS LINEAS EN EL ARCHIVO
			try {
				File archivo = new File ("C:\\Users\\diego\\OneDrive\\Escritorio\\Fichero1.txt");
			
				FileReader fr = new FileReader(archivo);
			
				BufferedReader buffer = new BufferedReader(fr);
				
				//Agregamos un ciclo while
				
				while ((linea = buffer.readLine()) !=null) {
				System.out.println(linea);
				}
				
			} catch (Exception e) {
				System.out.println("No se encotro el archivo");
		
				e.printStackTrace();
			
		}
	}
}
