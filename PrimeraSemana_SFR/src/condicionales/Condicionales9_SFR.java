package condicionales;

import java.util.Scanner;

public class Condicionales9_SFR {

	public static void main(String[] args) {
		
		
		// 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día
		//correspondiente. Si introducimos otro número nos da un error.

		Scanner input = new Scanner(System.in);
		System.out.println("Escribe del 1 al 7");
	
		int dia = input.nextInt();
		String diaSemana;
		switch (dia) {
		case 1:
			diaSemana = "Lunes";
			break;
		case 2:
			diaSemana ="Martes";
			break;
		case 3:
			diaSemana ="Miercoles";
			break;
		case 4:
			diaSemana ="jueves";
			break;
		case 5:
			diaSemana ="Viernes";
			break;
		case 6:
			diaSemana ="Sabado";
			break;
		case 7:
			diaSemana ="Sabado";
			break;
		default:
			diaSemana ="error no existe ese dia de la semana";
			break;
		}
		System.out.println("El día correspondiente al número " + dia + " es: " + diaSemana);
	}

}
