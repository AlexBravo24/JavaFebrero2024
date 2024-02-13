package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// Ciclos o tambien llamados bucles
		//Nos ayudan a ejecutat N veces una accion
		// De acuerdo a una condicion
		
		
		//En el caso de los ciclos nos apoyamos en una variable
		//casi siempre es numerica, aunque tambien puede ser booleana, etc..
		// de acuerdo al cambio de la variable es como se va a ejecutar el codigo
		
		int x=1;
		//CICLO WHILE (mientras... se cumpla una condicion)
		/*
		 * mientras (se cumpla esto){
		 * se ejecuta esto}*/
		/*int x=1;
		while (x<5) {
			System.out.println("Hola mundo");
			//El ciclo se vuelve determinado al agregar un incremento en la variable
			x=x+1;
			
		}*/
		
		//do-while- Similar al ciclo while, pero nos aseguramos que 
		// en caso de existir una condicion que posiblemente no se cumple, el programa
		// se ejecute por lo menos una vez
		// Es decir, en este caso, primero se ejecuta y loego se evaluea
		
		/*ejecuta{
		 * esto...}mientras(se cumpla esto)
		 * */
		/*do {
			System.out.println("Hola mundo");
			
		}while (x>2);*/
		
		//for-Determinado--
		/*
		 * Se utiliza cuando conocemos o tenemos una idea de cuantas veces queremos que 
		 * realice una accion
		 * 
		 * 
		 * 
		 * 
		 * for/para (estos argumentos){
		 * ejecuta este codigo
		 * }
		 * 
		 * for(una variable iniciada;condicion;incremento){
		 * ejjecuta lo que hay aqui
		 * }
		*/
		for (int i=1;i<5;i++) {
			System.out.println("Hola mundo");
		}
	}

}
