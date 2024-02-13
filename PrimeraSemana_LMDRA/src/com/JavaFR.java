package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		//Uso de las clases File, File Reader y Buff
		/* Vamos a leer la linea de nuestro documento
		 * de prueba y necesitamos una variable donde guardar la info
		 * */
		String linea;
		/*
		 * intenda{este bloque de codigo
		 * }si no funciona atrapa(en esta excepcion){
		 * y ejecuta esto}
		 * */
		try {
			//intentamos ejecutar le siguiente bloque de codigo
			//clase File=Representar el archivo de memoria
			File archivo= new File("C:\\Users\\LuisManuel\\Desktop\\fichero.txt");
			//Clase File Reader - Permite abrir el archivo en modo lectura
			FileReader fr = new FileReader(archivo);
			//BufferedReader - Puede leer el contenido del archivo 
			BufferedReader buffer = new BufferedReader(fr); 
			
			//Almacenar en nuestro string linea el contenido de nuestro archivo
			//linea = buffer.readLine()
			//System.out.println(linea);
			
			while((linea = buffer.readLine())!=null) {
				System.out.println(linea);
			}
			
			
			
		} catch (Exception e) {
			// si necesitamos ver la traza de error que se esta generando
			// utilizamos el metodo .printStackTrace();
			e.printStackTrace();
			System.out.println("No se encontro el archivo");
			
		}
	}

}
