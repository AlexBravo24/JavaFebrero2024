package condicionales;

import java.util.Scanner;

public class Condicionales6_SFR {

	public static void main(String[] args) {
		
		//6.La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo
		//de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2).
		//Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se
		//requiere determinar cu�nto recibir� un productor por la uva que entrega en un
		//embarque considerando lo siguiente: 
		//* Si es de tipo A, se le cargan 20
		//c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de
		//tama�o 2. 
		//* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y
		//50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde teclado
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("ingrese el presio inicial del kilo de uva");
		double precioInicial= input.nextDouble();
		 System.out.println("Ingrese el tipo de uva (A o B)");
		 char tipoUva = input.next().charAt(0);
	        System.out.print("Ingrese el tama�o de uva (1 o 2): ");
	        int tamanoUva = input.nextInt();
		  double precioFinal = 0.0;
	        if (tipoUva == 'A') {
	            if (tamanoUva == 1) {
	                precioFinal = precioInicial + 0.20;
	            } else if (tamanoUva == 2) {
	                precioFinal = precioInicial + 0.30;
	            }
	        } else if (tipoUva == 'B') {
	            if (tamanoUva == 1) {
	                precioFinal = precioInicial - 0.30;
	            } else if (tamanoUva == 2) {
	                precioFinal = precioInicial - 0.50;
	            }
	        }

	       
	        System.out.println("El precio final por kilo de uva es: " + precioFinal);

	        
		
	}

}
