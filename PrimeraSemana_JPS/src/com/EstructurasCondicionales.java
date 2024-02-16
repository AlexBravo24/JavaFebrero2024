package com;

import java.lang.invoke.SwitchPoint;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// Estructuras de desicion - ir - evaluan
		//valores booleanos (si se cumple algo, se ejecuta)

		int x = 9; 
		
		/*
		 *  si (se cumple esto) {
		 *  ejecutamos esto de qui 
		 *  }
		 */
		
//		if (x>10) {
//			System.out.println("Si");
//			
//				}else {
//					System.out.println("No");
//				}
		
		//Condiciones Compuestas con operadores logicos
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//AND - && - Devuelven el valor "true" cuando se cumplen
		//todas las condiciones 
//		if (x>5 && x<15) {
//			System.out.println("Si");
//		}else {
//			System.out.println("si");
//			}
		
		//OR || - Devuelve true cuando se cumple al menos 
		//una condicion
//		if (x>5 || x<15) {
//			System.out.println("Si");
//		}else {
//			System.out.println("si");
//			}
		//IGUALDAD O Comparacion - == Revisa o compara
		//si el valor es igual al que queremos compararlo
		//Un solo igual es para asignar y dos es para comparar(operar
		//manda true si el valor es igual al que lo comparamos
//		if(x==20) {
//			System.out.println("si");
//		}else {
//			System.out.println("No");
//		}

		//DIFERENTE DE -! = - Compara los valores y manda true si son
		//diferentes
		
//		if(x !=20) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//			
//		}
	
		//NOT -!- Niega una condicion o mas bien, cambia el valor
		// de una condicion de true a false y viceversa
//		if(!(x != 20)) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//Estructura if-else concatenado o anidado
		// 
//		int dia = 0;
//		
//		if(dia == 1) { 
//			System.out.println("Lunes");
//		}else if (dia == 2) {
//			System.out.println("Martes");
//		}else if (dia == 3) {
//			System.out.println("Miercoles");
//		}else if (dia == 4) {
//			System.out.println("jueves");
// 		}else if (dia == 5) {
//			System.out.println("Viernes");
//		}else {
//			System.out.println("Error");
//		}
//		
		//Estructura Switch-Case 
		//Es util para ejecutar ciertos bloues de codigo 
		//sw acuerdo al cambio en una variable, segun sea el caso
		
		//Switch + ctrl + espacio + enter
		
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

		
		
		 
		
	
		
	}//cierre de main
	
	
}
