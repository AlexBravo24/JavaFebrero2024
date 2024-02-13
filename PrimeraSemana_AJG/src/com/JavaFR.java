package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		/*
		 * El uso de las clases File, FileReader y BufferedReader
		
		
		Vamos a leer la linea de nuestro documento de prueal
		y necesitamos una varibale donde guardar dicha informacion.
		 */
		String linea;
		
		/*
		 * try and catch
		 * Es una estructura de nos ayudaa
			a intentar ejecutar un bloque de codigo 
			y si algo fallara, se atrapa el error
			en un excepcion.
			
			
			intenta{
			este bloque de codigo
			} si no funciona atrapa (en esta excepcion){
			y ejecuta esto
			}
		 */
		try { //Intentamos ejecutar el siguiente bloque de codigo
			//Clase File - Representar el archivo de memoria
			File archivo = new File("C:\\Users\\AJG\\Desktop\\fichero.txt");
			//Clase FileReader - Permite abrir el archivo en modo lectura
			FileReader fr = new FileReader(archivo); //La variable archivo se pasa como argumento
			//BufferedReader - Puede leer el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			//Almacenar en nuestro String linea el cotenido del archivo
			while ((linea = buffer.readLine())!=null){
				System.out.println(linea);
			};
			
			
			//Se manda a imprimir nuestra variale line para ver si se guardo 
			//y podemos ya utilizarla aqui en java
			//System.out.println(linea);
		} catch (Exception e) {
			//Si necsitara ver la traza de errr que se esta generando 
			//utilizamos el metro .printStackTrace
			e.printStackTrace();
			System.out.println("No encontre el archivo");
		}

	}

}
