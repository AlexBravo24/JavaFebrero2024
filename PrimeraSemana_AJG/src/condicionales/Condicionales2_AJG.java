package condicionales;

import java.util.Scanner;

public class Condicionales2_AJG {

	public static void main(String[] args) {
//		2.Realiza un programa que pida un n�mero por teclado y nos indique si es par 
//		o impar
		int numero;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el Numero: ");
		numero = input.nextInt();
		
//		Aqu� utilizo el operador % (m�dulo) para obtener 
//		el residuo de la divisi�n entre numero y 2. 
//		Si el residuo es cero, el n�mero es par; de lo contrario, es impar.
		
		if (numero % 2 == 0) {
			System.out.println("El Numero es Par");
		}else {
			System.out.println("El numero Ingresado es Impar");
			
		}
			
	}

}
