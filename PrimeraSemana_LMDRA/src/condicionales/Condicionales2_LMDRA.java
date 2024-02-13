package condicionales;

import java.util.Scanner;

public class Condicionales2_LMDRA {

	public static void main(String[] args) {
		//Evalua si un numero es par o impar 
		int num1;
		Scanner input = new Scanner(System.in);
		//Solicitamos al usuario el numero a evaluar
		System.out.println("Veamos si el número que tienes es par o impar");
		System.out.println("Ingresa el número: ");
		num1 = input.nextInt();
		//Se utiliza un if para evaluar las condiciones
		//Nos ayudamos del remanente para verificar si es par o impar
		if (num1 % 2 ==0) {
			System.out.println("El número "+num1+" es par");
		}else {
			System.out.println("El número "+num1+" es impar");
		}
	}

}
