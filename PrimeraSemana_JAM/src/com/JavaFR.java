package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {

		/*
		 * Uso de las clases File y FileReader y BufferedReader
		 */

		//Para leer una líne de nuestro documento de prueba necesitamos una
		//variable donde guardar dicha información
		
		String linea;
		
		//Estructura try and catch
		//Nos permite intentar ejecutar un bloque de código y si algo fallara
		//, se atrapa el error en una excepción
		
		/*
		 * Sintaxis
		 * 
		 * intenta{
		 * este bloque de código
		 * } si no funciona atrapa(en esta excepción){
		 * ejecuta esto}
		 */
		
		try {//Intenamos ejecutar el siguiente bloque de código
			//Clase File - Representa el archivo en memoria
			File archivo = new File("C:\\Users\\Avila\\Desktop\\fichero.txt"); //Esperamos la ubicación para la lectura en formato String
			//Clase FileReader - Permite abrir el archivo en modo lectura
			FileReader fr = new FileReader(archivo); //El argumento que espera es el objeto archivo
			//BufferedReader - Puede leer el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			//Almacenamos en nuestro String linea el contenido del archivo
			while((linea = buffer.readLine()) !=null){ //Mientras linea sea diferente de nulo, que siga leyendo e imprima en consola
				System.out.println(linea);
			}
			
			
			//Imprimimos para ver si se guardo y podemos utilizarla en Java
			//System.out.println(linea);
		} catch (Exception e) {
			//Si necesitara ver la traza del error que se está generando
			//utilizamos el método .printStackTrace();
			e.printStackTrace();
			System.out.println("No encontré el archivo");
		}
	}

}
