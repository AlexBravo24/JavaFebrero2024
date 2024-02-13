package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		/*
		 * Ciclos o bucles
		 * 
		 * Nos ayudan a ejecutar 'n' veces una acci�n de acuerdo a
		 * una condici�n.
		 * 
		 * En el caso de los ciclos nos apoyamos en una variable,
		 * generalmente es una variable numerica, aunque tambi�n 
		 * puede ser booleana porque de acuerdo al cambio de la
		 * variable es como se ejecutar� el c�digo
		 */
		
		//Ciclo while (Mientras se cumpla esta condici�n se ejecutar� algo)
		//Sintaxis:
		/*
		 * while (se cumpla esto..){
		 * se ejecuta este c�digo
		 * }
		 */
		
		int x = 1;
//		
//		while (x<5) {
//			System.out.println("Hola mundo"); //Hasta aqu� se imprimir�a de manera infinita porque no es determinado
//			//Para volver el ciclo while determinado agregamos un contador o incremento
//			x++; // El valor de x se incrementa en 1 n cantidad de veces (hasta que se cumpla la condici�n)		
		
		//Ciclo Do While - Similar al ciclo while pero nos aseguramos que en caso de existir una condici�n
		//que posiblemente no se cumpla, el programa se ejecute por lo menos una vez
		//En este caso, primero se ejecuta y luego se evalua
		
		//Sintaxis:
		/*
		 * do{
		 * esto...
		 * }while (se cumpla esto);
		 */
			
//		do {
//			System.out.println("Hoola mundo");
//		}while (x>2); //Solo se ejecutar� 1 vez porque la condici�n es imposible mientras x=1;
		
		
		//Ciclo for (determinado) - Se utiliza cuando conocemos o tenemos una idea de cuantas veces queremos que
		//se realice una acci�n
		
		//Sintaxis
		/*
		 * for (estos argumentos){
		 * ejecuta este c�digo
		 * }
		 * 
		 * for (una variable iniciada; condici�n; incremento;){
		 * ejecuta este c�digo
		 * }
		 *
		 */
		
		for (int i = 1; i < 5; i++) {
			System.out.println("Holaa mundo"+i);
			
		}
		
		

	}

}
