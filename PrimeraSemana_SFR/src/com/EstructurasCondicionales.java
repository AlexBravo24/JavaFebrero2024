package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		
		// Estructura de decision - if - evaluan
		//valores booleanos (si se cumple algo, se ejecuta
		//y si no; pues no se ejecuta)
		
		int x = 9;
		 
		/*
		 *si (se cumple esto){
		 *ejecutamos esto de aqui
		 *} 
		 */
         
//		if (x>10) {
//			System.out.println("Si");
//		}else { //En caso de que no se cumpla la condicion
//			//se ejectua la de aqui
//			System.out.println("No");
//		}
		
		//Condiciones Compuestas con operadores logicos
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//AND -&& - Devuelve el valor "true" cuandp se cumple 
		//TODAS las condiciones
//		if (x>5 && x<9) {
//			System.out.println("SI");
//			
//		} else {
//			System.out.println("No");
//		}
		
		
	//OR-  Devuelve true cuando se cumple al menos 
		// una condicion
		
//		if (x>5 ||  x<9) {
//		System.out.println("SI");
//		
//	} else {
//		System.out.println("No");
//	}
//	
		
		//IGUALDAD o Comprarcion - == - Revisa o compara
		// si el valor  es igual al que queremos comprarlo
		//un solo igual es para asignar y dos es para comprar (Operador)
		//Manda true si el valor es igual al que lo comparamos
//		if (x ==  20) {
//			System.out.println("SI");
//			
//		} else {
//			System.out.println("No");
//		}
		
		//DIFERENTE - != - Comprara los valores y mada true si son 
		//diferentes
//		if (x !=  20) {
//			System.out.println("SI");
//			
//		} else {
//			System.out.println("No");
//		}
//		
		//NOT - ! - Niega una condicion o mas bie, cambia el valor
		//de una condicion de true a false y vicerversa
//		if (!(x !=  20)) {
//			System.out.println("SI");
//		
//		} else {
//			System.out.println("No");
//		}
		
		//Estructura if-else concatenado o anidado
		
//		int dia = 0;
//		
//		if(dia ==1) {
//			System.out.println("lunes");
//		}else if (dia ==2) {
//			System.out.println("martes");
//		}else if (dia ==3) {
//			System.out.println("miercoles");
//		}else if (dia ==4) {
//			System.out.println("jueves");
//		}else if (dia ==5) {
//			System.out.println("viernes");
//		}else {
//			System.out.println("Error");
//		}
//		
//		
		
		//Estructura Switch-case
		//Es util para ejecutar ciertos bloques de codigo
		//de acuerdo al cambio en una variable,segun sea el caso
		 
		//swicth + ctlrl + espacio +enter
		
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
			System.out.println("jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		default:
			System.out.println("error");
			break;
		}
	}

}
