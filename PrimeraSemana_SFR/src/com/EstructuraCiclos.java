package com;

public class EstructuraCiclos {

	public static void main(String[] args) {
		// Ciclos o tmabien llamados bucles.
		//Nos ayudan a ejecutar "n" veces una accion
		//de acuerdo a una condicion
		
		//En el caso de los ciclos nos apoyamos
		//en una variable casi simpre es numerica
		//anque tambien puede ser booleanan etc,
		//porque de acuerdo al cambio de la variable
		//es como se va ejacutar el codigo
		
		//while (Mientras....se cumpla una condicion)
		
		/*
		 * mientras (se cuemple esto){
		 * se ejecuta este codigo
		 * }
		 */

		int x= 1;
		 
		//while (x<5) {
			//System.out.println("Hola mundo");
			//voy a volver mi ciclo while determinado
			//agregar un incremento en mi vairable
			//x=x+1;
           //x++;
			
           
		//}
		
	//do-while- similar al cliclo while pero nos aseguramos 
	//que en caso de existir una condicion que posiblemente
	//no se cumpla, el programa se ejecuta por lo menos 
	//una vez
	//es decir en este caso primero se ejecuta y luego
	//se evalua
	
	/*
	 * ejecuta{
	 * esto..
	 * }mientras (se cumpla esto);
	 */
	//do {
		
		//System.out.println("hola mundo");
		
	//}while (x>2);

		
		//for - Determinado - Se utiliza cuando conocemos 
		//o tenemos una idea de cuentas veces queremos que
		//realice una accion
		/*
		 * para (estos argumentos){
		 * ejecuta este codigo
		 * }
		 * 
		 * para (una variable iniciada; condicion; incremento){
		 * ejecuta el codigo
		 * } 
		 */
		
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("hola mundo " + i);
			
			
		}
		
		
}
}
