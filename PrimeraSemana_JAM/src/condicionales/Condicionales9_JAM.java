package condicionales;

import java.util.Scanner;

public class Condicionales9_JAM {

	public static void main(String[] args) {
		
		/*Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a
		 * correspondiente. Si introducimos otro n�mero nos da un error.
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		int dia;
		
		System.out.println("D�a de la semana (1 a 7): ");
		dia = input.nextInt();
		
		switch (dia) { //Switch + ctrl + espace = estructura switch - case
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Mi�rcoles");
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
