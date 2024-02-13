package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		//Estructuras condicionales/decisión -if- evaluan valores booleanos
		//Si se cumple algo se ejecuta y si no, no se ejecuta la acción
		
		int x = 9;
		
		/*
		 * Sintaxis
		 * Si (se cumple esto){
		 * ejecutamos la accion de aquí
		 * }
		 */
//		if (x>10) {
//			System.out.println("Si");
//				}
//		else { //Si no se cumple la condición se ejecuta esta acción
//			System.out.println("No");
//		}
		
		//Condiciones compuestas con operadores lógicos
		//AND, OR, NOT, Diferente de, IGUALDAD
		
		//AND - && - Devuelve el valor "true" cuando se cumplen todas las condiciones
		
//		if (x>5 && x<15) { //Tienen que cumplirse todas las condiciones para que mande el valor "true"
//			System.out.println("Si");
//		}
//		else {
//			System.out.println("No");
//		}

		//OR - || - Devuelve "true" cuando se cumple al menos una condición
//		if (x>5 || x<9) {
//			System.out.println("Si");
//		}
//		else {
//			System.out.println("No");
//		}
		
		//Igualdad o comparación - == - Revisa o compara si el valor es igual al que queremos comparar
//		if (x==8) {
//			System.out.println("Si");
//		}
//		else {
//			System.out.println("No");
//		}
		
		//Diferente de - != - Compara los valores, manda "true" si son diferentes
//		if (x != 8) {
//			System.out.println("Si");
//		}
//		else {
//			System.out.println("No");
//		}
		
		//NOT - ! - Niega una condición o más bien, cambia el valor de una condición de "true" a "false" y viceversa
//		if (!(x == 9)) { //Va a mandar un "NO" porque estamos negando la primera afirmación
//			System.out.println("Si");
//		}
//		else {
//			System.out.println("No");
//		}
		
		//Estructura if-else concatenado o anidado
		
//		int dia = 4;
//		
//		if (dia ==1) {
//			System.out.println("Lunes");
//		}
//		else if (dia ==2) {
//			System.out.println("Martes");
//		}
//		else if (dia == 3) {
//			System.out.println("Miércoles");
//		}
//		else if (dia == 4) {
//			System.out.println("Jueves");
//		}
//		else if (dia == 5) {
//			System.out.println("Viernes");
//		} else {
//			System.out.println("Error");
//		}
		
		
		//Estructura Switch-case
		//Es útil para ejecutar ciertos bloques de código de acuerdo al cambio de una variable, según sea el caso
		
		int dia = 3;
		
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

		default:
			System.out.println("Error");
			break;
		}
		
		
	}

}
