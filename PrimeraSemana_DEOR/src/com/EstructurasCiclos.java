package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		  
		//CICLOS O BUCLES
		//Ejecutan "n" veces una accion, de acuerdo a una condicion
		
		//En el caso de los ciclos nos apoyamos de una variable, casi siempre numerica, 
		//tambien puede ser booleana, segun el cambio de la variable, es como se ejecuta el codigo.
		
		//WHILE (Mientras.... se cumpla la condicion){
		//se ejecuta el codigo }
		
		int x = 1;
//		
//		while (x<5) {
//			System.out.println("Hola mundo");
//			//x=x+1;
//			//x++;
//			x+=2;
			
			
		//DO-WHILE
		//Se ejecuta 1 vez, luego evalua
			
		//ejecuta {esto...
		//}mientras (se cumple esto)
			
//		do {
//			System.out.println("Hola mundo");
//			//x++; si se necesita salir del ciclo puede incrementar o reducir desde dentro del do
//		}while (x>2);
//	}
		
		//FOR - Se usa cuando conocemos cuantas veces necesitamos realizar una accion
		
		//para (estos argumentos) {
		//ejecuta este codigo }
		
		//para (una variable iniciada; condicion; incremento){
		//ejecuta el codigo}
		
		for (int i = 1; i < 5; i++) {
			System.out.println("Hola mundo" + i);
		}

	}
}