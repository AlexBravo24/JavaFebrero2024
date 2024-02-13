package condicionales;

import java.util.Scanner;

public class Condicionales6_IGV {

	public static void main(String[] args) {
		/*
		6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo 
		de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
		Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se 
		requiere determinar cuánto recibirá un productor por la uva que entrega en un 
		embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20 
		céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de 
		tamaño 2. * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 
		50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde teclado
		*/
		
		String tipo;
		int tamaño;
		double precio;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Cual es el precio de la Uva:");
		precio = input.nextFloat();
		
		System.out.println("Cual es el tipo de la UVA:");
		tipo = input.next();
		
		System.out.println("Cual es el tamaño de la UVA:");
		tamaño = input.nextInt();
		
		if (tipo.contains("A") && tamaño == 2 ) {
			precio = precio + 0.3;
			System.out.println("El precio final de UVA por kilo: " + precio);
		} else if (tipo.contains("A") && tamaño == 1) {
			precio = precio + 0.2;
			System.out.println("El precio final de UVA por kilo: " + precio);
		} else if (tipo.contains("B") && tamaño == 1) {
			precio = precio - 0.3;
			System.out.println("El precio final de UVA por kilo: " + precio);
		} else if (tipo.contains("B") && tamaño == 2) {
			precio = precio - 0.5;
			System.out.println("El precio final de UVA por kilo: " + precio);
		}


	}

}
