package condicionales;

import java.util.Scanner;

public class Condicionales9_LMDRA {
	//Escribir el dia de la semana solo con el numero
	public static void main(String[] args) {
		int diaN;
		//Se declaran las variables que seran utilizadas
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el número de día");
		diaN=input.nextInt();
		//Con un switch establecemos los numeros y el dia que les pertenece
		switch (diaN) {
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
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;

		default:
			System.out.println("ERROR!!!!");
			break;
		}

	}

}
