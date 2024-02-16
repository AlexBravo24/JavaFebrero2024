package condicionales;

import java.util.Scanner;

class Condicionales8_DGM {

	public static void main(String[] args) {
		// 8
 int Numero_Dado;
 
 Scanner Entrada = new Scanner(System.in);
 
 System.out.print("Digite el numero del DADO: ");
 Numero_Dado = Entrada.nextInt();
 
 if (Numero_Dado == 1) { 
    System.out.println("La cara opuesta es SEIS");
 }
 else if (Numero_Dado == 6) {
	 System.out.println("La cara opuesta es UNO");
 }
 else if (Numero_Dado == 2) {
	 System.out.println("La cara opuesta es CINCO");
 }
 else if (Numero_Dado == 5) {
	 System.out.println("La cara opuesta es DOS");
 }
 else if (Numero_Dado == 3) {
	 System.out.println("La cara opuesta es CUATRO");
 }
 else if (Numero_Dado == 4) {
	 System.out.println("La cara opuesta es TRES");
 }	
	}

}
