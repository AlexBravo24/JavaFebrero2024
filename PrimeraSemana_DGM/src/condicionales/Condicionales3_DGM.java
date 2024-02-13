package condicionales;

import java.util.Scanner;

public class Condicionales3_DGM {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.

	int Numero1;
	int Numero2;
	double Division;
	
 Scanner Entrada = new Scanner(System.in);
 
 System.out.print("Digite el Primer Numero: ");
 Numero1 = Entrada.nextInt();
 
 System.out.print("Digite el Segundo Numero: ");
 Numero2 = Entrada.nextInt();
 
 if (Numero2 == 0) {
	 System.out.println("Error, no se puede dividir entre 0");
 }
 
   Division = Numero1 / Numero2;
	
	System.out.println("El resultado de la Division es:" +Division);
}
}
