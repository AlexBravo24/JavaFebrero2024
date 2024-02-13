package condicionales;

import java.util.Scanner;

public class Condicionales9_JAM {

	public static void main(String[] args) {
		
		/*Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día
		 * correspondiente. Si introducimos otro número nos da un error.
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		int dia;
		
		System.out.println("Día de la semana (1 a 7): ");
		dia = input.nextInt();
		
		switch (dia) { //Switch + ctrl + espace = estructura switch - case
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
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
