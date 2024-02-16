package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//CICLOS o también llamados bucles.
		//Nos ayudan a ejecutar "n" veces una acción de acuerdo
		//a una condición.
		
		//En el caso de los ciclos nos apoyamos en una variable, casi 
		//siempre es numérica aunque también puede ser booleana, etc.
		//Porque de acuerdo al cambio de la variable es como
		//se va a ejecutar el código.
		
		//while (mientras... se cumpla una condición)
		/*
		 * mientras (se cumpla esto) {
		 * se ejecuta este código
		 * }
		 */

		int x = 1;
		
//		while (x<5) {
//			System.out.println("Hola, mundo.");
//			//Voy a volver mi ciclo while determinado
//			//agregando un incremento en mi variable
//			//x=x+1; //x aumenta su valor y se detiene al llegar a valer 5
//			x++; // lo mismo que lo anterior, aumentara 1 en 1 cada que inicie el ciclo.
//		}
		
		//do-while - similar al ciclo while, pero nos aseguramos
		//que en caso de existir una condición posiblemente no se cumpla,
		//el programa se ejecute por lo menos una vez.
		//Es decir, en este caso, primero se ejecuta y luego se evalúa.
		
		/*
		 * ejecuta {
		 * esto...
		 * }mientras (se cumpla esto);
		 */
		
//		do {  //sirve para pedir una contraseña
//			System.out.println("Hola, mundo");
//			//el incremento se pone en el do (x++;)
//		}while (x>2);
		
		
		//for - ciclo determinado - se utiliza cuando conocemos o tenemos
		//una idea de cuántas veces queremos que realice una acción.
		
		/*
		 * para (estos argumentos) {
		 * ejecuta este código
		 * }
		 * 
		 * para (una variable iniciada; condición; incremento){
		 * ejecuta el código
		 * }
		 */
		
		for (int i = 1; i < 5; i++) { //for + ctrl + espacio para obtener todo
			System.out.println("Hola, mundo."+i);
		}
		
		
		
	}

}
