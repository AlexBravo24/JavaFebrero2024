package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//CICLOS o tambi�n llamados bucles.
		//Nos ayudan a ejecutar "n" veces una acci�n de acuerdo
		//a una condici�n.
		
		//En el caso de los ciclos nos apoyamos en una variable, casi 
		//siempre es num�rica aunque tambi�n puede ser booleana, etc.
		//Porque de acuerdo al cambio de la variable es como
		//se va a ejecutar el c�digo.
		
		//while (mientras... se cumpla una condici�n)
		/*
		 * mientras (se cumpla esto) {
		 * se ejecuta este c�digo
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
		//que en caso de existir una condici�n posiblemente no se cumpla,
		//el programa se ejecute por lo menos una vez.
		//Es decir, en este caso, primero se ejecuta y luego se eval�a.
		
		/*
		 * ejecuta {
		 * esto...
		 * }mientras (se cumpla esto);
		 */
		
//		do {  //sirve para pedir una contrase�a
//			System.out.println("Hola, mundo");
//			//el incremento se pone en el do (x++;)
//		}while (x>2);
		
		
		//for - ciclo determinado - se utiliza cuando conocemos o tenemos
		//una idea de cu�ntas veces queremos que realice una acci�n.
		
		/*
		 * para (estos argumentos) {
		 * ejecuta este c�digo
		 * }
		 * 
		 * para (una variable iniciada; condici�n; incremento){
		 * ejecuta el c�digo
		 * }
		 */
		
		for (int i = 1; i < 5; i++) { //for + ctrl + espacio para obtener todo
			System.out.println("Hola, mundo."+i);
		}
		
		
		
	}

}
