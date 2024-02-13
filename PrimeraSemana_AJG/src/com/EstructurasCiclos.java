package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		/*CICLOS, o tambien llamados buclis, nos ayudadn
		 * a ejecutar "n" veces una accion de cuaerdo
		 * a una condicion
		 * 
		 * En el caso delos ciclos nos apoyamos 
		 * en una varibale, casi siempre es numerica, aunque tambien
		 * puede ser booleana, etc.
		 * Porque de acuerso al cambio de la varibale
		 * es como se va a ejecutar el codigo.
		 * 
		 * while (Mientras ..... se cumpla una condicion);
		 * 
		 * mientras (se cumpla esto){
		 * se ejecuta este codigo
		 * }
		 */
		
		int x = 1;
//		while (x < 5) {
//			System.out.println("Hola Mundo");
//			/*
//			 * Voy a vovler mi ciclo while determinado
//			 * agregando un incremento en mi variable
//			 */
//			//x = x + 1;
//			//x++;
//		}
		
		
		/*
		 * do-while - Similar al ciclo while, pero nos aseguraos que en caso
		 * de existir una condicion que posiblemenete no se cumpla, 
		 * el programa se ejecutapor lo menos una vez,.
		 * Es decir, en etse caso, primero se ejecuta y lueg se evalua
		 * 
		 * 
		 * ejecuta{
		 * esto...
		 * }mientras (se cumpla esto);
		 */
//		do {
//			System.out.println("Hola Mundo");
//			//en caso de que el resultado se vaya al infinito solo poner:
//			//x++;
//		}while (x > 2);
		
		
		
		/*
		 * for - Determinado- Se utiliza cuando conocemos o tenemos
		 * una idea de cuentas veces queremos que realice una accion.
		 * 
		 * 
		 * para (estos argumentos){
		 * ejecuta este codigo
		 * }
		 * 
		 * para (una variable iniciada; condicion; incremento){
		 *  ejecutar el codigo
		 * }
		 */
		
		for (int i = 1; i < 5; i++) {
			System.out.println("Hola Mundo" + i);
		}
	}

}
