package com;

public class Cicloz {

	public static void main(String[] args) {
		// CICLOS o bucles 
		//Nos ayuda a ejecutar "n" veces una accion 
		//de acuerdo a una condicion 
		
		//En el caso de los ciclos nos apoyamos 
		// en una variable, casi siempre es numerica
		//Porque de acuerdo al cambio de la variable 
		// es como se va a ejecutar el codigo 
		
		// while (mientras... se cumpla una condicion)
		
		/*
		 * mientras (se cumpla esto){
		 * se ejecuta este codigo 
		 * }
		 */
		
	//	int x = 1;
//		
//		while (x<5) {
//			System.out.println("Hola mundo");
//			// Voy a volver mi ciclo while determinado
//			// agregando un incremento en mi variable 
//			x=x+1;
//			x+=2;
//			
			
//		}
		
		//do-while- Similar al ciclo while, pero nos aseguramos 
		//que en caso de existir una condicion que posibiblemente
		// no se cumpla, el programa se ejcute por lo menos
		// una vez 
		//Es decir, en este caso, primero se ejecuta y luego 
		//se evalua
		
		/*
		 * ejecuta{
		 * esto...
		 * }mientas (se cumpla esto);
		 */
	//	do {
	//		System.out.println("Hola mundo");
	//	}while (x>2);
		
		//for-Determinado-Se utiliza cuando conocemos 
		//o tenemos una idea de cantas veces queremos 
		// realice una accion.
		
		/*
		 * para (estos argumentos){
		 * ejecuta este codigo
		 * }
		 * 
		 * para(una variable iniciada; condicion; incremento)
		 * ejecuta el codigo 
		 * }
		 */
	
		for (int i = 1; i < 5; i++) {
			System.out.println("Hola mundo" + i);
			
		}
	}
	}


