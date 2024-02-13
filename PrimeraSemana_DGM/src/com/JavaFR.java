package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		
		// Uso de las clases File, FileReader
		// y BufferedReader
		
		//Declarar una variable de tipo String para leer
		//la linea de texto de prueba que pusimos el nombre
		
	String linea;
	
	//Try and cathc
	// es una estructura que nos va ayudar a ejecutar
	// un bloque de codigo y si algo fallara, se atrapa
	//el error en una exepcion
	
	/*SINTAXIS
	 * intenta {
	 * este bloque de codigo
	 * } si no funciona atrapa(esta exepcion){
	 * y ejecuta esto
	 * }
	 */
	
	try {//intentamos ejecutar el siguiente bloque de codigo
		//Clase File - Representar el archivo en memoria 
		File archivo = new File ("C:\\Users\\garmo\\OneDrive\\Desktop\\fichero.txt");
		//clase FileReader - Permite abrir el archivo
		//en modo lectura
		FileReader fr = new FileReader(archivo);
		//BufferedReader - Puede leer el contenido del archivo
		BufferedReader buffer = new BufferedReader (fr);
		
		//Almacenar en nuestro String linea el contenido del archivo
		//linea = buffer.readLine(); //si solo hay una linea de texto
		while ((linea = buffer.readLine()) != null) { //si hay 2 o mas lineas, para que detecte todas las lineas del texto y para cuando no haya mas texto por leer
		System.out.println(linea);	
		}
		
		//Mandamos a imprimir nuestra variable linea para ver
		//si se guardo y podememos utilizarla aqui en java
		//System.out.println(linea);
	} catch (Exception e) {
		//si necesitara ver la traza de error que esta generando
		//utilizamos el metodo .printStackTrace();
		e.printStackTrace();
		System.out.println("No encontre el archivo");
	}
		
	}

}
