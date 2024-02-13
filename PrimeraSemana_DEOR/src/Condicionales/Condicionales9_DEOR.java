package Condicionales;

import java.util.Scanner;

public class Condicionales9_DEOR {

	public static void main(String[] args) {
		
		/*9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
		 * correspondiente. Si introducimos otro número nos da un error.
		 */
		
		int dia;
		System.out.println("Selecciona un numero de la semana");
		Scanner input = new Scanner(System.in);
		dia = input.nextInt();
		
		if (dia == 1) {
			System.out.println("lunes");
		}
		else if (dia == 2) {
			System.out.println("martes");
		}
		else if (dia == 3) {
			System.out.println("miercoles");
		}
		else if (dia == 4) {
			System.out.println("jueves");
		}
		else if (dia == 5) {
			System.out.println("viernes");
		}
		else if (dia == 6) {
			System.out.println("sabado");
		}
		else if (dia == 7) {
			System.out.println("domingo");
		}
		else {
			System.out.println("error");
		}
		
	}
}
