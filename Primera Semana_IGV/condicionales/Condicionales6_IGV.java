package condicionales;

import java.util.Scanner;

public class Condicionales6_IGV {

	public static void main(String[] args) {
		/*
		6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo 
		de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). 
		Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se 
		requiere determinar cu�nto recibir� un productor por la uva que entrega en un 
		embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20 
		c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de 
		tama�o 2. * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 
		50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde teclado
		*/
		
		String tipo;
		int tama�o;
		double precio;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Cual es el precio de la Uva:");
		precio = input.nextFloat();
		
		System.out.println("Cual es el tipo de la UVA:");
		tipo = input.next();
		
		System.out.println("Cual es el tama�o de la UVA:");
		tama�o = input.nextInt();
		
		if (tipo.contains("A") && tama�o == 2 ) {
			precio = precio + 0.3;
			System.out.println("El precio final de UVA por kilo: " + precio);
		} else if (tipo.contains("A") && tama�o == 1) {
			precio = precio + 0.2;
			System.out.println("El precio final de UVA por kilo: " + precio);
		} else if (tipo.contains("B") && tama�o == 1) {
			precio = precio - 0.3;
			System.out.println("El precio final de UVA por kilo: " + precio);
		} else if (tipo.contains("B") && tama�o == 2) {
			precio = precio - 0.5;
			System.out.println("El precio final de UVA por kilo: " + precio);
		}


	}

}
