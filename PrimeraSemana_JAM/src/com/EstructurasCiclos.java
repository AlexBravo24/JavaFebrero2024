package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		/*
		 * Ciclos o bucles
		 * 
		 * Nos ayudan a ejecutar 'n' veces una acción de acuerdo a
		 * una condición.
		 * 
		 * En el caso de los ciclos nos apoyamos en una variable,
		 * generalmente es una variable numerica, aunque también 
		 * puede ser booleana porque de acuerdo al cambio de la
		 * variable es como se ejecutará el código
		 */
		
		//Ciclo while (Mientras se cumpla esta condición se ejecutará algo)
		//Sintaxis:
		/*
		 * while (se cumpla esto..){
		 * se ejecuta este código
		 * }
		 */
		
		int x = 1;
//		
//		while (x<5) {
//			System.out.println("Hola mundo"); //Hasta aquí se imprimiría de manera infinita porque no es determinado
//			//Para volver el ciclo while determinado agregamos un contador o incremento
//			x++; // El valor de x se incrementa en 1 n cantidad de veces (hasta que se cumpla la condición)		
		
		//Ciclo Do While - Similar al ciclo while pero nos aseguramos que en caso de existir una condición
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
//		}while (x>2); //Solo se ejecutará 1 vez porque la condición es imposible mientras x=1;
		
		
		//Ciclo for (determinado) - Se utiliza cuando conocemos o tenemos una idea de cuantas veces queremos que
		//se realice una acción
		
		//Sintaxis
		/*
		 * for (estos argumentos){
		 * ejecuta este código
		 * }
		 * 
		 * for (una variable iniciada; condición; incremento;){
		 * ejecuta este código
		 * }
		 *
		 */
		
		for (int i = 1; i < 5; i++) {
			System.out.println("Holaa mundo"+i);
			
		}
		
		

	}

}
