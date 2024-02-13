package estructuraciclos;

import java.util.Scanner;

public class Ciclos2_DGM {

	public static void main(String[] args) {
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteración deseada por el usuario. 
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ??

	int Numero;
	int Final;
	int X;
	int Multi;
	
	Scanner Entrada = new Scanner(System.in);
	
	System.out.print("Digite el numero de la tabla que desea: ");
	Numero = Entrada.nextInt();
	
	System.out.print("Digite hasta que numero desea la multiplicacion: ");
	Final = Entrada.nextInt();
	
	for (X= 1 ; X <=Final; X++){
		Multi = Numero * X;
		System.out.println("LA multiplicacion de "+Numero+ " * " +X+ " es : " +Multi);
	}
	
	
	
	
	}
}
