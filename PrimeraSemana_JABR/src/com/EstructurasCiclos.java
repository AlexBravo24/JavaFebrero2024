package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//CICLOS, o también llamados bucles.
		//Nos ayudan a ejecutar "n" veces una acción
		//de acuerdo a una condición
		
		//En el caso de los ciclos nos apoyamos
		//en una variable, casi siempre es numérica
		//aunque también puede ser booleana, etc.
		//Porque de acuerdo al cambio de la variable
		//es como se va a ejecutar el codigo
		
		//while (Mientras... se cumpla una condición)
		
		/*
		 * mientras (se cumpla esto){
		 * se ejecuta este codigo
		 * }
		 */
		
		int x = 1;
		
//		while (x<5) {
//			System.out.println("Hola mundo");
//			//Voy a volver mi ciclo while determinado
//			//agregando un incremento en mi variable
//			//x=x+1;
//			x++;
//		}
		
		//do-while - Similar al ciclo while, pero nos aseguramos
		//que en caso de existir una condicion que posiblemente
		//no se cumpla, el programa se ejecute por lo menos
		//una vez
		//Es decir, en este caso, primero se ejecuta y luego
		//se evalua
		
		/*
		 * ejecuta {
		 * esto....
		 * }mientras (se cumpla esto);
		 */
			
		do {
			System.out.println("Hola mundo");
		}while (x>2);
		
		
		//for - Determinado - Se utiliza cuando conocemos
		//o tenemos una idea de cuantas veces queremos que
		//realice una acción
		
		/*
		 * para (estos argumentos){
		 * ejecuta este codigo
		 * }
		 * 
		 * para (una variable iniciada; condicion; incremento){
		 * ejecuta el codigo
		 * }
		 */
		
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("Hola mundo " + i);
//		}
//		
		

	}

}
