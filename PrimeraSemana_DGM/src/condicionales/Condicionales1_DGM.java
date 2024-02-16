package condicionales;

import java.util.Scanner;

public class Condicionales1_DGM {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es 
		//mayor o si son iguales.

 int Numero1; 
 int Numero2;
 
 Scanner Entrada = new Scanner(System.in);
 
 System.out.print("Digite el primer numero :");
 Numero1 = Entrada.nextInt();
 
 System.out.print("Digite el segundo nuemero :");
 Numero2 = Entrada.nextInt();
 
 if(Numero1 > Numero2) {
	 System.out.println("El Numero1 es mayor");
 }
 else if (Numero2 > Numero1) {
	 System.out.println("El numero2 es mayor");
 }
 else {
	 System.out.println("Los numeros son igiales");
 }
	}

}
