package condicionales;

import java.util.Scanner;

public class Condicionales10_IGV {

	public static void main(String[] args) {
		
		//10.Realiza un programa que pida un número entero entre uno y doce e imprima 
		//el número de días que tiene el mes correspondiente
		
		int mes;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe el numero de un mes y te dire los dias que tiene");
		mes = input.nextInt();
		
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes  == 8 || mes == 10 || mes == 12) {
			System.out.println("El mes tiene 31 dias");
		} else if (mes == 2) {
			System.out.println("El mes tiene 29 dias");
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			System.out.println("El mes tiene 30 dias");
		} else {
			System.out.println("El mes no existe");
		}


	}

}
