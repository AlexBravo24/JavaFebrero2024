package arrays;

import java.util.Scanner;

public class Arrays3_JAM {

	public static void main(String[] args) {
		
		/*
		 * Pide al usuario por teclado una frase
		 *  y pasa sus caracteres a un array de caracteres.
		 */
		Scanner input = new Scanner(System.in);
		String frase; //Frase proporcionada por el usuario

		System.out.println("Ingrese una frase: ");
		frase = input.nextLine(); 
		char[] array = new char[frase.length()]; //Creamos un array de caracteres sin definir ya que su longitud estará
		                                         //determinada por la longitud de caracteres proporcionados por el usuario
		for (int i = 0; i < frase.length(); i++) { //iniciamos en 0, hasta la longitud de la frase y hacemos un aumento
			 array[i]= frase.charAt(i); //Comienza a guardar el valor en la posición 0 de la frase ingresada por el usuario (array[i])
			                            //que será igual al caracter que se encuentre en la primera posicion hasta la longitud de la frase
			System.out.println(array[i]);
		}

	}

}
