package arrays;

import java.util.Scanner;

public class Arrays3_SFR {

	public static void main(String[] args) {
		
		
		// 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		//caracteres.

	
		
		String cadena = "luis;Isarael;Armando";
		String[] lista = cadena.split(";");
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Nombres : " + lista[i]);
		}
		
		

	}

}
