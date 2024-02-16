package arrays;

import java.util.Scanner;

public class Arrays3_LMDRA {
	//Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
	//caracteres. 
	public static void main(String[] args) {
		
		// se declaran las variables que seran utilizadas
		Scanner input = new Scanner(System.in);
		
		String frase;
		System.out.println("Introduce la frase con la que quieres crear el arreglo");
		frase=input.nextLine();
		char [] letras=new char[frase.length()];
		for (int i=0;i<frase.length();i++) {
			letras[i]=frase.charAt(i);
		}
		System.out.println("El arreglo tiene "+letras.length+" elementos");
		System.out.println("Los elementos del arreglo son:");
        for (char l : letras) {
            System.out.print(l + " ");
        }
        
	}

}
