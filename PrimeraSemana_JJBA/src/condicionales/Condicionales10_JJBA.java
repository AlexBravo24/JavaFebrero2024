package condicionales;

import java.util.Scanner;

public class Condicionales10_JJBA {

	public static void main(String[] args) {
		
		//Ejercicio10 - .Realiza un programa que pida un n�mero entero entre uno y doce e imprima 
		//el n�mero de d�as que tiene el mes correspondiente

Scanner input = new Scanner(System.in);
		
		System.out.println("Escriba un n�mero entero (entre 1 a 12): ");
		
		int numero;
		
		numero = input.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Enero tiene 31 d�as");
			break;
		case 2:
			System.out.println("Febrero tiene 29 d�as");
			break;
		case 3:
			System.out.println("Marzo tiene 31 d�as");
			break;
		case 4:
			System.out.println("Abril tiene 30 d�as");
			break;
		case 5:
			System.out.println("Mayo tiene 31 d�as");
			break;
		case 6:
			System.out.println("Junio tiene 30 d�as ");
			break;
		case 7:
			System.out.println("Julio tiene 31 d�as");
			break;
		case 8:
			System.out.println("Agosto tiene 31 d�as");
			break;
		case 9:
			System.out.println("Septiembre tiene 30 d�as");
			break;
		case 10:
			System.out.println("Octubre tiene 31 d�as");
			break;
		case 11:
			System.out.println("Noviembre tiene 30 d�as");
			break;
		case 12:
			System.out.println("Diciembre tiene 31 d�as");
			break;
			
			default:
			System.out.println("Error");
			break;
		}
		
	}

}
