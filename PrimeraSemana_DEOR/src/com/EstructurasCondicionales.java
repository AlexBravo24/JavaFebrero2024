package com;

import java.util.Scanner;

public class EstructurasCondicionales {

	public static void main(String[] args) {
	
		//Estructuras condicionales --if -- evaluan valores booleanos, depende de las condiciones
		//se ejecuta o no
		
		int x=9, y;
		
		/*
		 * si x (cumple con) {se ejecuta 
		 * lo de aqui}
		 *
		 */
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Da un primer valor es:");
//		x = input.nextInt();
//		System.out.println("El primer valor es:" + x);
//		System.out.println("Da un segundo valor");
//		y = input.nextInt();
//		System.out.println("El segundo valor es:" +y);
//		
//		if (x>y) {
//			System.out.println("El primer valor es mayor al segundo");
//		}
//		else 
//			System.out.println("El segundo valor es mayor al primero");
			
		
//		//And (&&)devuelve valor true cuando se cumple una condicion
//		if (x>5 && x<15) {
//			System.out.println("Si");}
//			else
//				{System.out.println("no");}
	
//		//OR (||) devuelve valor true si cumple almenos una condicion
//		if (x>5 || x<15) {
//			System.out.println("Si");}
//			else
//				{System.out.println("no");}
		
		//IGUALDAD O COMPARACIOn (==)
		//Si el valor es igual al que quermos comprarlo
//		if (x == 20) {
//		System.out.println("Es igual");}
//		else
//			{System.out.println("No es igual");}
		
		
		//DIFERENTE DE (!=)
//		if (x != 20) {
//			System.out.println("Es diferente");}
//			else
//				{System.out.println("Es igual");}
		
		//NOT (!) Cambia el valor de una condicion
//		if (!(x != 20)) {
//			System.out.println("Es diferente");}
//			else
//				{System.out.println("Es igual");}
		
		
		//IF ELSE ANIDADO
		int dia;
		System.out.println("Selecciona un numero de la semana");
		Scanner input = new Scanner(System.in);
		dia = input.nextInt();
//		
//		if (dia == 1) {
//			System.out.println("lunes");
//		}
//		else if (dia == 2) {
//			System.out.println("martes");
//		}
//		else if (dia == 3) {
//			System.out.println("miercoles");
//		}
//		else if (dia == 4) {
//			System.out.println("jueves");
//		}
//		else if (dia == 5) {
//			System.out.println("viernes");
//		}
//		else if (dia == 6) {
//			System.out.println("sabado");
//		}
//		else if (dia == 7) {
//			System.out.println("domingo");
//		}
//		else {
//			System.out.println("error");
//		}
		
		 switch (dia) {
		case 1:
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("martes");
			break;
		case 3:
			System.out.println("miercoles");
			break;
		case 4:
			System.out.println("jueves");
			break;
		case 5:
			System.out.println("viernes");
			break;
		case 6:
			System.out.println("sabado");
			break;
		case 7:
			System.out.println("domingo");
			break;

		default:
			System.out.println("Error");
			break;
		}
	}
}
