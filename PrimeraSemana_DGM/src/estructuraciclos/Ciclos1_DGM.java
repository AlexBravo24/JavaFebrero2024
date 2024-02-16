package estructuraciclos;

import java.util.Scanner;

public class Ciclos1_DGM {

	public static void main(String[] args) {
		//1.- Programa un algoritmo que realice la tabla de multiplicar del 12

	int Numero;
	int Multi;
	int X;
	
	Scanner Entrada = new Scanner(System.in);
	
	System.out.print("Digite el numero 12: ");
	Numero = Entrada.nextInt();
	
	for(X = 1; X <= 10; X++) {
		
		if(Numero == 12) {
			Multi = Numero * X;
			System.out.println("La multiplicacion de " +Numero+ " * " +X+ " es :" +Multi);
		}
	}
	
	while (Numero != 12) {
		System.out.println("Digita el numero 12");
	}	
	}
}
