package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras de decision -if- evaluan valores booleanos(si se cumple algo se ejecuta o no se ejecuta)
		
		int x = 9;
		/* si (se cumpe esto ) {ejecutamos esto}
		 * 
		 */
//		if (x>10) {
//			System.out.println("Si");
//		}else {
//				System.out.println("No es mayor");
//			}
//		//condiciones compuestas con operadores logicos 
		//AND,OR,NOT,DIFERENTE DE ,IGUALDAD
		//ADN - && - devuelven el valor "true" cuando se cumplen todas la condiciones
//		if (x>5 && x<9) {
//			System.out.println("si");
//		
//	} else {
//		System.out.println("no");
//	}
		//OR - || devuelve true cuando se cumple almenos una condicion
//		if (x>10 || x<7) {
//			System.out.println("si");
//		
//	} else {
//		System.out.println("no");
//	}
		
		//IGUALDAD o Comparacion -==- revisa o compara si el valor es igual al que queremos compararlo
//		if (x == 20) {
//			System.out.println("si");
//		} else {
//			System.out.println("no");
//		}
		//Diferente de - != -  compara los valores y manda true si son diferentes
//		if (x != 20) {
//			System.out.println("si");
//		} else {
//			System.out.println("no");
//		}
		//NOT - !- Niega una condicion o mas bien cambia el valor de una condicion de true a false y vicebersa
//		if (!(x != 9)) {
//			System.out.println("si");
//		} else {
//			System.out.println("no");
//		}
		//estructura if-else concatenado o anidado
//		int dia = 0;
//		if (dia = 1) {
//			System.out.println("Lunes");
//		}else if (dia == 2) {
//				System.out.println("martes");
//		}else if (dia==3) {
//			System.out.println("miercoles");
//		}else if(dia==4) {
//			System.out.println("jueves");
//		}else if(dia==5) {
//			System.out.println("viernes");
//		}else {
//			System.out.println("Error");
//		}
		
		//estructura Switch-Case
		// Es util para ejecutar ciertos bloques de codigos de acuerdo al cambio en una variable, segun sea el caso
		int dia = 3;
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

				default:
					System.out.println("Error");
					break;
				}
	}
	}
	


