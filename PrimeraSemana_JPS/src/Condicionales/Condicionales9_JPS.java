package Condicionales;

import java.util.Scanner;

public class Condicionales9_JPS {

	public static void main(String[] args) {
		// Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si
		//introducimos otro número nos da un error.

		//declaramos las variables que almacenara los datos 
		int dia;
		//llamamos al teclado
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el dia de la semana que es, si 1 es lunes hasta 7 que es domingo");
		dia=input.nextInt();
       
		int L=(dia);
		
		switch (L) { 
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
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
