package Condicionales;

import java.util.Scanner;

public class Condicionales6_DEOR {

	public static void main(String[] args) {
		
		/*6. La asociación de vinicultores tiene como política fijar un precio inicial al 
		 * kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
		 * Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se 
		 * requiere determinar cuánto recibirá un productor por la uva que entrega en un 
		 * embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20 céntimos 
		 * al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2. * Si es 
		 * de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es 
		 * de tamaño 2. Precio inicial se recibe desde teclado
		 */
		
		char tipo;
		int tamaño, kilo;
		double total;
		System.out.println("Cuantos kilos?");
		Scanner input = new Scanner (System.in);
		kilo = input.nextInt();	
		System.out.println("Tipo de producto? A o B");
		tipo = input.next().toUpperCase().charAt(0);
		System.out.println("Tamaño? 1 o 2");
		tamaño = input.nextInt();	
		
		if (tipo == 'A') {
			if (tamaño == 1) {
				total = kilo * .20;
				System.out.println("Tu total es de: " + total);
			}
			else if (tamaño == 2){
				total = kilo * .30;
				System.out.println("Tu total es de: " + total);
			}
			else if (tamaño != 2 && tamaño != 1) {
				System.out.println("Error al digitar un tamaño");
			}
		}
		else if (tipo == 'B') {
			if (tamaño == 1) {
				total = kilo * .30;
				System.out.println("Tu total es de: " + total);
			}
			else if (tamaño == 2){
				total = kilo * .50;
				System.out.println("Tu total es de: " + total);
			}
			else if (tamaño != 2 && tamaño != 1) {
				System.out.println("Error al digitar un tamaño");
			}
		}
	}
}
