package condicionales;

import java.util.Scanner;

public class Condicionales9_JJBA {

	public static void main(String[] args) {
		
		//Ejercicio9 - Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a 
		//correspondiente. Si introducimos otro n�mero nos da un error
		
Scanner input = new Scanner(System.in);
		
		System.out.println("Escriba un d�a de la semana (del 1 al 7): ");
		
		int numero;
		
		numero = input.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("S�bado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
			
			default:
			System.out.println("Error");
			break;
		}

	}

}
