package condicionales;

import java.util.Scanner;

public class Condicionales6_DGM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 int Precio_Uva;
 double Precio_Total;
 char Tipo;
 int Tamaño;
 
 Scanner Entrada = new Scanner(System.in);
 
 System.out.print("Digite el Precio de La Uva por Kilo: $");
 Precio_Uva = Entrada.nextInt();
 
 System.out.print("Digite el Tipo de Uva:\n"
		           +"1.- Tipo A\n"
		           + "2.- Tipo B\n"
		           + ": ");
 Tipo =  Entrada.next().charAt(0);
 
 System.out.print("Digite el Tamaño de la Uva: ");
 Tamaño = Entrada.nextInt();
 
 if (Tipo == 'A' && Tamaño == 1) {
	 Precio_Total = Precio_Uva + 0.2;
	 System.out.println("El Precio de la Uva Tipo A y Tamañano 1 es: $"+Precio_Total);
 }	
 
 else if (Tipo == 'B' && Tamaño == 2) {
	 Precio_Total = Precio_Uva + 0.3;
	 System.out.println("El Precio de la Uva Tipo A y Tamañano 2 es: $"+Precio_Total);
 }	
 
 else if (Tipo == 'B' && Tamaño == 1) {
	 Precio_Total = Precio_Uva - 0.3;
	 System.out.println("El Precio de la Uva Tipo B y Tamañano 1 es: $"+Precio_Total);
 }	
 
 else if (Tipo == 'B' && Tamaño == 2) {
	 Precio_Total = Precio_Uva - 0.5;
	 System.out.println("El Precio de la Uva Tipo B y Tamañano 2 es: $"+Precio_Total);
 }	
 
 else {
	 System.out.println("Error Digite unos valores Validos");
 }
	}

}
