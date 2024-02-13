package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		//Estructuras de decision-if
		//Evalua valores booleanos (se jecuta si se cumple la condicion)
		int x =9;
		/*si (se cumple esto){
		 * se ejecuta esto
		 * }*/
		if (x>5) 
		{
			System.out.println("Si");
		}
		else{
			System.out.println("No");
			}

	
	//Condiciones compuestas con operadores logicos
	// AND, OR , NOT, DIFERENTE DE , IGUALDAD
	
		//AND - && - Devuelven el valor "true" cuando se cumplen todas las condiciones
		if (x>5 && x<9) {
			System.out.println("Si cumplió el AND");
		}else {
			System.out.println("No cumplió el AND");
		}
		
		// OR - || - Devuelve true cuando se cumple al menos una condicion
		
		if (x>10 || x<9) {
			System.out.println("Si cumplió el OR");
		}else {
			System.out.println("No cumplió el OR");
		}
		
		//IGUALDAD - == -Revisa o compara si el valor es igual al que queremos comparar 
		if(x==20) {
			System.out.println("Si se cumple la igualdad");
		} else {
			System.out.println("No se cumple la igualdad");
		}
		
		//DIFERENTE DE - ! - Compara valores y manda true si es diferente
		if(x!=20) {
			System.out.println("Si son diferentes");
		} else {
			System.out.println("No son diferentes");
		}
		
		//NOT - ! - Niega una condicion o mas bien, cambie el valor de true por false y viceversa
		if(!(x!=20)) {
			System.out.println("Si,no son diferentes");
		} else {
			System.out.println("No,si son diferentes");
		}
		
		//Estructura if-else concatenado o anidado
		
		int dia = 2;
		
		if (dia==1) {
			System.out.println("Lunes");
		}else if(dia==2){
			System.out.println("Martes");
		}else if (dia ==3){
			System.out.println("Miercoles");
		}else if (dia ==4){
			System.out.println("Jueves");
		}else if (dia ==5){
			System.out.println("Viernes");
		}else {
			System.out.println("Error");
		}
		
		//Estructura switch case
		//Es util para ejecutar ciertos bloques de codigo de acuerdo al cambio de una 
		//variable
		int diaN = 3;
		switch (diaN) {
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
		case 6:
			System.out.println("Sabado");
			break;

		default:
			System.out.println("Desconocido");
			break;
		}
	}
	

}
