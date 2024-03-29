package condicionales;

import java.util.Scanner;

public class Condicionales6_JUMP {

	public static void main(String[] args) {
		
		//6. La asociaci�n de vinicultores tiene como pol�tica fijar un 
		//precio inicial al kilo de uva, la cual se clasifica en tipos 
		//(A y B), y adem�s en tama�os (1 y 2). 
		//Cuando se realiza la venta del producto, �sta es de un s�lo tipo 
		//y tama�o, se requiere determinar cu�nto recibir� un productor por
		//la uva que entrega en un embarque considerando lo siguiente: 
		// * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial 
		//cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2. * Si es 
		//de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos 
		//cuando es de tama�o 2. Precio inicial se recibe desde teclado
		
		Scanner scanner = new Scanner(System.in);
	    int kilos;
	    double precioInicial;
	    String tipo;
	    int tamano;

	    System.out.print("Introduce los Kilos de uva entregada: ");
	    kilos = scanner.nextInt();
	    System.out.print("Introduce precio por Kilo inicial: ");
	    precioInicial = scanner.nextDouble();
	    System.out.print("Introduce el tipo de uva 'A' o 'B': ");
	    tipo = scanner.next(); scanner.nextLine();
	    System.out.print("Introduce el tama�o de uva '1' o '2': ");
	    tamano = scanner.nextInt();

	    if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
	        (tamano == 1 || tamano == 2))) {
	      System.out.println("Tipo o tama�o incorrecto, vuelva a introducir los valores.");
	    } else {
	      if (tipo.toUpperCase().equals("A") && tamano == 1) {
	        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
	      } else if (tipo.toUpperCase().equals("A") && tamano == 2) {
	        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
	      } else if (tipo.toUpperCase().equals("B") && tamano == 1) {
	        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
	      } else if (tipo.toUpperCase().equals("B") && tamano == 2) {
	        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
	      }
	    }


	}

}
