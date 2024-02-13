package Condicionales;

import java.util.Scanner;

public class Condicionales10_DEOR {

	public static void main(String[] args) {
		
		/*10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de 
		 * días que tiene el mes correspondiente.
		 */
		
		int mes;
		System.out.println("Teclea un numero correspondiente a un mes");
		Scanner input = new Scanner(System.in);
		mes = input.nextInt();
		
		if (mes == 1) {
			System.out.println("Enero tiene 31 dias");
		}
		else if (mes == 2) {
			System.out.println("Febrero tiene 29 dias");
		}
		else if (mes == 3) {
			System.out.println("Marzo tiene 31 dias");
		}
		else if (mes == 4) {
			System.out.println("Abril tiene 30 dias");
		}
		else if (mes == 5) {
			System.out.println("Mayo tiene 31 dias");
		}
		else if (mes == 6) {
			System.out.println("Junio tiene 30 dias");
		}
		else if (mes == 7) {
			System.out.println("Julio tiene 31 dias");
		}
		else if (mes == 8) {
			System.out.println("Agosto tiene 31 dias");
		}
		else if (mes == 9) {
			System.out.println("Septiembre tiene 30 dias");
		}
		else if (mes == 10) {
			System.out.println("Octubre tiene 31 dias");
		}
		else if (mes == 11) {
			System.out.println("Noviembre tiene 30 dias");
		}
		else if (mes == 12) {
			System.out.println("Diciembre tiene 31 dias");
		}
		else {
			System.out.println("error");
		}
	}
}
