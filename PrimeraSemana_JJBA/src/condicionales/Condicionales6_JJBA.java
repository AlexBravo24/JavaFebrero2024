package condicionales;

import java.util.Scanner;

public class Condicionales6_JJBA {

	public static void main(String[] args) {
		
		//Ejercicio6 - . La asociación de vinicultores tiene como política fijar un precio inicial al kilo 
//		de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
//		Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se 
//		requiere determinar cuánto recibirá un productor por la uva que entrega en un 
//		embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20 
//		céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de 
//		tamaño 2. * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 
//		50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde teclado

Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el precio inicial: ");
		
		double numero;
		
		numero = input.nextDouble();
		
		System.out.println("Ingrese el tipo de uva (A o B): ");
		
		String TipoUva;
		
		TipoUva = input.nextLine();
		
		System.out.println("Ingrese el tamaño de uva (1 o 2): ");
		
		int TamañoUva;
		
		TamañoUva = input.nextInt();
		
		
		if (TipoUva == "A") {
			if (TamañoUva == 1) {
			System.out.println( "PrecioFinal: " +(numero + 0.20));
			}else if (TamañoUva == 2) {
			System.out.println( "PrecioFinal: " +(numero + 0.30));
			}
		}else if (TipoUva == "B") {
			if (TamañoUva == 1) {
			System.out.println( "PrecioFinal: " +(numero - 0.30));
			}else if (TamañoUva == 2) {
			System.out.println( "PrecioFinal: " +(numero - 0.50));
			}
		}
		

	}

}
