package Condicionales;

import java.util.Scanner;

public class Condicionales10_JPS {

	public static void main(String[] args) {
		
		
		// 
		/*10.Realiza un programa que pida un número entero entre uno y doce e 
		 * imprima el número de días que tiene el mes correspondiente
		 * 
		 * */
		//Introducimos las variables que almacenaran nuestros datos
		int mes;
		//pedimos la entrada de datos del teclado\
		Scanner input = new Scanner(System.in);
		//lo declarado se guarda en la variable mes
		System.out.println("Introduce solamente un numero del 1 a 12 para el mes basado que enero es igual a 1 hasta diciembre que corresponde a 12");
		mes=input.nextInt();
		System.out.println("Usted selecciono el mes de :");
	
		int L=(mes);
		
		switch (L) { 
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
			
		default:
			System.out.println("Error");
			break;
		}
	}

}
