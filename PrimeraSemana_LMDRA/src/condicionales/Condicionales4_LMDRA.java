package condicionales;

import java.util.Scanner;

public class Condicionales4_LMDRA {

	public static void main(String[] args) {
		//Evalua una cadena de texto y compruebe si tiene letras mayusculas
		//Se crean 2 variables, el texto que sera evaluado y un boolean 
		//que almacenara si contine mayusculas o no
		String texto;
		boolean contieneMayusculas = false;
		
		Scanner input = new Scanner(System.in);
		
		//Solicitamos texto al usuario
		System.out.println("Ingresa un texto que quieras evaluar");
		texto=input.nextLine();
		
		
		if (texto.matches(".*[A-Z].*")) {
            System.out.println("El texto contiene mayúsculas");
        } else {
            System.out.println("El texto no contiene mayúsculas");
        }
		
		
	}

}

