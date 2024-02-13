package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		
		//Uso de las clases File, FileReader y BufferedReader
		
		//Vamos a leer la l�nea de nuestro documento de prueba y 
		//necesitamos una variable donde guardar dicha info
		
		String linea;
		
		//Try and catch - es una estructura que nos va a ayudar a 
		//intentar ejecutar un bloque de c�digo y si algo fallara,
		//se atrapa el error en una excepci�n
		
		/*
		 * intenta{
		 * este bloque de c�digo
		 * }si no funciona atrapa (en esta excepci�n){
		 * y ejecuta esto
		 * }
		 */
		
		try {//intentamos ejecutar el siguiente bloque de c�digo
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
			//guard� y podemos ya utilizarla aqu� en Java
			//System.out.println(linea);
		} catch (Exception e) {
			//Si necesitara ver la traza de error que se est� generando
			//utilizamos el metodo .printStackTrace();
			e.printStackTrace();
			System.out.println("No encontr� el archivo.");
			// TODO: handle exception
		}

		
		
	}

}
