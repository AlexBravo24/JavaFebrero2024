package condicionales;

import java.util.Scanner;

public class Condicionales3_AJG {
	
	public static void main(String[] args) {
//		3.Crea un programa que pida al usuario dos n�meros y muestre el resultado 
//		de su divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error
		
		int valor1;
		int valor2;
		//double division;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Introduce el valor1");
		valor1 = input.nextInt();
		
		System.out.println("Introduce el valor2");
		valor2 = input.nextInt();
		
		if (valor2 == 0) {
			System.out.println("ERROR");
		}else {
			//division = (double) valor1 / valor2;
			System.out.println("eL RESULTADO DE LA DIVISION ES: " + ((double) valor1 / valor2));
		}
	}

}
