package curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		
//		
//		String texto = "\nMextasis";
//		
//		try {
//			File archivo = new File("C:\\Users\\DICH\\Desktop\\fichero.txt");
//			FileWriter line = new FileWriter(archivo, true);
//			
//			
//			line.write(texto); // Escribe el String en el documento
//			
//			line.close(); //guarda los cambios en el archivo
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("No se encontro el archivo");
//		}
		
		/*
		 * String frase = "\nDulces";
		 * 
		 * try { File archivo = new File("C:\\Users\\DICH\\Desktop\\fichero.txt");
		 * FileWriter line = new FileWriter(archivo, true);
		 * 
		 * line.write(frase);
		 * 
		 * line.close(); } catch (Exception e) { e.printStackTrace();
		 * System.out.println("No se encontro el archivo"); }
		 */
		
		String frase = "\n Caracoles";
		String texto;
		try {
			File archivo = new File("C:\\Users\\DICH\\Desktop\\fichero.txt");
			FileReader fr = new FileReader(archivo);
			
			BufferedReader buffer = new BufferedReader(fr);
			
			while ((texto = buffer.readLine()) != null) {
				System.out.println(texto);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se encontro el archivo");
		}
		
		try {
			File linea = new File("C:\\Users\\DICH\\Desktop\\fichero.txt");
			FileWriter line = new FileWriter(linea, true);
			
			line.write(frase);
			line.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("no se encontro el archivo");
		}
		System.out.println("\nArchivo despues del cambio\n");
		try {
			File archivo = new File("C:\\Users\\DICH\\Desktop\\fichero.txt");
			FileReader fr = new FileReader(archivo);
			
			BufferedReader buffer = new BufferedReader(fr);
			
			while ((texto = buffer.readLine()) != null) {
				System.out.println(texto);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se encontro el archivo");
		}

	}

}
