package Condicionales;

import java.util.Scanner;

public class Condicionales6_DEOR {

	public static void main(String[] args) {
		
		/*6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al 
		 * kilo de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). 
		 * Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se 
		 * requiere determinar cu�nto recibir� un productor por la uva que entrega en un 
		 * embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20 c�ntimos 
		 * al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2. * Si es 
		 * de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es 
		 * de tama�o 2. Precio inicial se recibe desde teclado
		 */
		
		char tipo;
		int tama�o, kilo;
		double total;
		System.out.println("Cuantos kilos?");
		Scanner input = new Scanner (System.in);
		kilo = input.nextInt();	
		System.out.println("Tipo de producto? A o B");
		tipo = input.next().toUpperCase().charAt(0);
		System.out.println("Tama�o? 1 o 2");
		tama�o = input.nextInt();	
		
		if (tipo == 'A') {
			if (tama�o == 1) {
				total = kilo * .20;
				System.out.println("Tu total es de: " + total);
			}
			else if (tama�o == 2){
				total = kilo * .30;
				System.out.println("Tu total es de: " + total);
			}
			else if (tama�o != 2 && tama�o != 1) {
				System.out.println("Error al digitar un tama�o");
			}
		}
		else if (tipo == 'B') {
			if (tama�o == 1) {
				total = kilo * .30;
				System.out.println("Tu total es de: " + total);
			}
			else if (tama�o == 2){
				total = kilo * .50;
				System.out.println("Tu total es de: " + total);
			}
			else if (tama�o != 2 && tama�o != 1) {
				System.out.println("Error al digitar un tama�o");
			}
		}
	}
}
