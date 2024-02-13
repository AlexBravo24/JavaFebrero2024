package Condicionales;

import java.util.Scanner;

public class Condicionales8_DEOR {

	public static void main(String[] args) {
		
		/*8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar 
		 * un dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara 
		 * opuesta al resultado obtenido. Nota 1: En las caras opuestas de un dado de seis caras están 
		 * los números: 1-6, 2-5 y 3-4. Nota 2: Si el número del dado introducido es menor que 1 o 
		 * mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto”.
		 */
	
		int cara;
		System.out.println("Introduce un numero equivalente a la cara del dado");
		Scanner input = new Scanner (System.in);
		cara = input.nextInt();
		
		if (cara == 1) {
			System.out.println("La cara contraria es 6");
		}
		else if (cara == 2){
			System.out.println("La cara contraria es 5");
		}
		else if (cara == 3){
			System.out.println("La cara contraria es 4");
		}
		else if (cara == 4){
			System.out.println("La cara contraria es 3");
		}
		else if (cara == 5){
			System.out.println("La cara contraria es 2");
		}
		else if (cara == 6){
			System.out.println("La cara contraria es 1");
		}	
		else if(cara < 1 || cara > 6){ 
			System.out.println("Numero incorrecto");
		}
	}
}
