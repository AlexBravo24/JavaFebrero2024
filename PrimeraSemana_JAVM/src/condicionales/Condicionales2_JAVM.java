package condicionales;

import java.util.Scanner;

public class Condicionales2_JAVM {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce un numero ");
		int numero = input.nextInt();
		if (numero % 2 == 0) {
			System.out.println("el numero: "+ numero + " es par.");
		}else {
			System.out.println("el numero: "+ numero + " es impar.");
		}

	}

}
