package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {

		/*
		 * Uso de las clases File y FileReader y BufferedReader
		 */

		//Para leer una l�ne de nuestro documento de prueba necesitamos una
		//variable donde guardar dicha informaci�n
		
		String linea;
		
		//Estructura try and catch
		//Nos permite intentar ejecutar un bloque de c�digo y si algo fallara
		//, se atrapa el error en una excepci�n
		
		/*
		 * Sintaxis
		 * 
		 * intenta{
		 * este bloque de c�digo
		 * } si no funciona atrapa(en esta excepci�n){
		 * ejecuta esto}
		 */
		
		try {//Intenamos ejecutar el siguiente bloque de c�digo
			//Clase File - Representa el archivo en memoria
			File archivo = new File("C:\\Users\\Avila\\Desktop\\fichero.txt"); //Esperamos la ubicaci�n para la lectura en formato String
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
			//Si necesitara ver la traza del error que se est� generando
			//utilizamos el m�todo .printStackTrace();
			e.printStackTrace();
			System.out.println("No encontr� el archivo");
		}
	}

}
