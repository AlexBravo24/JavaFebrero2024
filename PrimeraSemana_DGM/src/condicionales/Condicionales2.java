package condicionales;

import java.util.Scanner;

public class Condicionales2 {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par 
		//o impar.
 
	int Numero1;
		
	Scanner Entrada = new Scanner(System.in);
	
	System.out.print("Digite un Numero :");
	Numero1 = Entrada.nextInt();
	
	
	if (Numero1%2 == 0) {
		System.out.println("El numero es PAR");
	}
	else {
		System.out.println("El numero es impar");
	}
	
	
		 
	}

}
