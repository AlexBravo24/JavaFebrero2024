package curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader
		// y BufferedReader
		
		//Esta clase le la linea de nuestro documento de prueba,
		//pero necesitamos una variable para guardar la informacion.
		
		String linea;
		
	 /*
	  * intenta {
	  * este bloque de codigo
	  * } sino funciona atrapa (en esta excepcion){
	  */

	
		try {
			//Clase File - representa el archivo en memoria
			File archivo = new File("C:\\Users\\DICH\\Desktop\\fichero.txt");
			//Clase FileReader - permite abrir el archivo en
			//modo lectura
			FileReader fr = new FileReader(archivo);
			//BufferedReader - Puede leer el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			//Almacena en el String el contenido del archivo
			
			while ((linea = buffer.readLine()) != null){
				System.out.println(linea);
			}
			// System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No encontre el archivo");
		}
	}

}
