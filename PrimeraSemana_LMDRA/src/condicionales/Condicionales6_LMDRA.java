package condicionales;

import java.util.Scanner;

public class Condicionales6_LMDRA {

	public static void main(String[] args) {
		//Se declaran las variables que se utilizaran
		int taUva;
		double precioI,precioF;
		char tiUva;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Verifiquemos el precio de la uva");
		System.out.println("Ingrese el precio inicial");
		precioI=input.nextDouble();
		System.out.println("Ingresa el tipo de uva A ó B");
		tiUva=input.next().toUpperCase().charAt(0);
		System.out.println("Ingresa el tamaño de la uva 1 o 2");
		taUva=input.nextInt();
		
		//Se divide la evaluacion con un switch entre los tipos de uva
		switch (tiUva) {
		case 'A':
			//Se divide la evaluacion con un switch entre los tamaños de uva
				switch (taUva) {
				case 1:
						precioF=precioI+.20;
						System.out.println("El precio final de la uva de tipo "+tiUva+" con tamaño "+taUva+" es: "+precioF);
					break;
				case 2:
						precioF=precioI+.30;
						System.out.println("El precio final de la uva de tipo "+tiUva+" con tamaño "+taUva+" es: "+precioF);
					break;

				default://al no ser un tamaño correcto se marca que no es válido
					System.out.println("El tamaño de uva que ingresó no era válido");					
					break;
					}
			break;
		//Se divide la evaluacion con un switch entre los tipos de uva	
		case 'B':
			//Se divide la evaluacion con un switch entre los tamaños de uva
			switch (taUva) {
			case 1:
					precioF=precioI-.30;
					System.out.println("El precio final de la uva de tipo "+tiUva+" con tamaño "+taUva+" es: "+precioF);
				break;
			case 2:
					precioF=precioI-.50;
					System.out.println("El precio final de la uva de tipo "+tiUva+" con tamaño "+taUva+" es: "+precioF);
				break;

			default://al no ser un tamaño correcto se marca que no es válido
				System.out.println("El tamaño de uva que ingresó no era válido");							
				break;
				}
			break;

		default://al no ser un tipo de uva registrado se marca que no es válido
			System.out.println("El tipo de uva que ingresó no es válido");						
			break;		
		}
		
	}

}
