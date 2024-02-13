package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		//Ciclos o tambien llamados blucles- nos ayuda a ejecutar "n" veces una accion de acuerdo a una condicion
		// En el caso de los ciclos nos apoyamos en una variable , casi siempre es numerica ,aunque tambien puede ser
		//booleana. Porque de acuerdo a la variable es como se va a ejecutar codigo
		
		//while (mientas ... se cumpla una condicion va a ejecutar algo)
		
		// mientas (se cumpla esto){
		//ejecuta este codigo
		//}
		
		int x = 1;
		
//		while (x<5) {
//			System.out.println("Hola mundo");
//			//Voy a volver mi ciclo while determinado agregando un incremento en mi variable
//			//incremento de 1 en 1 se puede expresar asi x=x+1; o asi:
//			x++;
//		}
		
		//do-while - similar al ciclo while ,pero nos aseguramos que en caso de existir una condicion que posiblemente no 
		//se cumpla el programa por lo menos se ejecute una vez
		//Es decir primero se ejecuta y luego se evalua
		/*
		 * ejecuta{
		 * esto....
		 * }mientras (se cumpla esto):
		 */
		
//		do {
//			System.out.println("Hola mundo");
//			
//		}while (x>2);
		
		//for - Determinado- Se utiloza cuando conocemos  o tenemos una idea de cuantas veces queremos que realice una
		//accion
		
		/*
		 * para (estos argumentos){
		 * ejecuta este codigo
		 * }
		 * 
		 * para(una variable iniciada;condicion;incremento){
		 * ejecuta el codigo
		 * }
		 */
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hola mundo " + i);
		}
				
	}

}
