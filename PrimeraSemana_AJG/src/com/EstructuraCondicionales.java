package com;

public class EstructuraCondicionales {

	public static void main(String[] args) {
		/*
		 * Estrucutura de decision - if - evaluan
		 * valores booleanos (si se cumple algo, se ejecuta
		 * y si n , pues no se ejecuta)
		 */
		
		int x = 9;
		 /*
		  * si (se cumple esto){
		  * ejecutamos esto aqui
		  * }
		  * <>
		  */
//		if (x>10) {
//			System.out.println("Si");
//		}else { //En caso de que no se cumpla la condicion de ejecuta lo siguiente.
//			System.out.println("No");
//		}
//		
		//Condiciones Compuestas con operadores logicos
		//AND, OR, NOT, DIFERENTES DE, IGUALDAD
		
		/*
		 * AND - && - Devuelven el valor "true" cuando se cumplen todas la condiciones
		 * 
		 */
		
//		if (x>5 && x<15) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		 /*
		  * OR - || - DEVUELVE TRUE CUANDO SE CUMPLE ALMENOS UNA CONDICION
		  */
		
//		if (x>5 || x<9) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
		//IGUALDAD O Comparacion - == - Revisa o compara 
		//si el valor es igual al que queremos compararlo
//		if (x == 20) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		 /*
		  * DIFERENTE DE - != - Compara los valores y manda true
		  * si son diferentes
		  */
		
//		if (x != 20) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//NOT - ! - Niega una condicion o mas bien,
		//cambia el valor de una condicion de true a false o viceversa
		
//		if (!(x != 20)) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//Estrucutra if-else concatenado o anidado
		
//		int dia = 2;
//		if (dia == 1) {
//			System.out.println("Lunes");
//		}else if (dia == 2){
//			System.out.println("Martes");
//		}else if (dia == 3) {
//			System.out.println("Miercoles");
//		}else if (dia == 4) {
//			System.out.println("Juevez");
//		}else if (dia == 5) {
//			System.out.println("Viernes");
//		}else {
//			System.out.println("Error");
//		}
		
		
		//Estrucutra Switch-Case
		//Es util para ejecutar ciertos bloques de codigo de acuerdo
		// al cambio ded variable, segun sea el caso
		
		
		//switch + crtl + espacio
		
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
		case 5:
			System.out.println("Viernes");
			break;
		default:
			System.out.println("Error");
			break;
		}
	}

}
