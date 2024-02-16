package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {

	//Uso de las clases File, FileReader
	//Y BufferredReader
		
	//Vamos a leer la linea de nuestro ducumento 
	//de prueba y necesitamos una variable 
	//donde guardar dicha info
	String linea;
	
	//try and catch
	//Es una estructura que nos va a ayudar 
	//a intentar ejecutar un bloque de codigo 
	// y si algo fallara, se atrapa el error
	//en una excepcion
	
	/*
	 * intenta{
	 * este bloque de codigo
	 * }si no funciona atrapa (en esta excepcion){
	 * y ejecuta esto
	 * }
	 */
	
	try {//intentamos ejecutar el siguiente bloque de codigo
		//Clase File- representar el archivo en memoria
		File archivo = new File("C:\\Users\\LENOVO\\Desktop\\fichero.txt");
	//clase FileReader -Permite abrir el archivo en modo
		//lectura 
		FileReader fr = new FileReader(archivo);
		//BufferedReader - Puede leer el contenido del archivo
		BufferedReader buffer = new BufferedReader(fr); 
		
		//Almacenar en nuestro String linea el contenido del archivo 
		
		while ((linea = buffer.readLine()) !=null) {
			System.out.println(linea);
		}
		//Mandamos a imprimir nuestra variable linea para ver 
		// si se guardo y podemos ya utilizarla aqui en Java
		//System.out.println(linea);
	}catch (Exception e) {
		e.printStackTrace();
		System.out.println("No encontre el archivo");
		//Si necesitara ver la traza de error que se esta generando
		//utilizamos el metodo .printStackTrace();

	
	}
	}
}
	


	

	
