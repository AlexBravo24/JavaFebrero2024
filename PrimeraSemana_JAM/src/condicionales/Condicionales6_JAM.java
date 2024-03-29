package condicionales;

import java.util.Scanner;

public class Condicionales6_JAM {

	public static void main(String[] args) {
		
		/*
		 *  La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo 
		 *  de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2).
		 *  Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se
		 *  requiere determinar cu�nto recibir� un productor por la uva que entrega en un
		 *  embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20
		 *  c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de
		 *  tama�o 2. * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y
		 *  50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde teclado
		 */

		Scanner input = new Scanner (System.in);
		float kilo,precio;
		String tipo;
		int tamano;
		
		System.out.print("Ingrese los kg:");
		kilo = input.nextFloat();
		
		System.out.print("Ingrese el precio:");
		precio = input.nextFloat();
		
		System.out.println("Ingrese el tipo (A o B):");
		tipo = input.next(); //Por qu� no funciona con .nextLine?? Porque consume un salto de l�nea haciendo esa la respuesta
		
		System.out.println("Ingrese el tipo (1 o 2):");
		tamano = input.nextInt();
		
		if (tipo.contentEquals("A") && tamano == 1) {
			System.out.println("La ganancia es de: "+((kilo*precio)+(kilo*0.20)));
		} else if (tipo.contentEquals("A") && tamano == 2) {
			System.out.println("La ganancia es de: "+((kilo*precio)+(kilo*0.30)));
		} else if (tipo.contentEquals("B") && tamano == 1) {
			System.out.println("La ganancia es de: "+((kilo*precio)-(kilo*0.30)));
		}else if (tipo.contentEquals("B") && tamano == 2) {
			System.out.println("La ganancia es de: "+((kilo*precio)-(kilo*0.50)));
		}
	}

}
