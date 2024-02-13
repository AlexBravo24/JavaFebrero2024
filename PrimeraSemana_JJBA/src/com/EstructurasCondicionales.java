package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		//Estructuras de decisi�n - if - evaluan valores booleanos
		//(si se cumple algo, se ejecuta y si no, no se ejecuta)
		
		int x = 9;
		
		/*si (se cumple esto) {
		 * ejecutamos esto de aqu�
		 * }
		 */
		
		//se puede volver comentario seleccionando todo y presionar
		//ctrl+7 o usando /* al inicio y cerrar con */
		
		/*
		if (x>10) {
			System.out.println("s�");
		}else { //en caso de que no se cumpla la condici�n se ejecuta 
			//lo de aqu�
			System.out.println("no");
		}
		*/
		
		//Condiciones compuestas con operadores l�gicos
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//AND - && - devuelven el valor "true" cuando se cumplen
		//todas las condiciones
		
//		if (x>5 && x<15) {
//			System.out.println("S�");
//		}else {
//			System.out.println("No");
//		}
		
//		//OR - || - devuelve true cuando se cumple al menos una condici�n
//		if (x>5 || x<9) {
//			System.out.println("S�");
//		}else {
//			System.out.println("No");
//		}
		
		//Igualdad o comparaci�n - == - revisa o compara si el valor
		//es igual al que queremos compararlo
		//Un solo igual es para asignar y dos es para comparar (operador)
		//manda true si el valor es igual al que comparamos
		
//		if (x == 20) {
//			System.out.println("S�");
//		}else {
//			System.out.println("No");
//		}
		
		//DIFERENTE DE - != - compara los valores y manda true si son diferentes
		
//		if (x != 20) {
//			System.out.println("S�");
//		}else {
//			System.out.println("No");
//		}
		
		//NOT - ! - Niega una condici�n o m�s bien, cambia el valor de
		//una condici�n true a false y viceversa
		
//		if (!(x != 20)) {
//			System.out.println("S�");
//		}else {
//			System.out.println("No");
//		}
		
		//Estructura if-else concatenado o anidad
//		int dia = 4;
//		
//		if (dia == 1) {
//			System.out.println("Lunes");
//		}else if (dia == 2) {
//			System.out.println("Martes");
//		}else if (dia ==3 ) {
//			System.out.println("Mi�rcoles");
//		}else if (dia == 5) {
//			System.out.println("Viernes");
//		}else if (dia == 4) {
//			System.out.println("Jueves");
//		}else {
//			System.out.println("Error");
//		}
		
		//Estructura Switch-Case
		//Es �til para ejecutar ciertos bloques de c�digo de acuerdo
		//al cambio en una variable, seg�n sea el caso
		
		//switch + ctrl + espacio + enter
		
		int dia =3;
		
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
		case 5:
			System.out.println("Viernes");
			break;
						
		default:
			System.out.println("Error");
			break;
		}
		
		

	}

}
