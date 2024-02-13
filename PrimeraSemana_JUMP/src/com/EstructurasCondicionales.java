package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// Estructuras de decision - if - evaluan
		//valores booleanos (si se cumple algo, se ejecuta
		//y si no, pues no se ejecuta)
		
		int x = 9;
		
		/*
		 * si (se cumple) {
		 * ejecutamos esto de aqui
		 * }
		 */
		
//		if (x>10) {
//			System.out.println("Si");
//		}else { //En caso que no se cumpla la condicion 
//			//se ejecuta lo de aqui
//			System.out.println("No");
//		}
		
		
		
		//Condiciones compuestas con operadores logicos
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//AND - && - Devuelven el valor "true" cuando se cumplen 
		//todas las condiciones
//		if (x>5 && x<9) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}

		//OR - || - Devuelve true cuando se cumple al menos
		//una condicion
//		if (x>5 || x<9) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//IGUALDAD o Comparacion - == - Revisa o compara 
		//si el valor es igual al que queremos compararlo
		//Un solo igual es para asignar y dos es para comparar (operador)
		//Manda true si el valor es igual al que lo comparamos
//		if (x == 20) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//DIFERENTE DE - != - Compara los valores y manda true si son 
		//diferentes
		
//		if (x != 20) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//NOT - ! - Niega una condicion o mas bien, cambia el valor 
		//de una condicion de true a false y viceversa
		
//		if (!(x != 20)) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//Estructura if-else concatenado o anidado
		
//		int dia = 0;
//		
//		if (dia == 1) {
//			System.out.println("Lunes");
//		}else if (dia == 2) {
//			System.out.println("Martes");
//		}else if (dia == 3) {
//			System.out.println("Miercoles");
//		}else if (dia == 4) {
//			System.out.println("Jueves");
//		}else if (dia == 5) {
//			System.out.println("Viernes");
//		}else {
//			System.out.println("Error");
//		}
		
		//Estructura Switch-Case
		//Es util para ejecutar ciertos bloques de codigo
		//de acuerdo al cambio en una variable, segun sea el caso
		
		//switch + ctrl + espacio + enter
		
		int dia = 3;
		
		switch (dia) {
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

		default:
			break;
		}
		
	}

}
