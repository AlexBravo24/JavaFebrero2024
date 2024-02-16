package condicionales;

import java.util.Scanner;

public class Condicionales3_JAVM {

	public static void main(String[] args) {
		// 	3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el segundo número es 0,
		//debe mostrar un mensaje de error.

		Scanner input = new Scanner (System.in);
		System.out.println("Introduce un numero");
		double numero1 =  input.nextInt();
		System.out.println("Introduce un segundo numero");
		double numero2 =  input.nextInt();
		
		if(numero2 == 0) {
			System.out.println("error no se puede dividir entre cero");
		}else {
			double resultado = numero1 / numero2;
			System.out.println("el resultado es:"+ resultado);
		}
		
		
		
		
		
		}
		}
