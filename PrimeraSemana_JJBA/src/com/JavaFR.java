package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		
		//Uso de las clases File, FileReader y BufferedReader
		
		//Vamos a leer la línea de nuestro documento de prueba y 
		//necesitamos una variable donde guardar dicha info
		
		String linea;
		
		//Try and catch - es una estructura que nos va a ayudar a 
		//intentar ejecutar un bloque de código y si algo fallara,
		//se atrapa el error en una excepción
		
		/*
		 * intenta{
		 * este bloque de código
		 * }si no funciona atrapa (en esta excepción){
		 * y ejecuta esto
		 * }
		 */
		
		try {//intentamos ejecutar el siguiente bloque de código
			//Clase File - Representar el archivo en memoria
			File archivo = new File("C:\\Users\\Asus\\Desktop\\Fichero2.txt");
			//Clase FileReader - Permite abrir el archivo en modo lectura
			FileReader fr = new FileReader(archivo);
			//BufferedReader - Puede leer el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			//Almacenar en nuestro String linea el contenido del archivo
			while ((linea = buffer.readLine()) !=null) {
				System.out.println(linea);
			};
			//MAndamos a imprimir nuestra variable linea para ver si se
			//guardó y podemos ya utilizarla aquí en Java
			//System.out.println(linea);
		} catch (Exception e) {
			//Si necesitara ver la traza de error que se está generando
			//utilizamos el metodo .printStackTrace();
			e.printStackTrace();
			System.out.println("No encontré el archivo.");
			// TODO: handle exception
		}

		
		
	}

}
